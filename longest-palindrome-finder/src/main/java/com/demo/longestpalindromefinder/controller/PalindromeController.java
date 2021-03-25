package com.demo.longestpalindromefinder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.longestpalindromefinder.service.PalindromeService;

@RestController
@RequestMapping
public class PalindromeController {

	@Autowired  
	private PalindromeService palindromeService;
	
	@GetMapping("retrive")
	public int getOutput(@RequestParam String str) {
		return palindromeService.getOutput(str);
	}

	@PostMapping("save")
	public void findLongestPalindrom(@RequestBody String str) {
		palindromeService.findLongestPalindrom(str);
	}
	
}	
