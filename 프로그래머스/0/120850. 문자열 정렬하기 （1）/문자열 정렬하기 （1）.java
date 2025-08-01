import java.util.*;
class Solution {
    public int[] solution(String my_string) {
                
        List <Integer> list = new ArrayList<>();
       
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if(Character.isDigit(c)){
                list.add(c-'0');
            }
            
        }
        
         
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=list.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}