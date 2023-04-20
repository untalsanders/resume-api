package com.sandersgutierrez.resume.domain.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    private static final String TEMPLATE = "Hello %s!";

    public String greet(final String name) {
        return String.format(TEMPLATE, name);
    }
}
