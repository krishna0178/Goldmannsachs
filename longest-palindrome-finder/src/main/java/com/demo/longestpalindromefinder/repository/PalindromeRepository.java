package com.demo.longestpalindromefinder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.longestpalindromefinder.entity.LargestPalindromeData;

@Repository
public interface PalindromeRepository extends JpaRepository<LargestPalindromeData, String>{

}
