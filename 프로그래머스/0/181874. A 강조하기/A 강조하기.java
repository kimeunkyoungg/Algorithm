import java.util.*;
class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        for(char ch : myString.toCharArray()){
            if(ch == 'a'){
                sb.append("A");
            }
            else if(ch != 'A' && Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}