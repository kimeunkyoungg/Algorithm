import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        // 접을 때 항상 긴 쪽 접기
        //돌려서도 넣음\\
        
        int w_min = Math.min(wallet[0],wallet[1]);
        int w_max = Math.max(wallet[0],wallet[1]);
        int b_min = Math.min(bill[0],bill[1]);
        int b_max = Math.max(bill[0],bill[1]);
    
        while(true){
                        
            if(b_max <= w_max && b_min<=w_min)
                break;
            
                        
            if(b_max < b_min){
                int temp = b_max;
                b_max = b_min;
                b_min = temp;
            }
            
            if(w_min < b_min || w_max<b_max){
                b_max /=2;
                answer ++;
            }
            



        }
        
        return answer;
    }
}