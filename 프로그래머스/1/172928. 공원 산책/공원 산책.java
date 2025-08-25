import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        //지나가는 길 O , 장애물x, 시작점 s
        //마지막 도착 위치 answer
        
        int h = park.length;
        int w = park[0].length();
        
        int[] answer = new int[2];

        int nx = 0;
        int ny = 0;

        
        for(int i=0; i<park.length; i++){   //시작점 구하기
            if(park[i].contains("S")){
                ny = i;
                nx = park[i].indexOf("S");
                break;
            }
        }
                
        for (String route : routes) {
            int newX = nx;
            int newY = ny;
            char direction = route.charAt(0);
            int move = Character.getNumericValue(route.charAt(2));

            for (int i = 0; i < move; i++) {
                if (direction == 'N') newY--;
                if (direction == 'S') newY++;
                if (direction == 'W') newX--;
                if (direction == 'E') newX++;

                if (newY >= 0 && newY < h && newX >= 0 && newX < w) { // 유효 범위
                    if (park[newY].charAt(newX) == 'X') break; // 이동 범위 내 장애물 유무

                    if (i == move-1) {
                        ny = newY;
                        nx = newX;
                    }
                }
                else break;

            }
        }
        answer[0] = ny;
        answer[1] = nx;
        
        
        
        return answer;
    }
}