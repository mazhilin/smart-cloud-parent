package com.smart.cloud.boot.utils;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import org.springframework.http.HttpMethod;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/**
 * @className: com.smart.cloud.boot.utils.OkHttpClientUtil
 * @title: 封装SmartCloud项目-OkHttpClientUtil类
 * @description: <p>
 *         SmartCloud项目-OkHttpClientUtil
 *         </p>
 * @content: OkHttpClient请求工具类
 * @author: Powered by marklin
 * @datetime: 2023-04-26 04:27
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@UtilityClass
@Slf4j
public class OkHttpClientUtil {

    private static final String HTTP_JSON = "application/json; charset=utf-8";
    private static final String HTTP_FORM = "application/x-www-form-urlencoded; charset=utf-8";

    private static final OkHttpClient httpClient = new OkHttpClient.Builder()
            .connectTimeout(120, TimeUnit.SECONDS)
            .readTimeout(120, TimeUnit.SECONDS)
            .writeTimeout(120, TimeUnit.SECONDS)
            .build();

    /**
     * get请求
     * 对于小文档，响应体上的string()方法非常方便和高效。
     * 但是，如果响应主体很大(大于1 MB)，则应避免string()，
     * 因为它会将整个文档加载到内存中。在这种情况下，将主体处理为流。
     *
     * @param url
     * @return
     */
    public static String httpGet(String url) {
        if (url == null || "".equals(url)) {
            log.error("url为null!");
            return "";
        }

        Request.Builder builder = new Request.Builder();
        Request request = builder.get().url(url).build();
        try {
            Response response = httpClient.newCall(request).execute();
            if (response.code() == 200) {
                log.info("http GET 请求成功; [url={}]", url);
                return response.body().string();
            } else {
                log.warn("Http GET 请求失败; [errorCode = {} , url={}]", response.code(), url);
            }
        } catch (IOException e) {
            throw new RuntimeException("同步http GET 请求失败,url:" + url, e);
        }
        return null;
    }

    public static String httpGet(String url, Map<String, String> headers) {
        if (CollectionUtils.isEmpty(headers)) {
            return httpGet(url);
        }

        Request.Builder builder = new Request.Builder();
        headers.forEach((String key, String value) -> builder.header(key, value));
        Request request = builder.get().url(url).build();
        try {
            Response response = httpClient.newCall(request).execute();
            if (response.code() == 200) {
                log.info("http GET 请求成功; [url={}]", url);
                return response.body().string();
            } else {
                log.warn("Http GET 请求失败; [errorxxCode = {} , url={}]", response.code(), url);
            }
        } catch (IOException e) {
            throw new RuntimeException("同步http GET 请求失败,url:" + url, e);
        }
        return null;
    }

    /**
     * 同步 POST调用 无Header
     *
     * @param url
     * @param json
     * @return
     */
    public static String httpPostJson(String url, String json) {
        if (url == null || "".equals(url)) {
            log.error("url为null!");
            return "";
        }

        MediaType JSON = MediaType.parse(HTTP_JSON);
        RequestBody body = RequestBody.create(JSON, json);
        Request.Builder requestBuilder = new Request.Builder().url(url);
        Request request = requestBuilder.post(body).build();
        try {
            Response response = httpClient.newCall(request).execute();
            if (response.code() == 200) {
                log.info("http Post 请求成功; [url={}, requestContent={}]", url, json);
                return response.body().string();
            } else {
                log.warn("Http POST 请求失败; [ errorCode = {}, url={}, param={}]", response.code(), url, json);
            }
        } catch (IOException e) {
            log.error("调用请求失败，URL：" + url, e);
            throw new RuntimeException("同步http请求失败,url:" + url, e);
        }
        return null;
    }

    /**
     * 同步 POST调用 有Header
     *
     * @param url
     * @param headers
     * @param json
     * @return
     */
    public static String httpPostJson(String url, Map<String, String> headers, String json) {
        if (CollectionUtils.isEmpty(headers)) {
            httpPostJson(url, json);
        }

        MediaType JSON = MediaType.parse(HTTP_JSON);
        RequestBody body = RequestBody.create(JSON, json);
        Request.Builder requestBuilder = new Request.Builder().url(url);
        headers.forEach((k, v) -> requestBuilder.addHeader(k, v));
        Request request = requestBuilder.post(body).build();
        try {
            Response response = httpClient.newCall(request).execute();
            if (response.code() == 200) {
                log.info("http Post 请求成功; [url={}, requestContent={}]", url, json);
                return response.body().string();
            } else {
                log.warn("Http POST 请求失败; [ errorCode = {}, url={}, param={}]", response.code(), url, json);
            }
        } catch (IOException e) {
            throw new RuntimeException("同步http请求失败,url:" + url, e);
        }
        return null;
    }

    /**
     * 提交表单
     * @param url
     * @param content
     * @param headers
     * @return
     */
    public static String postDataByForm(String url, String content, Map<String, String> headers) {
        MediaType JSON = MediaType.parse(HTTP_FORM);
        RequestBody body = RequestBody.create(JSON, content);

        Request.Builder requestBuilder = new Request.Builder().url(url);
        if (headers != null && headers.size() > 0) {
            headers.forEach((k, v) -> requestBuilder.addHeader(k, v));
        }
        Request request = requestBuilder
                .post(body)
                .build();

        Response response = null;
        try {
            response = httpClient.newCall(request).execute();
            if (response.code() == 200) {
                log.info("postDataByForm; [postUrl={}, requestContent={}, responseCode={}]", url, content, response.code());
                return response.body().string();
            } else {
                log.warn("Http Post Form请求失败,[url={}, param={}]", url, content);
            }
        } catch (IOException e) {
            log.error("Http Post Form请求失败,[url={}, param={}]", url, content, e);
            throw new RuntimeException("Http Post Form请求失败,url:" + url);
        }
        return null;
    }

    /**
     * 异步Http调用参考模板：Get、Post、Put
     * 需要异步调用的接口一般情况下你需要定制一个专门的Http方法
     *
     * @param httpMethod
     * @param url
     * @param content
     * @return
     */
    public static Future<Boolean> asyncHttpByJson(HttpMethod httpMethod, String url, Map<String, String> headers, String content) {
        MediaType JSON = MediaType.parse(HTTP_JSON);
        RequestBody body = RequestBody.create(JSON, content);

        Request.Builder requestBuilder = new Request.Builder()
                .url(url);

        if (!CollectionUtils.isEmpty(headers)) {
            headers.forEach((key, value) -> requestBuilder.header(key, value));
        }

        switch (httpMethod) {
            case GET:
                requestBuilder.get();
                break;
            case POST:
                requestBuilder.post(body);
                break;
            default:
        }

        Request request = requestBuilder.build();
        Call call = httpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                log.error("异步http {} 请求失败,[url={}, param={}]", httpMethod.name(), url, content);
                throw new RuntimeException("异步http请求失败,url:" + url);
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                if (response.code() == 200) {
                    System.out.println("需要加入异步回调操作");
                } else {
                    log.error("异步http {} 请求失败,错误码为{},请求参数为[url={}, param={}]", httpMethod.name(), response.code(), url, content);
                }
            }
        });
        return new AsyncResult<>(true);
    }

    /**
     * lambda表达式异步调用http模板,不建议使用
     *
     * @param request
     * @param failure
     * @param respConsumer
     */
    public static void asyncCall(Request request, Consumer<Exception> failure, Consumer<Response> respConsumer) {
        httpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                failure.accept(e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                respConsumer.accept(response);
            }
        });
    }

    //test
    public static void main(String[] args) {
        String url = "http://www.baidu.com";
        System.out.println(httpGet(url));
    }
}
