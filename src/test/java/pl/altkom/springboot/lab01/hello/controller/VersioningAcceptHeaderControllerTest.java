package pl.altkom.springboot.lab01.hello.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
class VersioningAcceptHeaderControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void should_return_v1_message() throws Exception {
        this.mockMvc.perform(get("/versioning/header/accept").accept("application/vnd.hello.versioning-v1+json"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Accept header versioning version 1"));
    }

    @Test
    void should_return_v2_message() throws Exception {
        this.mockMvc.perform(get("/versioning/header/accept").accept("application/vnd.hello.versioning-v2+json"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Accept header versioning version 2"));
    }
}