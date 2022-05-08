package com.example.demo.controller;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class ControllerForApi {

    // vraca{"message":"Invalid API key. Go to
    // https:\/\/docs.rapidapi.com\/docs\/keys for more info."}
    public void apii() throws UnirestException {
        Unirest.post("https://text-translator2.p.rapidapi.com/translate")
                .header("content-type", "application/x-www-form-urlencoded")
                .header("X-RapidAPI-Host", "text-translator2.p.rapidapi.com")
                .header("X-RapidAPI-Key", "feea51e1f8mshb59d11795041d0ep19bbe2jsne3a27e60ec21")
                .body("source_language=en&target_language=id&text=Hello%20World")
                .asString();
    }
}
