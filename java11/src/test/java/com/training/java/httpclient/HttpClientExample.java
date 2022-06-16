package com.training.java.httpclient;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class HttpClientExample {
    public PostmanEchoResponse getPostmanEcho() throws URISyntaxException, IOException, InterruptedException {
        final HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(new URI("https://postman-echo.com/get"))
                .GET()
                .build();

        final HttpResponse<String> response = HttpClient.newHttpClient()
                .send(httpRequest, HttpResponse.BodyHandlers.ofString());

        return new ObjectMapper().readValue(response.body(), PostmanEchoResponse.class);
    }

    /**
     * Use async call to postman echo resource
     *
     * @return {@link CompletableFuture}
     * @throws URISyntaxException error in resource URI
     */
    public CompletableFuture<PostmanEchoResponse> getAsyncPostmanEcho() throws URISyntaxException {
        final HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(new URI("https://postman-echo.com/get"))
                .GET()
                .build();

        return HttpClient.newHttpClient()
                .sendAsync(httpRequest, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenApply(s -> {
                    try {
                        return new ObjectMapper().readValue(s, PostmanEchoResponse.class);
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                });
    }

    /**
     * Use Basic authentication
     */
    public AuthorizationResponse getPostmanEchoWithBasicAuth() throws URISyntaxException, IOException, InterruptedException {
        final HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(new URI("https://postman-echo.com/basic-auth"))
                .header("Authorization", "Basic cG9zdG1hbjpwYXNzd29yZA==")
                .GET()
                .build();

        final HttpResponse<String> response = HttpClient.newHttpClient()
                .send(httpRequest, HttpResponse.BodyHandlers.ofString());

        return new ObjectMapper().readValue(response.body(), AuthorizationResponse.class);
    }
}
