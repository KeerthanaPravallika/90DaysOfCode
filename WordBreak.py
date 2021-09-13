'''
Link : https://practice.geeksforgeeks.org/problems/word-break1352/1#
Given a string A and a dictionary of n words B, find out if A can be segmented into a space-separated sequence of dictionary words.

Note: From the dictionary B each word can be taken any number of times and in any order.
Example 1:

Input:
n = 12
B = { "i", "like", "sam",
"sung", "samsung", "mobile",
"ice","cream", "icecream",
"man", "go", "mango" }
A = "ilike"
Output:
1
Explanation:
The string can be segmented as "i like".
'''

def wordBreak(word, wordList):
    # Complete this function
	if word == '':
		return True
	else:
		wordLen = len(word)
		return any([(word[:i] in wordList) and wordBreak(word[i:],wordList) for i in range(1, wordLen+1)])
