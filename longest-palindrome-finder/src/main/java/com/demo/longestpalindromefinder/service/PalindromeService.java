package com.demo.longestpalindromefinder.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.longestpalindromefinder.entity.LargestPalindromeData;
import com.demo.longestpalindromefinder.exception.NoDataException;
import com.demo.longestpalindromefinder.repository.PalindromeRepository;

@Service
public class PalindromeService {

	@Autowired
	private PalindromeRepository palindromeRepository;

	private final Logger logger = LoggerFactory.getLogger(PalindromeService.class);

	public void findLongestPalindrom(String str) {
		logger.info("Finding Palindrom of {}", str);
		int lengthOfLongestPalindrom = lps(str.toCharArray(), 0, str.length() - 1);
		palindromeRepository.save(new LargestPalindromeData(str, lengthOfLongestPalindrom));
		logger.info("Successfully found Palindrom of ", str);
	}

	public int getOutput(String str) {
		logger.info("Getting longest Palindrom for {}", str);
		Optional<LargestPalindromeData> optionalPalindrome = palindromeRepository.findById(str);
		if (optionalPalindrome.isPresent()) {
			return optionalPalindrome.get().getLength();
		} else {
			logger.error("No Existing data for : {}", str);
			throw new NoDataException("No Existing data for" + str);
		}
	}

	private static int max(int x, int y) {
		return (x > y) ? x : y;
	}

	private static int lps(char seq[], int i, int j) {
		if (i == j) {
			return 1;
		}
		if (seq[i] == seq[j] && i + 1 == j) {
			return 2;
		}
		if (seq[i] == seq[j]) {
			return lps(seq, i + 1, j - 1) + 2;
		}
		return max(lps(seq, i, j - 1), lps(seq, i + 1, j));
	}

}
