package com.devopspractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsPracticecontroller {
@GetMapping(value="/getdocker")
public String get()
{
	return "my automation docker image";
}
}
