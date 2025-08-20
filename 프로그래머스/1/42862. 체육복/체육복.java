import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        //처음 값 설정을 전체 - 잃어버린 수로 세팅하고 ++해나감
        int answer = n - lost.length;;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        //잃어버린 사람이 여벌옷을 가져온경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer ++;
                    lost[i]= -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        //양 옆 사람에게 빌려주기
                
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(reserve[j] == lost[i] -1 || reserve[j] == lost[i]+1){
                    answer ++;
                                       
                    lost[i]= -1;
                    reserve[j] = -1;
                    break;
                    
                
                }
            }
        }
        
        return answer;
    }
}