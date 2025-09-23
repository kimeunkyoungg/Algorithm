import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        //크기별로 분류했을때 서로 다른 종류의 수는 최소화하도록 함
        
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        
        for(int i : tangerine){
            hashmap.put(i, hashmap.getOrDefault(i,0) +1);
        }
        
        ArrayList<Integer> count = new ArrayList<>(hashmap.values());
        count.sort(Collections.reverseOrder()); //내림차순 정렬해서 비교
        
        int answer = 0;
        int sum =0;
        for(int i : count){
            sum += i;
            answer++;
            if(sum >= k) break;
        }
        
        return answer;
    }
}