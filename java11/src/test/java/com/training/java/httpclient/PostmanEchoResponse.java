package com.training.java.httpclient;

import java.util.Map;

public class PostmanEchoResponse {
    public PostmanEchoResponse() {
    }

    private Map<String, String> args;

    private Map<String, String> headers;

    private String url;

    public Map<String, String> getArgs() {
        return args;
    }

    public void setArgs(Map<String, String> args) {
        this.args = args;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
