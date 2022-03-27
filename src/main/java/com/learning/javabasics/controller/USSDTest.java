package com.learning.javabasics.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class USSDTest {

	@GetMapping(value = "/ussd", params = { "msisdn", "input", "newrequest" })
	public ResponseEntity<?> ussdHandler(@RequestParam(value = "msisdn") String msisdn,
			@RequestParam(value = "input") String input, @RequestParam(value = "newrequest") String isnewrequest) {
		
		String response = "Welcome to USSD Test \n1)Kinyarwanda\n2)English";
		
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
