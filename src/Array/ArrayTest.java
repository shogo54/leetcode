package Array;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ArrayTest {

	@Test
	void testJumpGame() throws Exception {
		assertTrue(new JumpGame().canJump(new int[]{2,3,1,1,4}));
		assertFalse(new JumpGame().canJump(new int[]{3,2,1,0,4}));
	}
	
	@Test
	void testIntersectionOfTwoArrays() throws Exception {
		assertArrayEquals(new int[] {2}, new IntersectionOfTwoArrays().intersection(new int[] {1,2,2,1}, new int[] {2,2}));
		
		int[] expected = new int[] {9,4};
		int[] actual = new IntersectionOfTwoArrays().intersection(new int[] {4,9,5}, new int[] {9,4,9,8,4});
		Arrays.sort(expected);
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void testTwoSum() throws Exception{
		assertArrayEquals(new int[] {0,1}, new TwoSum().twoSum(new int[] {2, 7, 11, 15}, 9));
	}
	
	@Test
	void testTopKFrequentElements() throws Exception{
		assertEquals(Arrays.asList(1,2), new TopKFrequentElements().topKFrequent(new int[] {1,1,1,2,2,3}, 2));
		assertEquals(Arrays.asList(1), new TopKFrequentElements().topKFrequent(new int[] {1}, 1));
		assertEquals(Arrays.asList(-1,2), new TopKFrequentElements().topKFrequent(new int[] {4,1,-1,2,-1,2,3}, 2));
	}
	
	@Test
	void testContainsDuplicate() throws Exception{
		assertTrue(new ContainsDuplicate().containsDuplicate(new int[] {1,2,3,1}));
		assertFalse(new ContainsDuplicate().containsDuplicate(new int[] {1,2,3,4}));
		assertTrue(new ContainsDuplicate().containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));
	}
	
}
