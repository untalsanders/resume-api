package io.github.untalsanders.resume.greeter.domain.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingServiceTests {

    @Test
    void greetShouldReturnMessageOfGreeting() {
        GreeterService service = new GreeterService();
        assertEquals("Hello Sanders!", service.greet("Sanders"));
    }
}
