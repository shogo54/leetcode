import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 06/15/2019
 * 
 * 1078. Occurrences After Bigram
 * https://leetcode.com/problems/occurrences-after-bigram/
 * Difficulty: Easy
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - String[] findOcurrences(String text, String first, String second).
 * 
 * Runtime: 1 ms, faster than 95.45% of Java online submissions for Occurrences After Bigram.
 * Memory Usage: 34.6 MB, less than 100.00% of Java online submissions for Occurrences After Bigram.
 * 
 */

public class OccurrencesAfterBigram {
	
	public String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<String>();
        String[] words = text.split(" ");
        for(int i=0; i<words.length-2; i++){
            if(words[i].equals(first) && words[i+1].equals(second)){
                list.add(words[i+2]);
            }
        }
        return list.toArray(new String[list.size()]);
    }
	
}