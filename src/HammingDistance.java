/**
 * @author Shogo Akiyama 
 * Solved on 06/12/2019
 * 
 * 461. Hamming Distance
 * https://leetcode.com/problems/hamming-distance/
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - int hammingDistance(int x, int y)
 * - String adjust(String s, int index).
 * 
 * Runtime: 1 ms, faster than 38.22% of Java online submissions for Hamming Distance.
 * Memory Usage: 33.2 MB, less than 41.32% of Java online submissions for Hamming Distance.
 * 
 */

public class HammingDistance {
	
	public int hammingDistance(int x, int y) {
        String a = Integer.toBinaryString(x);
        String b = Integer.toBinaryString(y);
        int index = a.length() > b.length()? a.length() : b.length();
        
        a = adjust(a, index);
        b = adjust(b, index);
        
        int counter = 0;
        int valueA, valueB;
        
        for(int i=0; i<index; i++){
            valueA = Character.getNumericValue(a.charAt(i));
            valueB = Character.getNumericValue(b.charAt(i));
            
            if(valueA != valueB){
                counter++;
            }
        }
        return counter;
    }
    
    String adjust(String s, int index){
        if(s.length() == index){
            return s;
        }else{
            String zeros = "";
            for(int i=0; i<index-s.length(); i++){
                zeros += "0";
            }
            return zeros + s;
        }
    }
    
}