import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num, 0);
            }
        }
        int n1 = map.keySet().size();
        int n2 = nums.length/2;
        
        
        
        return n1>n2 ? n2: n1;
    
    }
}