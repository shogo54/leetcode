package String;

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
	
}
