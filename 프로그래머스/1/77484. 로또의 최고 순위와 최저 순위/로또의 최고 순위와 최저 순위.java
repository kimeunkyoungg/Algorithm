import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        //알아볼 수 없는 번호는 0으로
        //0 0 [1] 25 [31] 44
        //[1] 6 10 19 [31] 45
        
        //민우가 구매한 로또 번호를 담은 배열 lottos
        //당첨 번호를 담은 배열 win_nums가 매개변수
        //최고 순위, 최저 순위 담아주기
        
        //정렬해서 스택으로 pop?
        int[] answer = new int[2];
        int count = 0; //몇개 똑같은 지 count
        int zero = 0;
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        for(int i : lottos){
            if(i==0) zero++;
            for(int j : win_nums){
                if(i==j){
                    count++;
                }
            }
        }
        
        answer[0] = 7-(count+zero) > 6 ? 6 : 7-(count+zero);
        answer[1] = 7-count > 6 ? 6 : 7-count; //최저 순위
        return answer;
    }
}