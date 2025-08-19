import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        
        //공격력 = 약수 개수
        //if 공격력 < 제한 -> 협약기관
        //answer -> 철 무게
        int answer = 0;
        int[] arr = new int[number+1];
        
        for(int i=1; i<=number; i++){
    
            for(int j=i; j<=number; j+=i){
                arr[j] ++;
            }
        }
        

        for (int i = 1; i <= number; i++) {
            int atk = arr[i];
            answer += (atk > limit) ? power : atk;
        }
        return answer;
    }
}