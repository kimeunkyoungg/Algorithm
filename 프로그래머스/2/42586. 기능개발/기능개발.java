import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q  = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<progresses.length; i++){
            int remain = 100 - progresses[i];
            int days = remain / speeds[i];
            if(remain % speeds[i] != 0){
                days++;
            }
            q.add(days);
        }
        
        while(!q.isEmpty()){
            int day  = q.poll();
            int count = 1;
            
            while(!q.isEmpty() && q.peek() <= day){
                count ++;
                q.poll();
            }
            list.add(count);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}