package com.sandersgutierrez.resume;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ResumeApplicationTest {
    @Test
    void appHasAGreeting() {
        ResumeApplication classMocked = mock(ResumeApplication.class);
        when(classMocked.getGreeting("Sanders")).thenReturn("Hello Sanders!");
        assertEquals("Hello Sanders!", classMocked.getGreeting("Sanders"));
        verify(classMocked, times(1)).getGreeting("Sanders");
    }
}
