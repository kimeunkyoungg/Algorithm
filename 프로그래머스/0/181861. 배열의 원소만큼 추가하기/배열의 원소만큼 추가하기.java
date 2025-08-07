import java.util.*;
class Solution {
    public int[] solution(int[] arr) {

        List<Integer> list = new ArrayList<>();
        
        for(int n : arr){
            for(int i=0; i<n; i++){
                list.add(n);
            }
        }
        
                
        int[] answer = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}