package io.github.sandersgutierrez.resume.greeter.domain.service;

import org.springframework.stereotype.Service;

@Service
public class GreeterService {
    private static final String TEMPLATE = "Hello %s!";

    public String greet(final String name) {
        return String.format(TEMPLATE, name);
    }
}
