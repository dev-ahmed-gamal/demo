package com.starz.arabia.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import com.starz.arabia.demo.data.DataCollection;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.http.MediaType;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import java.nio.charset.Charset;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	
	protected MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));	
	
	private MockMvc mockMvc;
	
	@Autowired
	protected WebApplicationContext webApplicationContext;
	
	@Before
    public void setup() throws Exception {
        this.mockMvc = webAppContextSetup(webApplicationContext)
        		.build();

    }
	@Test
	public void contextLoads() {
		Assert.assertEquals(4, DataCollection.entries.size());
	}
	
	@Test
	public void testCensoredWithFilter() throws Exception{
		mockMvc.perform(get("/media?filter=censoring&level=censored")
			      .contentType(MediaType.APPLICATION_JSON))
			      .andExpect(status().isOk())
			      .andExpect(jsonPath("$", hasSize(1)))
			      ;
	}
	@Test
	public void testUnCensoredWithFilter() throws Exception{		
		mockMvc.perform(get("/media?filter=censoring&level=uncensored")
			      .contentType(MediaType.APPLICATION_JSON))
			      .andExpect(status().isOk())
			      .andExpect(jsonPath("$", hasSize(1)))
			      ;
	}
	@Test
	public void testcensoredWithoutFilter() throws Exception{
		mockMvc.perform(get("/media?level=censored")
			      .contentType(MediaType.APPLICATION_JSON))
			      .andExpect(status().isOk())
			      .andExpect(jsonPath("$", hasSize(0)))
			      ;
	}
	@Test
	public void testUncensoredWithoutFilter() throws Exception{
		mockMvc.perform(get("/media?level=uncensored")
			      .contentType(MediaType.APPLICATION_JSON))
			      .andExpect(status().isOk())
			      .andExpect(jsonPath("$", hasSize(4)))
			      ;
	}
	@Test
	public void testUncensoredEmptyValue() throws Exception{
		mockMvc.perform(get("/media?level=")
			      .contentType(MediaType.APPLICATION_JSON))
			      .andExpect(status().isOk())
			      .andExpect(jsonPath("$", hasSize(4)))
			      ;
	}
	@Test
	public void testWihoutParameter() throws Exception{
		mockMvc.perform(get("/media")
			      .contentType(MediaType.APPLICATION_JSON))
			      .andExpect(status().isOk())
			      .andExpect(jsonPath("$", hasSize(0)))
			      ;
	}
}
