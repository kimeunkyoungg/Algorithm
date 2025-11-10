import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        //가장 맵지 않은 것 + 두번째로 맵지않은것*2
        //모든 음식이 k이상이 되도록 하기위해 섞어야하는 최소 횟수
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }
        
        while(pq.peek() < K){
            if(pq.size() == 1) return -1;
            
            pq.add(pq.poll() + (pq.poll()*2));
            answer ++;
                   
        }
        return answer;
    }
}