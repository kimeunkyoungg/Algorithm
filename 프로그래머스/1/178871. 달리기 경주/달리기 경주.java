import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        //바로 앞 선수 추월하면 추월한 선수의 이름 부름
        //현재 등수 players
        //해설진이 부른 순서 callings
        
        String[] answer = Arrays.copyOf(players, players.length);
        
        //hashmap으로 저장해주기 -> 시간이 너무 오래 걸려서 hashMap 사용해봄
        Map<String, Integer> map = new HashMap<>(); //현재 등수 map
                
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for(String str : callings){
            int idx = map.get(str); //일치하는 선수의 인덱스 구해주고
            int frontIdx = map.get(str) -1;
                                
            String temp = answer[frontIdx];
            answer[frontIdx] = answer[idx];
            answer[idx] = temp;
            
            map.put(str,frontIdx);
            map.put(temp, idx);
        }
        

        return answer;
    }
}