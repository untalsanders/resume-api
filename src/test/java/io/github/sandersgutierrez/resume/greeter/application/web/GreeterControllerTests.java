package io.github.sandersgutierrez.resume.greeter.application.web;

import io.github.sandersgutierrez.resume.greeter.domain.service.GreeterService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(GreeterController.class)
class GreeterControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private GreeterService service;

    @Test
    public void shouldReturnCustomMessage() throws Exception {
        String name = "Sanders";
        when(service.greet(name)).thenReturn("Hello " + name + "!");
        this.mockMvc.perform(get("/greeting").param("name", name))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().string(containsString("Hello " + name + "!")));
    }
}