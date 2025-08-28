import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        int a[]= new int[10]; //0~9 중 숫자 몇번씩 나오는지 세기 위함
        int b[] = new int[10];
                 
                
        for (char c : X.toCharArray()) { // X의 숫자 카운팅
            a[c - '0']++;
        }

        for (char c : Y.toCharArray()) { // Y의 숫자 카운팅
            b[c - '0']++;
        }

        for(int i=9; i>=0; i--){
            int n = Math.min(a[i], b[i]); //짝꿍
            for(int j=0; j<n; j++){
                sb.append(i);
            }
        }
        
                
        if(sb.length()==0)  return "-1";

        if (sb.charAt(0) == '0') return "0";

        return sb.toString();
    }
}