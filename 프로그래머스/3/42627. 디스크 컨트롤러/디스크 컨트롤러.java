import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        //작업 번호, 요청 시간, 소요시간 
        //짧은 소요시간, 빠른 요청시간, 작은 작업 번호

        int len = jobs.length;
        Arrays.sort(jobs, (a,b) -> a[0]-b[0]);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1]-b[1]);
        int time = 0; //현재 시간
        int total = 0; //총 소요 시간
        int idx = 0;
        int count = 0; //처리한 작업 수
        
        while(count < len){
            while(idx<len && jobs[idx][0] <= time){
                pq.offer(jobs[idx++]);
            }
            
            if(pq.isEmpty()){
                time = jobs[idx][0];
            }
            else{
                int[] job = pq.poll();
                time += job[1];
                total += time - job[0];
                count ++;
            }
        }
        return total / len;
    }
}