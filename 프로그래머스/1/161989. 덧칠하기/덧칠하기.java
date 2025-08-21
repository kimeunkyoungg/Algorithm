class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int min = section[0];
        int max = 0;
        
        for(int s : section){
            if(s <= max) continue;
            
            
            answer ++;
            max = s + m -1;
        }
        return answer;
    }
}