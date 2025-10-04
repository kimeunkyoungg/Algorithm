import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i=0; i<s.length(); i++){
            String rotated = s.substring(i) + s.substring(0,i);
            if(checked(rotated)){
                answer ++;
            }
        }

        return answer;
    }
    
    private boolean checked(String str){
        Stack<Character> stack = new Stack<>();
                
        for(char ch: str.toCharArray()){
                        
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                                
                if (ch == ')' && top != '(') return false;
                if (ch == ']' && top != '[') return false;
                if (ch == '}' && top != '{') return false;
            }   
        }
        
        return stack.isEmpty();
    }
}