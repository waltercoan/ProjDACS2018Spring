package br.univille.projdacs2018spring;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import br.univille.projdacs2018spring.controller.HomeController;
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ProjDacs2018SpringApplicationTests {

	@Autowired
	private HomeController controller;
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void contextLoads() {
		assertThat(controller).isNotNull();
	}
	@Test
	public void homeControllerTest() throws Exception {
	//Teste do método index
	this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
	.andExpect(content().string(containsString("eu não acredito")));
	}

}
