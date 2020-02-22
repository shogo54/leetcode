package string;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class StringTest {

	/**
	 * Test cases for 3. Longest Substring Without Repeating Characters
	 * 
	 * @see LongestSubstringWithoutRepeatingCharacters
	 */
	@Test
	void testLongestSubstringWithoutRepeatingCharacters() {
		LongestSubstringWithoutRepeatingCharacters tester = new LongestSubstringWithoutRepeatingCharacters();
		assertEquals(3, tester.lengthOfLongestSubstring("abcabcbb"));
		assertEquals(1, tester.lengthOfLongestSubstring("bbbbb"));
		assertEquals(3, tester.lengthOfLongestSubstring("pwwkew"));
		assertEquals(6, tester.lengthOfLongestSubstring("ohvhjdml"));
	}

	/**
	 * Test cases for 5. Longest Palindromic Substring
	 * 
	 * @see LongestPalindromicSubstring
	 */
	@Test
	void testLongestPalindromicSubstring() {
		assertEquals("bab", new LongestPalindromicSubstring().longestPalindrome("babad"));
		assertEquals("bb", new LongestPalindromicSubstring().longestPalindrome("cbbd"));
	}

	/**
	 * Test cases for 13. Roman to Integer
	 * 
	 * @see RomanToInteger
	 */
	@Test
	void testRomanToInteger() {
		assertEquals(3, new RomanToInteger().romanToInt("III"));
		assertEquals(4, new RomanToInteger().romanToInt("IV"));
		assertEquals(9, new RomanToInteger().romanToInt("IX"));
		assertEquals(58, new RomanToInteger().romanToInt("LVIII"));
		assertEquals(1994, new RomanToInteger().romanToInt("MCMXCIV"));
	}

	/**
	 * Test cases for 17. Letter Combinations of a Phone Number
	 * 
	 * @see LetterCombinationsOfAPhoneNumber
	 */
	@Test
	void testLetterCombinationsOfAPhoneNumber() {
		assertEquals(new ArrayList<String>(), new LetterCombinationsOfAPhoneNumber().letterCombinations(""));
		assertEquals(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),
				new LetterCombinationsOfAPhoneNumber().letterCombinations("23"));
		assertEquals(Arrays.asList("w", "x", "y", "z"), new LetterCombinationsOfAPhoneNumber().letterCombinations("9"));
	}

	/**
	 * Test cases for 20. Valid Parentheses
	 * 
	 * @see ValidPalindrome
	 */
	@Test
	void testValidPalindrome() {
		assertTrue(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
		assertFalse(new ValidPalindrome().isPalindrome("race a car"));
		assertFalse(new ValidPalindrome().isPalindrome("0P"));
		assertTrue(new ValidPalindrome().isPalindrome("ab@a"));
	}

	/**
	 * Test cases for 32. Longest Valid Parentheses
	 * 
	 * @see LongestValidParentheses
	 */
	@Test
	void testLongestValidParentheses() {
		assertEquals(2, new LongestValidParentheses().longestValidParentheses("(()"));
		assertEquals(4, new LongestValidParentheses().longestValidParentheses(")()())"));
		assertEquals(0, new LongestValidParentheses().longestValidParentheses(""));
		assertEquals(0, new LongestValidParentheses().longestValidParentheses("("));
		assertEquals(0, new LongestValidParentheses().longestValidParentheses(")"));
		assertEquals(2, new LongestValidParentheses().longestValidParentheses("()"));
		assertEquals(2, new LongestValidParentheses().longestValidParentheses("()(()"));
		assertEquals(22, new LongestValidParentheses().longestValidParentheses("((((((())))(()))()))())"));
	}

	/**
	 * Test cases for 76. Minimum Window Substring
	 * 
	 * @see MinimumWindowSubstring
	 */
	@Test
	void testMinimumWindowSubstring() {
		assertEquals("BANC", new MinimumWindowSubstring().minWindow("ADOBECODEBANC", "ABC"));
		assertEquals("BECODEBA", new MinimumWindowSubstring().minWindow("ADOBECODEBANC", "ABCB"));
		assertEquals("aa", new MinimumWindowSubstring().minWindow("aa", "aa"));
	}

	/**
	 * Test cases for 91. Decode Ways
	 * 
	 * @see DecodeWays
	 */
	@Test
	void testDecodeWays() {
		assertEquals(2, new DecodeWays().numDecodings("12"));
		assertEquals(3, new DecodeWays().numDecodings("226"));
		assertEquals(0, new DecodeWays().numDecodings("00"));
		assertEquals(0, new DecodeWays().numDecodings("01"));
	}

	/**
	 * Test cases for 125. Valid Palindrome
	 * 
	 * @see ValidParentheses
	 */
	@Test
	void testValidParentheses() {
		ValidParentheses tester = new ValidParentheses();
		assertTrue(tester.isValid("()"));
		assertTrue(tester.isValid("()[]{}"));
		assertFalse(tester.isValid("(]"));
		assertFalse(tester.isValid("([)]"));
		assertTrue(tester.isValid("{[]}"));

	}

	/**
	 * Test cases for 127. Word Ladder
	 * 
	 * @see WordLadder
	 */
	@Test
	void testWordLadder() {
		List<String> list = new ArrayList<String>();
		list.addAll(Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));
		assertEquals(5, new WordLadder().ladderLength("hit", "cog", list));

		list.clear();
		list.addAll(Arrays.asList("hot", "dot", "dog", "lot", "log"));
		assertEquals(0, new WordLadder().ladderLength("hit", "cog", list));

		list.clear();
		list.addAll(Arrays.asList("ts", "sc", "ph", "ca", "jr", "hf", "to", "if", "ha", "is", "io", "cf", "ta"));
		assertEquals(4, new WordLadder().ladderLength("ta", "if", list));

		list.clear();
		list.addAll(Arrays.asList("b", "c"));
		assertEquals(2, new WordLadder().ladderLength("a", "c", list));
	}

	/**
	 * Test cases for 171. Excel Sheet Column Number
	 * 
	 * @see ExcelSheetColumnNumber
	 */
	@Test
	void testExcelSheetColumnNumber() {
		assertEquals(1, new ExcelSheetColumnNumber().titleToNumber("A"));
		assertEquals(28, new ExcelSheetColumnNumber().titleToNumber("AB"));
		assertEquals(701, new ExcelSheetColumnNumber().titleToNumber("ZY"));
		assertEquals(50835706, new ExcelSheetColumnNumber().titleToNumber("DGFHSL"));
	}

	/**
	 * Test cases for 208. Implement Trie (Prefix Tree)
	 * 
	 * @see Trie
	 */
	@Test
	void testImplementTrie() {
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
	 * 
	 * @see AddAndSearchWordDataStructureDesign
	 */
	@Test
	void testAddAndSearchWordDataStructureDesign() {
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
	 * Test cases for 227. Basic Calculator II
	 * 
	 * @see BasicCalculatorII
	 */
	@Test
	void testBasicCalculatorII() {
		assertEquals(7, new BasicCalculatorII().calculate("3+2*2"));
		assertEquals(1, new BasicCalculatorII().calculate(" 3/2 "));
		assertEquals(5, new BasicCalculatorII().calculate(" 3+5 / 2 "));
	}

	/**
	 * Test cases for 242. Valid Anagram
	 * 
	 * @see ValidAnagram
	 */
	@Test
	void testValidAnagram() {
		ValidAnagram tester = new ValidAnagram();
		assertTrue(tester.isAnagram("anagram", "nagaram"));
		assertFalse(tester.isAnagram("rat", "car"));
	}

	/**
	 * Test cases for 344. Reverse String
	 * 
	 * @see ReverseString
	 */
	@Test
	void testReverseString() {
		ReverseString tester = new ReverseString();
		char[] input = new char[] { 'h', 'e', 'l', 'l', 'o' };
		tester.reverseString(input);
		assertArrayEquals(new char[] { 'o', 'l', 'l', 'e', 'h' }, input);

		input = new char[] { 'H', 'a', 'n', 'n', 'a', 'h' };
		tester.reverseString(input);
		assertArrayEquals(new char[] { 'h', 'a', 'n', 'n', 'a', 'H' }, input);
	}

	/**
	 * Test cases for 387. First Unique Character in a String
	 * 
	 * @see FirstUniqueCharacterInAString
	 */
	@Test
	void testFirstUniqueCharacterInAString() {
		FirstUniqueCharacterInAString tester = new FirstUniqueCharacterInAString();
		assertEquals(0, tester.firstUniqChar("leetcode"));
		assertEquals(2, tester.firstUniqChar("loveleetcode"));
		assertEquals(-1, tester.firstUniqChar("aabbcc"));
		assertEquals(6, tester.firstUniqChar("aabbccd"));
		assertEquals(0, tester.firstUniqChar("a"));
		assertEquals(-1, tester.firstUniqChar(""));
	}

	/**
	 * Test cases for 389. Find the Difference
	 * 
	 * @see FindTheDifference
	 */
	@Test
	void testFindTheDifference() {
		String s = "abcd";
		String t = "abcde";
		assertEquals('e', new FindTheDifference().findTheDifference(s, t));
		
		s = "abcd";
		t = "acedb";
		assertEquals('e', new FindTheDifference().findTheDifference(s, t));
		
		s = "abbbcde";
		t = "ebbbabdc";
		assertEquals('b', new FindTheDifference().findTheDifference(s, t));
		
		s = "";
		t = "c";
		assertEquals('c', new FindTheDifference().findTheDifference(s, t));
	}

	/**
	 * Test cases for 394. Decode String
	 * 
	 * @see DecodeString
	 */
	@Test
	void testDecodeString() {
		assertEquals("aaabcbc", new DecodeString().decodeString("3[a]2[bc]"));
		assertEquals("accaccacc", new DecodeString().decodeString("3[a2[c]]"));
		assertEquals("abcabccdcdcdef", new DecodeString().decodeString("2[abc]3[cd]ef"));
		assertEquals("absabcabccdcdcdef", new DecodeString().decodeString("abs2[abc]3[cd]ef"));
		assertEquals("f", new DecodeString().decodeString("f"));
		assertEquals("", new DecodeString().decodeString(""));
		assertEquals("abababababababababababab", new DecodeString().decodeString("12[ab]"));
	}

	/**
	 * Test cases for 424. Longest Repeating Character Replacement
	 * 
	 * @see LongestRepeatingCharacterReplacement
	 */
	@Test
	void testLongestRepeatingCharacterReplacement() {
		LongestRepeatingCharacterReplacement tester = new LongestRepeatingCharacterReplacement();
		assertEquals(4, tester.characterReplacement("ABAB", 2));
		assertEquals(4, tester.characterReplacement("AABABBA", 1));
		assertEquals(4, tester.characterReplacement("ABBB", 2));
		assertEquals(1, tester.characterReplacement("A", 2));
		assertEquals(0, tester.characterReplacement("", 2));
	}

	/**
	 * Test cases for 438. Find All Anagrams in a String
	 * 
	 * @see FindAllAnagramsInAString
	 */
	@Test
	void testFindAllAnagramsInAString() {
		List<Integer> actual = new FindAllAnagramsInAString().findAnagrams("cbaebabacd", "abc");
		List<Integer> expected = Arrays.asList(0, 6);
		assertEquals(expected.size(), actual.size());
		assertEquals(new HashSet<Integer>(expected), new HashSet<Integer>(actual));

		actual = new FindAllAnagramsInAString().findAnagrams("abab", "ab");
		expected = Arrays.asList(0, 1, 2);
		assertEquals(expected.size(), actual.size());
		assertEquals(new HashSet<Integer>(expected), new HashSet<Integer>(actual));

		actual = new FindAllAnagramsInAString().findAnagrams("", "abc");
		expected = Arrays.asList();
		assertEquals(expected.size(), actual.size());
		assertEquals(new HashSet<Integer>(expected), new HashSet<Integer>(actual));

		actual = new FindAllAnagramsInAString().findAnagrams("baa", "aa");
		expected = Arrays.asList(1);
		assertEquals(expected.size(), actual.size());
		assertEquals(new HashSet<Integer>(expected), new HashSet<Integer>(actual));

		actual = new FindAllAnagramsInAString().findAnagrams("baa", "aa");
		expected = Arrays.asList(1);
		assertEquals(expected.size(), actual.size());
		assertEquals(new HashSet<Integer>(expected), new HashSet<Integer>(actual));

		actual = new FindAllAnagramsInAString().findAnagrams("bpaa", "aa");
		expected = Arrays.asList(2);
		assertEquals(expected.size(), actual.size());
		assertEquals(new HashSet<Integer>(expected), new HashSet<Integer>(actual));
	}

	/**
	 * Test cases for 647. Palindromic Substrings
	 * 
	 * @see PalindromicSubstrings
	 */
	@Test
	void testPalindromicSubstrings() {
		assertEquals(3, new PalindromicSubstrings().countSubstrings("abc"));
		assertEquals(6, new PalindromicSubstrings().countSubstrings("aaa"));
		assertEquals(1, new PalindromicSubstrings().countSubstrings("a"));
		assertEquals(0, new PalindromicSubstrings().countSubstrings(""));
		assertEquals(12, new PalindromicSubstrings().countSubstrings("aabaaa"));
	}

	/**
	 * Test cases for 657. Robot Return to Origin
	 * 
	 * @see RobotReturnToOrigin
	 * @see RobotReturnToOrigin2
	 */
	@Test
	void testRobotReturnToOrigin() {
		// Test for RobotReturnToOrigin
		assertTrue(new RobotReturnToOrigin().judgeCircle("UD"));
		assertFalse(new RobotReturnToOrigin().judgeCircle("LL"));

		// Test for RobotReturnToOrigin2
		assertTrue(new RobotReturnToOrigin2().judgeCircle("UD"));
		assertFalse(new RobotReturnToOrigin2().judgeCircle("LL"));
	}

	/**
	 * Test cases for 917. Reverse Only Letters
	 * 
	 * @see ReverseOnlyLetters
	 */
	void testReverseOnlyLetters() {
		assertEquals("dc-ba", new ReverseOnlyLetters().reverseOnlyLetters("ab-cd"));
		assertEquals("j-Ih-gfE-dCba", new ReverseOnlyLetters().reverseOnlyLetters("a-bC-dEf-ghIj"));
		assertEquals("Qedo1ct-eeLg=ntse-T!", new ReverseOnlyLetters().reverseOnlyLetters("Test1ng-Leet=code-Q!"));
		assertEquals("e", new ReverseOnlyLetters().reverseOnlyLetters("e"));
		assertEquals("", new ReverseOnlyLetters().reverseOnlyLetters(""));
		assertEquals("-", new ReverseOnlyLetters().reverseOnlyLetters("-"));
	}

	/**
	 * Test cases for 1003. Check If Word Is Valid After Substitutions
	 * 
	 * @see CheckIfWordIsValidAfterSubstitutions
	 * @see CheckIfWordIsValidAfterSubstitutions2
	 */
	@Test
	void testCheckIfWordIsValidAfterSubstitutions() {
		//
		// Test for CheckIfWordIsValidAfterSubstitutions
		//
		CheckIfWordIsValidAfterSubstitutions checker = new CheckIfWordIsValidAfterSubstitutions();
		assertTrue(checker.isValid("aabcbc"));
		assertTrue(checker.isValid("abcabcababcc"));
		assertFalse(checker.isValid("abccba"));
		assertFalse(checker.isValid("cababc"));
		assertFalse(checker.isValid("cba"));
		assertFalse(checker.isValid("bca"));
		assertFalse(checker.isValid("c"));
		assertFalse(checker.isValid("z"));
		assertFalse(checker.isValid("abz"));
		assertTrue(checker.isValid(""));

		//
		// Test for CheckIfWordIsValidAfterSubstitutions2
		//
		CheckIfWordIsValidAfterSubstitutions2 checker2 = new CheckIfWordIsValidAfterSubstitutions2();
		assertTrue(checker2.isValid("aabcbc"));
		assertTrue(checker2.isValid("abcabcababcc"));
		assertFalse(checker2.isValid("abccba"));
		assertFalse(checker2.isValid("cababc"));
		assertFalse(checker2.isValid("cba"));
		assertFalse(checker2.isValid("bca"));
		assertFalse(checker2.isValid("c"));
		assertFalse(checker2.isValid("z"));
		assertFalse(checker2.isValid("abz"));
		assertTrue(checker2.isValid(""));
	}

	/**
	 * Test cases for 1047. Remove All Adjacent Duplicates In String
	 * 
	 * @see RemoveAllAdjacentDuplicatesInString
	 */
	@Test
	void testRemoveAllAdjacentDuplicatesInString() {
		RemoveAllAdjacentDuplicatesInString tester = new RemoveAllAdjacentDuplicatesInString();
		assertEquals("ca", tester.removeDuplicates("abbaca"));
	}

	/**
	 * Test cases for 1078. Occurrences After Bigram
	 * 
	 * @see OccurrencesAfterBigram
	 */
	@Test
	void testOccurrencesAfterBigram() {
		OccurrencesAfterBigram tester = new OccurrencesAfterBigram();
		assertArrayEquals(new String[] { "girl", "student" },
				tester.findOcurrences("alice is a good girl she is a good student", "a", "good"));
		assertArrayEquals(new String[] { "we", "rock" },
				tester.findOcurrences("we will we will rock you", "we", "will"));
	}

}
