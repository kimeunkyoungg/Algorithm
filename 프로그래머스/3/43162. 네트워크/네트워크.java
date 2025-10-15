import java.util.*;

//BFS?
class Solution {
    
    static boolean isVisited[];
    public int solution(int n, int[][] computers) {
        int answer = 0;
        isVisited = new boolean[n];
        for(int i=0; i<n; i++){
            if(!isVisited[i]){
                answer ++;
                dfs(i, computers);
            }
        }
        return answer;
    }
    
    public void dfs(int x, int[][] arr){
        isVisited[x] = true;
        for(int i=0; i<arr.length; i++){
            if(!isVisited[i] && arr[x][i]==1){
                dfs(i, arr);
            }
        }
        
    }
}