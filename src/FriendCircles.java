import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * @author Shogo Akiyama 
 * Solved on 04/27/2019
 * 
 * 547. Friend Circles
 * https://leetcode.com/problems/friend-circles/
 * 
 * To run the code in LeetCode, take the codes from 
 * int findCircleNum(int[][] M) method and class Node.
 * 
 * Runtime: 67 ms, faster than 5.13% of Java online submissions for Friend Circles.
 * Memory Usage: 45.3 MB, less than 33.56% of Java online submissions for Friend Circles.
 * 
 */

public class FriendCircles {
    public int findCircleNum(int[][] M) {
    
        Map<Integer, Node> map = new HashMap<Integer, Node>();
        Set<Node> toVisit = new HashSet<Node>();
        for(int i=0; i<M.length; i++){
            map.put(i, new Node(i));
            toVisit.add(map.get(i));
        }
        
        for(int i=0; i<M.length; i++){
            for(int j=i+1; j<M.length; j++){
                if(M[i][j] == 1){
                    map.get(i).neighbors.add(map.get(j));
                    map.get(j).neighbors.add(map.get(i));
                }
            }
        }
        
        int count=0;
        while(!toVisit.isEmpty()){
            count++;
            Stack<Node> stack = new Stack<Node>();
            stack.push(toVisit.iterator().next());
            while(!stack.isEmpty()){
                Node curr = stack.pop();
                toVisit.remove(curr);
                for(Node n: curr.neighbors){
                    if(toVisit.contains(n)){
                        stack.push(n);
                    }
                }
            }
        }
        return count;
    }
    
    class Node {
        int index;
        Set<Node> neighbors;
        Node(int i){
            index = i;
            neighbors = new HashSet<Node>();
        }
    }
    
}