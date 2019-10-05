package string;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void testCheckIfWordIsValidAfterSubstitutions() throws Exception{
		CheckIfWordIsValidAfterSubstitutions checker = new CheckIfWordIsValidAfterSubstitutions();
		assertTrue(checker.isValid("aabcbc"));
		assertTrue(checker.isValid("abcabcababcc"));
		assertFalse(checker.isValid("abccba"));
		assertFalse(checker.isValid("cababc"));
	}

	@Test
	void testOccurrencesAfterBigram() throws Exception{
		OccurrencesAfterBigram tester = new OccurrencesAfterBigram();
		assertArrayEquals(new String[] {"girl","student"}, tester.findOcurrences("alice is a good girl she is a good student", "a", "good"));
		assertArrayEquals(new String[] {"we", "rock"}, tester.findOcurrences("we will we will rock you", "we", "will"));
	}
	
	@Test
	void testRemoveAllAdjacentDuplicatesInString() throws Exception{
		RemoveAllAdjacentDuplicatesInString tester = new RemoveAllAdjacentDuplicatesInString();
		assertEquals("ca", tester.removeDuplicates("abbaca"));
	}
	
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
	
	@Test
	void testValidAnagram() throws Exception{
		ValidAnagram tester = new ValidAnagram();
		assertTrue(tester.isAnagram("anagram", "nagaram"));
		assertFalse(tester.isAnagram("rat", "car"));
	}
	
	@Test
	void testValidParentheses() throws Exception{
		ValidParentheses tester = new ValidParentheses();
		assertTrue(tester.isValid("()"));
		assertTrue(tester.isValid("()[]{}"));
		assertFalse(tester.isValid("(]"));
		assertFalse(tester.isValid("([)]"));
		assertTrue(tester.isValid("{[]}"));

	}
	
	@Test
	void testLongestSubstringWithoutRepeatingCharacters() throws Exception{
		LongestSubstringWithoutRepeatingCharacters tester = new LongestSubstringWithoutRepeatingCharacters();
		assertEquals(3, tester.lengthOfLongestSubstring("abcabcbb"));
		assertEquals(1, tester.lengthOfLongestSubstring("bbbbb"));
		assertEquals(3, tester.lengthOfLongestSubstring("pwwkew"));
		assertEquals(6, tester.lengthOfLongestSubstring("ohvhjdml"));
	}
	
	@Test
	void testValidPalindrome() throws Exception{
		assertTrue(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
		assertFalse(new ValidPalindrome().isPalindrome("race a car"));
		assertFalse(new ValidPalindrome().isPalindrome("0P"));
		assertTrue(new ValidPalindrome().isPalindrome("ab@a"));
	}
	
	@Test
	void testMinimumWindowSubstring() throws Exception{
		assertEquals("BANC", new MinimumWindowSubstring().minWindow("ADOBECODEBANC", "ABC"));
		assertEquals("BECODEBA", new MinimumWindowSubstring().minWindow("ADOBECODEBANC", "ABCB"));
		assertEquals("aa", new MinimumWindowSubstring().minWindow("aa", "aa"));
	}
	
	@Test
	void testDecodeWays() throws Exception{
		assertEquals(2, new DecodeWays().numDecodings("12"));
		assertEquals(3, new DecodeWays().numDecodings("226"));
		assertEquals(0, new DecodeWays().numDecodings("00"));
		assertEquals(0, new DecodeWays().numDecodings("01"));
	}
	
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
	
	@Test
	void testRomanToInteger() throws Exception{
		assertEquals(3, new RomanToInteger().romanToInt("III"));
		assertEquals(4, new RomanToInteger().romanToInt("IV"));
		assertEquals(9, new RomanToInteger().romanToInt("IX"));
		assertEquals(58, new RomanToInteger().romanToInt("LVIII"));
		assertEquals(1994, new RomanToInteger().romanToInt("MCMXCIV"));
	}
	
	@Test
	void testRobotReturnToOrigin() throws Exception{
		//Test for RobotReturnToOrigin
		assertTrue(new RobotReturnToOrigin().judgeCircle("UD"));
		assertFalse(new RobotReturnToOrigin().judgeCircle("LL"));
		
		//Test for RobotReturnToOrigin2
		assertTrue(new RobotReturnToOrigin2().judgeCircle("UD"));
		assertFalse(new RobotReturnToOrigin2().judgeCircle("LL"));
	}
	
}
