package com.example.firstjpautilization.controller;

import com.example.firstjpautilization.domain.TestRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestControllerTest {

	@Autowired
	TestRepository testRepository;

	@Test
	@Transactional
	public void test(){
		com.example.firstjpautilization.domain.Test test = new com.example.firstjpautilization.domain.Test();
		test.setName("test");

		testRepository.save(test);

		com.example.firstjpautilization.domain.Test test1 = testRepository.findById(test.getId()).orElse(null);

		Assertions.assertEquals(test.getId(),test1.getId());
	}
}