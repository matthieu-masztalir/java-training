package com.training.java.httpclient;

public class AuthorizationResponse {

    public AuthorizationResponse() {

    }

    private boolean authenticated;

    public boolean isAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }
}
