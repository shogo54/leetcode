package integer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntegerTest {

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

}
