import java.util.*;

//     0
//   1   -1
//  1 -1 1 -1
class Solution {
    
    int count = 0;
    
    public int solution(int[] numbers, int target) {

        dfs(numbers, 0, target, 0);

        return count;
    }
    
    public void dfs(int[] numbers, int depth, int target, int result){
       if(numbers.length == depth){
           if(result == target){
               count ++;
           }
           return;
       }
        int plus = result +numbers[depth];
        int minus = result - numbers[depth];
        
        dfs(numbers, depth+1, target, plus);
        dfs(numbers, depth+1, target, minus);
        
    }
}