import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        //1 - 매우 비동의, 7- 매우 동의

        StringBuilder sb = new StringBuilder();
        
        
        HashMap<Character, Integer> categoryMap = new HashMap<>();
        categoryMap.put('R', 0);
        categoryMap.put('T', 0);
        categoryMap.put('C', 0);
        categoryMap.put('F', 0);
        categoryMap.put('J', 0);
        categoryMap.put('M', 0);
        categoryMap.put('A', 0);
        categoryMap.put('N', 0);
             
        
        for(int i=0; i<survey.length; i++){ //점수 매기기
            int num = 0;
            char a = survey[i].charAt(0);
            char b = survey[i].charAt(1);
            
            int choice = choices[i]; // j 반복문 필요 없음
            if (choice <= 3) { // 앞 문자 점수
                num = 4 - choice;
                categoryMap.put(a, categoryMap.getOrDefault(a, 0) + num);
            } else if (choice > 3) { // 뒷 문자 점수
                num = choice - 4;
                categoryMap.put(b, categoryMap.getOrDefault(b, 0) + num);
            }
        }
                
        char[][] types = {{'R','T'}, {'C','F'}, {'J','M'}, {'A','N'}};

        for (char[] pair : types) {
            char first = pair[0];
            char second = pair[1];
            int score1 = categoryMap.get(first);
            int score2 = categoryMap.get(second);

            if (score1 > score2) {
                sb.append(first);
            } else if (score1 < score2) {
                sb.append(second);
            } else { // 같으면 사전순(앞쪽)
                sb.append(first < second ? first : second);
            }
        }
        
    
        return sb.toString();
    }
}