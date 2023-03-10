package com.example.firstjpautilization.controller;

import com.example.firstjpautilization.domain.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class TestController {

	private TestRepository testRepository;

}
