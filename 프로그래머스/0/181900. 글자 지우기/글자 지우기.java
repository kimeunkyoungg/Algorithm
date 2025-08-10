import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";

        Set<Integer> set = new HashSet<>();
        
        for(int n : indices){
            set.add(n);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_string.length(); i++){
            if(!set.contains(i)){
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}