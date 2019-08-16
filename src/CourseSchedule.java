import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 08/15/2019
 * 
 * 207. Course Schedule
 * https://leetcode.com/problems/course-schedule/
 * difficulty: Medium
 * 
 * To run the code in LeetCode, take the codes from the following method(s) and all properties:
 * - boolean canFinish(int numCourses, int[][] prerequisites)
 * - check(Integer node, Set<Integer> path).
 * 
 * Runtime: 17 ms, faster than 40.17% of Java online submissions for Course Schedule.
 * Memory Usage: 46.1 MB, less than 62.31% of Java online submissions for Course Schedule.
 * 
 */

public class CourseSchedule {

	Map<Integer, HashSet<Integer>> graph = new HashMap<Integer, HashSet<Integer>>();
    Set<Integer> seen = new TreeSet<Integer>();
    int count;
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        for(int i=0; i<prerequisites.length; i++){
            int[] pair = prerequisites[i];
            if(!graph.containsKey(pair[0])){
                graph.put(pair[0], new HashSet<Integer>());
            }
            if(!graph.containsKey(pair[1])){
                graph.put(pair[1], new HashSet<Integer>());
            }
            graph.get(pair[0]).add(pair[1]);
        }
        
        Set<Integer> passed = new TreeSet<Integer>();
        count = numCourses;
        
        for(Integer node: graph.keySet()){
            if(!seen.contains(node)){
                check(node, passed);
                if(count < 0){
                    return false;
                }
            }
        }    
        
        return true;
    }
        
    void check(Integer node, Set<Integer> path){
        
        seen.add(node);
        path.add(node);
        
        for(Integer i: graph.get(node)){
            if(seen.contains(i) && path.contains(i)){
                count = -1;
                return;
            }
            if(!seen.contains(i)){
                check(i, path);
            }
        }
        
        path.remove(node);
    }
	
}
