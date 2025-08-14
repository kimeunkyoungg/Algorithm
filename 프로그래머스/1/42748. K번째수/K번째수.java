import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
            
        List<Integer> answerList = new ArrayList<>();

        int len = commands.length;
        
        for(int i=0; i<len; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int idx = commands[i][2];
                    
            List<Integer> list = new ArrayList<>();
            for(int j = start-1; j< end; j++){
                list.add(array[j]);
            }
            Collections.sort(list);
            answerList.add(list.get(idx-1));
        }
        return answerList.stream().mapToInt(Integer :: intValue).toArray();
    }
}