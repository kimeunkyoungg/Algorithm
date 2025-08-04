import java.util.*;
class Solution {
    public String solution(String my_string) {

        StringBuffer sb = new StringBuffer();
        
 
        for(int i=0 ; i<my_string.length(); i++){
                   
            char ch = my_string.charAt(i);
            if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }
            else{
                sb.append(ch);
            }
        }

        char[] chars = sb.toString().toCharArray();


        Arrays.sort(chars);


        return new String(chars);
    }
}