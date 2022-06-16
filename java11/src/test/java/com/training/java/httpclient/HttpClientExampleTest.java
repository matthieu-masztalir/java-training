package com.training.java.httpclient;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

class HttpClientExampleTest {
    private HttpClientExample httpClientExample;

    @BeforeEach
    void setUp() {
        httpClientExample = new HttpClientExample();
    }

    @Test
    void getPostmanEcho() throws URISyntaxException, IOException, InterruptedException {
        // When
        final PostmanEchoResponse postmanEchoResponse = httpClientExample.getPostmanEcho();

        // Then
        Assertions.assertEquals("https://postman-echo.com/get", postmanEchoResponse.getUrl());
    }

    @Test
    void getAsyncPostmanEcho() throws URISyntaxException, ExecutionException, InterruptedException {
        // When
        final CompletableFuture<PostmanEchoResponse> postmanEchoResponse = httpClientExample.getAsyncPostmanEcho();

        // Then
        Assertions.assertEquals("https://postman-echo.com/get", postmanEchoResponse.get().getUrl());
    }

    @Test
    void getPostmanEchoWithBasicAuth() throws URISyntaxException, IOException, InterruptedException {
        // When
        final AuthorizationResponse authorizationResponse = httpClientExample.getPostmanEchoWithBasicAuth();

        // Then
        Assertions.assertTrue(authorizationResponse.isAuthenticated());
    }
}