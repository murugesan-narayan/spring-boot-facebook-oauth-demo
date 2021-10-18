package com.muru.dcb.facebook.oauth.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(@AuthenticationPrincipal OAuth2User principal) {
        String name = principal.getAttribute("name");
        return "Hello " + name + "! Welcome to Home page with facebook oauth2.";
    }
}
