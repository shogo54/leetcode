package string;

/**
 * @author Shogo Akiyama 
 * Solved on 10/08/2019
 * 
 * 171. Excel Sheet Column Number
 * https://leetcode.com/problems/excel-sheet-column-number/
 * Difficulty: Easy
 * 
 * Approach: Iteration
 * Runtime: 1 ms, faster than 99.98% of Java online submissions for Excel Sheet Column Number.
 * Memory Usage: 36 MB, less than 100.00% of Java online submissions for Excel Sheet Column Number.
 * 
 * @see StringTest#testExcelSheetColumnNumber()
 */
public class ExcelSheetColumnNumber {

	public int titleToNumber(String s) {
		int res = 0;
		int n = s.length();
		int curr = 0;
		for (int i = 0; i < n; i++) {
			curr = s.charAt(i) - 'A' + 1;
			res += curr * Math.pow(26, n - i - 1);
		}
		return res;
	}

}
