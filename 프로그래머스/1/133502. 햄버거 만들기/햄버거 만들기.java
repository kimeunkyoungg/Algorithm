import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        //빵-야채-고기-빵
        //1-빵 2-야채 3-고기
        //1-2-3-1일때 하나가 만들어진다.
        //{1,2,3,1} -> 한 세트

        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i : ingredient){
            stack.push(i);
            
            if(stack.size()>=4){
                int size = stack.size();
                
                if(stack.get(size-4) ==1 && stack.get(size-3) ==2 
                   && stack.get(size-2) ==3 && stack.get(size-1) ==1){

                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    answer++;
                }
            }
        }


        return answer;
    }
}