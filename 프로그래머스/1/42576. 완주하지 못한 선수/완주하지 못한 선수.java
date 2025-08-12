import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        int parlen = participant.length;
        int comlen = completion.length;
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        //중간에 다른 사람 있으면 그 사람이 미 완주자
        for(int i=0; i<comlen; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
            
        //끝에 마지막으로 남는 사람이 미완주자 -> completion길이는 participant보다 1 작기 때문
        return participant[parlen - 1];
        
    }
}