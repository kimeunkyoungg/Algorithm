import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        HashMap <String, Integer> map = new HashMap<>();
        for(int i=0; i<name.length; i++){
           
            int value = (i<yearning.length) ? yearning[i] : 0; //값 없을 때 처리
            map.put(name[i], value);
        }
        
        
        for(int i=0; i<photo.length; i++){
            int sum = 0;
            for(String s : photo[i]){
                sum+= map.getOrDefault(s, 0);
            }
            answer[i] = sum;
        }
        return answer;
    }
}