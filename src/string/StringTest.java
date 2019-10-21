package string;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringTest {
	
	/**
	 * Test cases for 3. Longest Substring Without Repeating Characters
	 * @see LongestSubstringWithoutRepeatingCharacters
	 */
	@Test
	void testLongestSubstringWithoutRepeatingCharacters() throws Exception{
		LongestSubstringWithoutRepeatingCharacters tester = new LongestSubstringWithoutRepeatingCharacters();
		assertEquals(3, tester.lengthOfLongestSubstring("abcabcbb"));
		assertEquals(1, tester.lengthOfLongestSubstring("bbbbb"));
		assertEquals(3, tester.lengthOfLongestSubstring("pwwkew"));
		assertEquals(6, tester.lengthOfLongestSubstring("ohvhjdml"));
	}
	
	/**
	 * Test cases for 5. Longest Palindromic Substring
	 * @see LongestPalindromicSubstring
	 */
	@Test
	void testLongestPalindromicSubstring() throws Exception{
		assertEquals("bab", new LongestPalindromicSubstring().longestPalindrome("babad"));
		assertEquals("bb", new LongestPalindromicSubstring().longestPalindrome("cbbd"));
	}

	/**
	 * Test cases for 13. Roman to Integer
	 * @see RomanToInteger
	 */
	@Test
	void testRomanToInteger() throws Exception{
		assertEquals(3, new RomanToInteger().romanToInt("III"));
		assertEquals(4, new RomanToInteger().romanToInt("IV"));
		assertEquals(9, new RomanToInteger().romanToInt("IX"));
		assertEquals(58, new RomanToInteger().romanToInt("LVIII"));
		assertEquals(1994, new RomanToInteger().romanToInt("MCMXCIV"));
	}

	/**
	 * Test cases for 20. Valid Parentheses
	 * @see ValidPalindrome
	 */
	@Test
	void testValidPalindrome() throws Exception{
		assertTrue(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
		assertFalse(new ValidPalindrome().isPalindrome("race a car"));
		assertFalse(new ValidPalindrome().isPalindrome("0P"));
		assertTrue(new ValidPalindrome().isPalindrome("ab@a"));
	}
	
	/**
	 * Test cases for 76. Minimum Window Substring
	 * @see MinimumWindowSubstring
	 */
	@Test
	void testMinimumWindowSubstring() throws Exception{
		assertEquals("BANC", new MinimumWindowSubstring().minWindow("ADOBECODEBANC", "ABC"));
		assertEquals("BECODEBA", new MinimumWindowSubstring().minWindow("ADOBECODEBANC", "ABCB"));
		assertEquals("aa", new MinimumWindowSubstring().minWindow("aa", "aa"));
	}

	/**
	 * Test cases for 91. Decode Ways
	 * @see DecodeWays
	 */
	@Test
	void testDecodeWays() throws Exception{
		assertEquals(2, new DecodeWays().numDecodings("12"));
		assertEquals(3, new DecodeWays().numDecodings("226"));
		assertEquals(0, new DecodeWays().numDecodings("00"));
		assertEquals(0, new DecodeWays().numDecodings("01"));
	}

	/**
	 * Test cases for 125. Valid Palindrome
	 * @see ValidParentheses
	 */
	@Test
	void testValidParentheses() throws Exception{
		ValidParentheses tester = new ValidParentheses();
		assertTrue(tester.isValid("()"));
		assertTrue(tester.isValid("()[]{}"));
		assertFalse(tester.isValid("(]"));
		assertFalse(tester.isValid("([)]"));
		assertTrue(tester.isValid("{[]}"));

	}

	/**
	 * Test cases for 171. Excel Sheet Column Number
	 * @see ExcelSheetColumnNumber
	 */
	@Test
	void testExcelSheetColumnNumber() throws Exception{
		assertEquals(1, new ExcelSheetColumnNumber().titleToNumber("A"));
		assertEquals(28, new ExcelSheetColumnNumber().titleToNumber("AB"));
		assertEquals(701, new ExcelSheetColumnNumber().titleToNumber("ZY"));
		assertEquals(50835706, new ExcelSheetColumnNumber().titleToNumber("DGFHSL"));
	}

	/**
	 * Test cases for 208. Implement Trie (Prefix Tree)
	 * @see Trie
	 */
	@Test
	void testImplementTrie() throws Exception {
		Trie trie = new Trie();

		trie.insert("apple");
		assertTrue(trie.search("apple"));
		assertFalse(trie.search("app"));
		assertTrue(trie.startsWith("app"));
		trie.insert("app");
		assertTrue(trie.search("app"));
	}

	/**
	 * Test cases for 211. Add and Search Word - Data structure design
	 * @see AddAndSearchWordDataStructureDesign
	 */
	@Test
	void testAddAndSearchWordDataStructureDesign() throws Exception{
		AddAndSearchWordDataStructureDesign dict = new AddAndSearchWordDataStructureDesign();
		dict.addWord("bad");
		dict.addWord("dad");
		dict.addWord("mad");
		assertFalse(dict.search("pad"));
		assertTrue(dict.search("bad"));
		assertTrue(dict.search(".ad"));
		assertTrue(dict.search("b.."));
	}

	/**
	 * Test cases for 242. Valid Anagram
	 * @see ValidAnagram
	 */
	@Test
	void testValidAnagram() throws Exception{
		ValidAnagram tester = new ValidAnagram();
		assertTrue(tester.isAnagram("anagram", "nagaram"));
		assertFalse(tester.isAnagram("rat", "car"));
	}
	
	/**
	 * Test cases for 344. Reverse String
	 * @see ReverseString
	 */
	@Test
	void testReverseString() throws Exception{
		ReverseString tester = new ReverseString();
		char[] input = new char[] {'h','e','l','l','o'};
		tester.reverseString(input);
		assertArrayEquals(new char[] {'o','l','l','e','h'}, input);
		
		input = new char[] {'H','a','n','n','a','h'};
		tester.reverseString(input);
		assertArrayEquals(new char[] {'h','a','n','n','a','H'}, input);
	}

	/**
	 * Test cases for 424. Longest Repeating Character Replacement
	 * @see LongestRepeatingCharacterReplacement
	 */
	@Test
	void testLongestRepeatingCharacterReplacement() throws Exception{
		LongestRepeatingCharacterReplacement tester = new LongestRepeatingCharacterReplacement();
		assertEquals(4, tester.characterReplacement("ABAB", 2));
		assertEquals(4, tester.characterReplacement("AABABBA", 1));
		assertEquals(4, tester.characterReplacement("ABBB", 2));
		assertEquals(1, tester.characterReplacement("A", 2));
		assertEquals(0, tester.characterReplacement("", 2));
	}

	/**
	 * Test cases for 647. Palindromic Substrings
	 * @see PalindromicSubstrings
	 */
	@Test
	void testPalindromicSubstrings() throws Exception{
		assertEquals(3, new PalindromicSubstrings().countSubstrings("abc"));
		assertEquals(6, new PalindromicSubstrings().countSubstrings("aaa"));
		assertEquals(1, new PalindromicSubstrings().countSubstrings("a"));
		assertEquals(0, new PalindromicSubstrings().countSubstrings(""));
		assertEquals(12, new PalindromicSubstrings().countSubstrings("aabaaa"));
	}

	/**
	 * Test cases for 657. Robot Return to Origin
	 * @see RobotReturnToOrigin
	 * @see RobotReturnToOrigin2
	 */
	@Test
	void testRobotReturnToOrigin() throws Exception{
		//Test for RobotReturnToOrigin
		assertTrue(new RobotReturnToOrigin().judgeCircle("UD"));
		assertFalse(new RobotReturnToOrigin().judgeCircle("LL"));
		
		//Test for RobotReturnToOrigin2
		assertTrue(new RobotReturnToOrigin2().judgeCircle("UD"));
		assertFalse(new RobotReturnToOrigin2().judgeCircle("LL"));
	}

	/**
	 * Test cases for 1003. Check If Word Is Valid After Substitutions
	 * @see CheckIfWordIsValidAfterSubstitutions
	 */
	@Test
	void testCheckIfWordIsValidAfterSubstitutions() throws Exception{
		CheckIfWordIsValidAfterSubstitutions checker = new CheckIfWordIsValidAfterSubstitutions();
		assertTrue(checker.isValid("aabcbc"));
		assertTrue(checker.isValid("abcabcababcc"));
		assertFalse(checker.isValid("abccba"));
		assertFalse(checker.isValid("cababc"));
	}

	/**
	 * Test cases for 1047. Remove All Adjacent Duplicates In String
	 * @see RemoveAllAdjacentDuplicatesInString
	 */
	@Test
	void testRemoveAllAdjacentDuplicatesInString() throws Exception{
		RemoveAllAdjacentDuplicatesInString tester = new RemoveAllAdjacentDuplicatesInString();
		assertEquals("ca", tester.removeDuplicates("abbaca"));
	}
	
	/**
	 * Test cases for 1078. Occurrences After Bigram
	 * @see OccurrencesAfterBigram
	 */
	@Test
	void testOccurrencesAfterBigram() throws Exception{
		OccurrencesAfterBigram tester = new OccurrencesAfterBigram();
		assertArrayEquals(new String[] {"girl","student"}, tester.findOcurrences("alice is a good girl she is a good student", "a", "good"));
		assertArrayEquals(new String[] {"we", "rock"}, tester.findOcurrences("we will we will rock you", "we", "will"));
	}

}
