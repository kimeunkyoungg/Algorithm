import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {

        List <Integer> list = new ArrayList<>();

        for(String str : intStrs){

            String sub = str.substring(s,s+l);
            int num = Integer.parseInt(sub);
            if(num>k){
                list.add(num);
            }
            
        }
                
//         int[] answer = new int[list.size()];
//         for(int i=0; i<list.size(); i++){
//             answer[i] = list.get(i);
//         }
//         return answer;
        
        return list.stream().mapToInt(Integer :: intValue).toArray();
    }
}