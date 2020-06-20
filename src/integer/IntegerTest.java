package integer;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class IntegerTest {

	/**
	 * Test cases for 12. Integer to Roman
	 * 
	 * @see IntegerToRoman
	 */
	@Test
	void testIntegerToRoman() {
		assertEquals("III", new IntegerToRoman().intToRoman(3));
		assertEquals("IV", new IntegerToRoman().intToRoman(4));
		assertEquals("IX", new IntegerToRoman().intToRoman(9));
		assertEquals("LVIII", new IntegerToRoman().intToRoman(58));
		assertEquals("MCMXCIV", new IntegerToRoman().intToRoman(1994));
		assertEquals("MMMCMXCIX", new IntegerToRoman().intToRoman(3999));
	}

	/**
	 * Test cases for 22. Generate Parentheses
	 * 
	 * @see GenerateParentheses
	 */
	@Test
	void testGenerateParentheses() {
		assertEquals(Arrays.asList(""), new GenerateParentheses().generateParenthesis(0));
		assertEquals(Arrays.asList("()"), new GenerateParentheses().generateParenthesis(1));
		assertEquals(Arrays.asList("()()", "(())"), new GenerateParentheses().generateParenthesis(2));
		List<String> expected = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");
		List<String> actual = new GenerateParentheses().generateParenthesis(3);
		assertEquals(expected.size(), actual.size());
		assertEquals(new HashSet<String>(expected), new HashSet<String>(actual));
	}

	/**
	 * Test cases for 38. Count and Say
	 * 
	 * @see CountAndSay
	 */
	@Test
	void testCountAndSay() {
		assertEquals("1", new CountAndSay().countAndSay(1));
		assertEquals("11", new CountAndSay().countAndSay(2));
		assertEquals("21", new CountAndSay().countAndSay(3));
		assertEquals("1211", new CountAndSay().countAndSay(4));
		assertEquals("111221", new CountAndSay().countAndSay(5));
		assertEquals("111221", new CountAndSay().countAndSay(5));
		assertEquals("312211", new CountAndSay().countAndSay(6));
		assertEquals("13211311123113112211", new CountAndSay().countAndSay(10));
	}

	/**
	 * Test cases for 70. Climbing Stairs
	 * 
	 * @see ClimbingStairs
	 */
	@Test
	void testClimbingStairs() {
		assertEquals(2, new ClimbingStairs().climbStairs(2));
		assertEquals(3, new ClimbingStairs().climbStairs(3));
		assertEquals(5, new ClimbingStairs().climbStairs(4));
		assertEquals(8, new ClimbingStairs().climbStairs(5));
		assertEquals(10946, new ClimbingStairs().climbStairs(20));
	}

	/**
	 * Test cases for 77. Combinations
	 * 
	 * @see Combinations
	 * @see Combinations2
	 */
	@Test
	void testCombinations() {
		//
		// Test for Combinations
		//
		List<List<Integer>> actual = new Combinations().combine(4, 2);
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(1, 2));
		expected.add(Arrays.asList(1, 3));
		expected.add(Arrays.asList(1, 4));
		expected.add(Arrays.asList(2, 3));
		expected.add(Arrays.asList(2, 4));
		expected.add(Arrays.asList(3, 4));
		assertTrue(actual.size() == expected.size() && actual.containsAll(expected) && expected.containsAll(actual));

		actual = new Combinations().combine(1, 2);
		expected = new ArrayList<List<Integer>>();
		assertTrue(actual.size() == expected.size() && actual.containsAll(expected) && expected.containsAll(actual));

		actual = new Combinations().combine(3, 3);
		expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(1, 2, 3));
		assertTrue(actual.size() == expected.size() && actual.containsAll(expected) && expected.containsAll(actual));

		actual = new Combinations().combine(4, 1);
		expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(1));
		expected.add(Arrays.asList(2));
		expected.add(Arrays.asList(3));
		expected.add(Arrays.asList(4));
		assertTrue(actual.size() == expected.size() && actual.containsAll(expected) && expected.containsAll(actual));

		//
		// Test for Combinations2
		//
		actual = new Combinations2().combine(4, 2);
		expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(1, 2));
		expected.add(Arrays.asList(1, 3));
		expected.add(Arrays.asList(1, 4));
		expected.add(Arrays.asList(2, 3));
		expected.add(Arrays.asList(2, 4));
		expected.add(Arrays.asList(3, 4));
		assertTrue(actual.size() == expected.size() && actual.containsAll(expected) && expected.containsAll(actual));

		actual = new Combinations2().combine(1, 2);
		expected = new ArrayList<List<Integer>>();
		assertTrue(actual.size() == expected.size() && actual.containsAll(expected) && expected.containsAll(actual));

		actual = new Combinations2().combine(3, 3);
		expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(1, 2, 3));
		assertTrue(actual.size() == expected.size() && actual.containsAll(expected) && expected.containsAll(actual));

		actual = new Combinations2().combine(4, 1);
		expected = new ArrayList<List<Integer>>();
		expected.add(Arrays.asList(1));
		expected.add(Arrays.asList(2));
		expected.add(Arrays.asList(3));
		expected.add(Arrays.asList(4));
		assertTrue(actual.size() == expected.size() && actual.containsAll(expected) && expected.containsAll(actual));
	}

	/**
	 * Test cases for 96. Unique Binary Search Trees
	 * 
	 * @see UniqueBinarySearchTrees
	 */
	@Test
	void testUniqueBinarySearchTrees() {
		assertEquals(5, new UniqueBinarySearchTrees().numTrees(3));
		assertEquals(1, new UniqueBinarySearchTrees().numTrees(1));
		assertEquals(2, new UniqueBinarySearchTrees().numTrees(2));
		assertEquals(16796, new UniqueBinarySearchTrees().numTrees(10));
		assertEquals(1767263190, new UniqueBinarySearchTrees().numTrees(19));
	}

	/**
	 * Test cases for 202. Happy Number
	 * 
	 * @see HappyNumber
	 */
	@Test
	void testHappyNumber() {
		assertTrue(new HappyNumber().isHappy(19));
		assertTrue(new HappyNumber().isHappy(1));
		assertFalse(new HappyNumber().isHappy(0));
		assertFalse(new HappyNumber().isHappy(2));
		assertFalse(new HappyNumber().isHappy(20));
		assertFalse(new HappyNumber().isHappy(999));
	}

	/**
	 * Test cases for 278. First Bad Version
	 * 
	 * @see FirstBadVersion
	 */
	@Test
	void testFirstBadVersion() {
		assertEquals(4, new FirstBadVersion(4).firstBadVersion(5));
		assertEquals(5, new FirstBadVersion(5).firstBadVersion(5));
		assertEquals(3, new FirstBadVersion(3).firstBadVersion(5));
		assertEquals(2, new FirstBadVersion(2).firstBadVersion(5));
		assertEquals(1, new FirstBadVersion(1).firstBadVersion(5));

		assertEquals(4, new FirstBadVersion(4).firstBadVersion(4));
		assertEquals(3, new FirstBadVersion(3).firstBadVersion(4));
		assertEquals(2, new FirstBadVersion(2).firstBadVersion(4));
		assertEquals(1, new FirstBadVersion(1).firstBadVersion(4));

		assertEquals(1, new FirstBadVersion(1).firstBadVersion(2));
		assertEquals(2, new FirstBadVersion(2).firstBadVersion(2));

		assertEquals(1, new FirstBadVersion(1).firstBadVersion(1));
	}

	/**
	 * Test cases for 279. Perfect Squares
	 * 
	 * @see PerfectSquares
	 */
	@Test
	void testPerfectSquares() {
		assertEquals(3, new PerfectSquares().numSquares(12));
		assertEquals(2, new PerfectSquares().numSquares(13));
		assertEquals(0, new PerfectSquares().numSquares(0));
		assertEquals(1, new PerfectSquares().numSquares(1));
		assertEquals(1, new PerfectSquares().numSquares(4));
		assertEquals(4, new PerfectSquares().numSquares(99999));
	}

	/**
	 * Test cases for 412. Fizz Buzz
	 * 
	 * @see FizzBuzz
	 */
	@Test
	void testFizzBuzz() {
		assertEquals(Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13",
				"14", "FizzBuzz"), new FizzBuzz().fizzBuzz(15));
		assertEquals(Arrays.asList(), new FizzBuzz().fizzBuzz(0));
	}

}
