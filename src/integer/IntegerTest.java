package integer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntegerTest {

	/**
	 * Test cases for 279. Perfect Squares
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
