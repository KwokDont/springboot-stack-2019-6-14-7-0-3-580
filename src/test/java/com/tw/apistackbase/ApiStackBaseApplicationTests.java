package com.tw.apistackbase;

import com.tw.apistackbase.controller.EmployeeController;
import com.tw.apistackbase.service.EmployeeService;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@WebMvcTest(EmployeeController.class)
public class ApiStackBaseApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	@Qualifier("employeeServiceImpl")
	private EmployeeService employeeService;

	@Test
	public void contextLoads() {
		
	}

}
