#Getting Started: longestpalindromefinder Service

In longestpalindromefinder we have 2 APIs

1. save longestpalindromefinder:
	Method Post


2. retrive longestpalindromefinder: 
	Method Get

The results are being stored in h2 database.

Logic
lps: Longest Palindrome SubString
Returns the length of the longest palindromic subsequence in seq.
It handles 3 cases:
Case 1: If there is only 1 character
Case 2: If there are only 2 characters and both are same 
Case 3: If the first and last characters match 

if no cases matches it recursively calls the same method with diff length

Prerequisite:
- java 8
- maven


Build:
mvn clean install


Run
java -jar target/longestpalindromefinder-0.0.1.jar


In order to test follow Below steps:

1. Save longestpalindromefinder:

curl --location --request POST 'http://localhost:8080/palindromefinder/save' \
--header 'Content-Type: application/json' \
--data-raw '91019'

2. retrive longestpalindromefinder: 

curl --location --request GET 'http://localhost:8080/palindromefinder/retrive?str=91019'
output: 5
