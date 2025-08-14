import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        StringBuilder sb = new StringBuilder();
        
        String[] str = String.valueOf(n).split("");
        Arrays.sort(str, Collections.reverseOrder());
        
        for(String s : str){
            sb.append(s);
        }
        return Long.parseLong(sb.toString());
    }
}