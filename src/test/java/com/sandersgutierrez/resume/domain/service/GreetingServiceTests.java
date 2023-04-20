package com.sandersgutierrez.resume.domain.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingServiceTests {

    @Test
    void greetShouldReturnMessageOfGreeting() {
        GreetingService service = new GreetingService();
        assertEquals("Hello Sanders!", service.greet("Sanders"));
    }
}