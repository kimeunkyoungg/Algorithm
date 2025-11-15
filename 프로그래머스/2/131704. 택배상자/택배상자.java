import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        //4 3 1 2 5
        //1,2,3 보관 후 4출력 3출력
        for(int i=1; i<=order.length; i++){
            stack.push(i);
            while(!stack.isEmpty() && order[answer] == stack.peek()){
                answer++;
                stack.pop();
            }
        }

        return answer;
    }
}