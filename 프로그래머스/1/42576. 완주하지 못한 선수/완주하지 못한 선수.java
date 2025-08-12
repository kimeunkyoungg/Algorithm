import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        //중간에 다른 사람 있으면 그 사람이 미 완주자
        for(int i=0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
            
        //끝에 마지막으로 남는 사람이 미완주자
        return participant[participant.length - 1];
        
        

    }
}