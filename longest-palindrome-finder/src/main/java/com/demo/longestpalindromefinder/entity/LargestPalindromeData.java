package com.demo.longestpalindromefinder.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "largestPalindromeData")
@Table(name = "largestPalindromeData", schema= "public")
public class LargestPalindromeData {

	@Id
	private String input;

	private int length;
	
	
	public LargestPalindromeData() {
		
	}
	public LargestPalindromeData(String input, int length) {
		super();
		this.input = input;
		this.length = length;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
}
