import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] score = new int[3];
        int[] a ={1,2,3,4,5}; //len 1
        int[] b ={2,1,2,3,2,4,2,5}; // len 8
        int[] c = {3,3,1,1,2,2,4,4,5,5}; //len 10
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == a[i % a.length]) score[0]++;
            if(answers[i] == b[i % b.length]) score[1]++;
            if(answers[i] == c[i % c.length]) score[2]++;
        }
        
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (score[i] == max) list.add(i + 1); // 수포자 번호는 1부터
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}