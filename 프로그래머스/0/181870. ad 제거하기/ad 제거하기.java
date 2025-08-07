import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {

        List<String> str = new ArrayList<>();
        
        for(String st : strArr){
            if(!st.contains("ad")){
                str.add(st);
            }
        }

        
        return str.toArray(new String[0]);
    }
}