package com.appservice;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinaryDecimalPlayGround {

	private final static Logger logger = LoggerFactory.getLogger(BinaryDecimalPlayGround.class);
	private final static String ZERO="0";
	private final static String EIGHT_DIGIT="%8s";
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter number- ");  
		int input= sc.nextInt(); 
		
		logger.info("The Final Output in Decimal is {}", binaryReversal(String.valueOf(input)));
	}

	private static int binaryReversal(String inputDecimal) {
		String binary=getBinaryFromDecimal(inputDecimal);
		logger.info("Binary {}", binary);
	
		String paddedBinaryString=addPadding(binary);
		logger.info("Padded Binary String {}", paddedBinaryString);

		String revseredString=reverseString(paddedBinaryString);
		logger.info("Revsered Binary String {}", revseredString);

		return getDecimalFromBinary(revseredString);
	}
	private static String reverseString(String input) {
		return new StringBuilder(input).reverse().toString();
	}
	private static int getDecimalFromBinary(String inputBinary) {
		return Integer.parseInt(inputBinary, 2);
	}
	private static String addPadding(String input) {
		return String.format(EIGHT_DIGIT, input).replace(" ", ZERO);
	}
	private static String getBinaryFromDecimal(String input) {
		return Integer.toBinaryString(Integer.parseInt(input));
	}

}
