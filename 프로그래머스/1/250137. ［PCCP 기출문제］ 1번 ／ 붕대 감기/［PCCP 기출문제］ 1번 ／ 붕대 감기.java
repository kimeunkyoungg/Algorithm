class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        //t초 동안 붕대를 감으면서 1초마다 x만큼 회복
        //t초 연속으로 붕대 감는거 성공하면 y를 추가만큼 회복
        //공격 당하면 기술취소. 끝나면 바로 다시 붕대 감기 시작. 연속 시간은 0으로 초기화
        //체력<=0 이면 끝
        //bandage[기술 시전 시간, 1초당 회복량(x), 추가 회복량(y)]
        //최대 체력 health
        //attack[몬스터 공격 시간, 피해량]
        //공격 끝난후 남은 체력을 리턴
        //죽으면 -1 리턴
        int answer = health;
        int time = attacks[attacks.length-1][0];
        
        int duration = bandage[0]; //시전 시간 
        int x = bandage[1]; //1초당 회복량
        int y = bandage[2]; //추가 회복량 -> t초 연속 성공하면 y추가해주기
        
        int count = 0; //연속 성공 시간
        int idx = 0;
        
        for(int i=0; i<=time; i++){

            if(idx<attacks.length && attacks[idx][0] == i){//공격 들어옴

                answer -=attacks[idx][1];
                count = 0;
                idx ++;
            
            }
            
            else{
                count++;
                answer+= x;
                if(count == duration){
                    answer+= y;
                    count = 0;
                }
                if(answer>health) answer= health; //최대 체력 제한
            }
            
                        
            if(answer<=0) return -1;
            
            
        }


        return answer;
    }
}