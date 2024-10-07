package com.example.ci;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest(HelloController.class)  
public class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;  

    @Test
    public void testHello() throws Exception {
        mockMvc.perform(get("/hello"))  
               .andExpect(status().isOk())  
               .andExpect(content().string("Hello World"));
    }
    
    @Test
    public void testHi() throws Exception {
        mockMvc.perform(get("/hi"))  
               .andExpect(status().isOk())  
               .andExpect(content().string("Hi !!"));
    }
}
