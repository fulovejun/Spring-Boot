package cn.hacz.edu.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
public class IndexControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void index() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/index")).andExpect(MockMvcResultMatchers.status().isOk());
    }

}