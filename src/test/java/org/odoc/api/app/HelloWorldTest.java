package org.odoc.api.app;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = HelloWorld.class)
public class HelloWorldTest {

    @Autowired
    private MockMvc mvc;

    @Test
    @DisplayName("Hello Word Controller Test")
    public void index() throws Exception {
        String message = "Hello World";

        mvc.perform(get("/")).andExpect(status().isOk()).andExpect(content().string(message));
    }

}