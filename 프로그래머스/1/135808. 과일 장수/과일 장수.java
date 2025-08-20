import java.util.*;

//정렬하고 단위 나눠서 맨 앞에 있는 숫자만 계산하면되는것
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        

        for(int i = score.length-m; i>=0 ; i-=m){
            answer += score[i] * m;
        }
        return answer;
    }
}