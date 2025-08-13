import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        Stack <Integer> stack = new Stack<>();
        stack.push(arr[0]);
        
        for(int i=1; i<arr.length; i++){
            int peek = stack.peek();
            if(peek !=arr[i]){
                stack.push(arr[i]);
            }
        }

        Integer[] temp = stack.toArray(new Integer[0]);

        int[] answer =  new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            answer[i] = temp[i];
        }

        return answer;
    }
}