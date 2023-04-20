package com.sandersgutierrez.resume.domain.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
class GreetingServiceTests {

    @MockBean
    private GreetingService service;

    @Test
    void greetShouldReturnMessageOfGreeting() {
        when(service.greet("Sanders")).thenReturn("Hello Sanders!");
        assertEquals("Hello Sanders!", service.greet("Sanders"));
        verify(service, times(1)).greet("Sanders");
    }
}