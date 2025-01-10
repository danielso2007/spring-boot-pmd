package com.example.pmd.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.junit.jupiter.api.Assertions.assertEquals;

@WebMvcTest(HelloController.class)
@ExtendWith(MockitoExtension.class)
public class HelloControllerTest {

    @InjectMocks
    private HelloController helloController;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testIndexHandlesNullInput() {
        String result = helloController.index();
        assertEquals("Greetings from Spring Boot!", result);
    }

    @Test
    public void testIndexIsIdempotent() {
        String result1 = helloController.index();
        String result2 = helloController.index();
        assertEquals(result1, result2);
    }

    @Test
    public void testIndexReturnsGreetingMessage() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
               .andExpect(MockMvcResultMatchers.status().isOk())
               .andExpect(MockMvcResultMatchers.content().string("Greetings from Spring Boot!"));
    }

    @Test
    public void testIndexReturnsGreetingMessage_2() {
        String result = helloController.index();
        assertEquals("Greetings from Spring Boot!", result);
    }

}