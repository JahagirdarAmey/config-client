package com.amey.configclient;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by USER on 08/12/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class LuckyWorldControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(new LuckyWorldController()).build();
    }
    @Test
    public void showInternalServerErrorPage() throws Exception {
        mockMvc.perform(get("/lucky-word"))
                .andExpect(status().isOk());
    }

}