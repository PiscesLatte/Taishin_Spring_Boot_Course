package com.pisceslatte.demo;

import com.pisceslatte.demo.controllers.RootController;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private RootController rootController;

	@BeforeEach
	public void prepareData(){
		System.out.println("prepare some data..");
	}

	@Test
	public void doTestA() {
		assertThat(rootController).isNotNull();
	}

	@Test
	public void doTestB() {
		System.out.println("do TestB");
	}

	@AfterEach
	public void recordData(){
		System.out.println("record test result data..");
	}
}