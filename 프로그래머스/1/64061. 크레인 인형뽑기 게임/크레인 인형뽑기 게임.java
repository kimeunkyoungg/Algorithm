import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        //stack?
        //[0,0,0,0,0]
        //[0,0,1,0,3]
        //[0,2,5,0,1]
        //[4,2,4,4,2]
        //[3,5,1,3,1]
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<moves.length; i++){
            
            int col = moves[i]-1;
            
            for(int j=0; j<board.length; j++){
                if(board[j][col]!=0){
                    int doll = board[j][col];
                    board[j][col]=0; //뽑은 자리는 비우기
                    
                    if(!stack.isEmpty() && stack.peek() ==doll ){
                                            
                        stack.pop();
                        answer += 2; // 같은 인형 2개 사라짐
                    }
                    else{
                        stack.push(doll);
                    }
                    break;
                }
                
            }
            
        
        }
        return answer;
    }
}