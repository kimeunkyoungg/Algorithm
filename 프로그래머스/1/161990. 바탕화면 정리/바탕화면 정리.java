class Solution {
    public int[] solution(String[] wallpaper) {
        //빈칸 '.' , 파일 있는 칸 '#'
        //최소한의 드래그로 한번에 지우려고함. greedy?
        //드래그 시작 시점 lux,luy + 끝 점 rdx, rdy
        //최소 행, 최소 열, 최대행, 최대열
        int[] answer = new int[4];
        int lux = Integer.MAX_VALUE; // 최소 행
        int luy = Integer.MAX_VALUE; // 최소 열
        int rdx = Integer.MIN_VALUE; // 최대 행
        int rdy = Integer.MIN_VALUE; // 최대 열
        
        for(int i=0; i<wallpaper.length; i++){
            for(int j=0; j<wallpaper[i].length(); j++){
                if(wallpaper[i].charAt(j)=='#'){
                    lux = Math.min(lux,i);
                    luy = Math.min(luy, j);
                    rdx = Math.max(rdx, i);
                    rdy = Math.max(rdy, j);
                }
            }
        }
        answer[0] = lux;
        answer[1]=luy;
        answer[2] = rdx+1;
        answer[3]= rdy+1;
        return answer;
    }
}