class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxW = 0;
        int maxH = 0;
        
        for(int[] s : sizes){
            int w = Math.max(s[0], s[1]);
            int h = Math.min(s[0], s[1]);
            if(w>maxW){
                maxW = w;
            }
            if(h>maxH){
                maxH=h;
            }
        }

        answer = maxH*maxW;
        return answer;
    }
}