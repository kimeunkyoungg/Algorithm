import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<operations.length; i++){
            String[] str = operations[i].split(" ");
            
            char ch = str[0].charAt(0);
            int n = Integer.parseInt(str[1]);
            
            if(ch =='I'){
                minHeap.add(n);
                maxHeap.add(n);
            }
            
            else if(ch =='D'){
                if(minHeap.isEmpty()) continue;
                
                else if(n == 1){ //최댓값 삭제
                    int max = maxHeap.poll();
                    minHeap.remove(max);
                }
                else{ //최솟값 삭제
                    int min = minHeap.poll();
                    maxHeap.remove(min);
                }
                
            }
            
        }
        
        if(minHeap.isEmpty()){
            return new int[]{0,0};
        }

        return new int[]{maxHeap.peek(), minHeap.peek()};
    }
}