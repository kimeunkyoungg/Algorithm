class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0; //최종 직원 담을 수
        
        int []time = new int[schedules.length]; //시간 +10 담을 배열
        
        for(int i=0; i<schedules.length; i++){
            time[i] = schedules[i]+10;
            if(time[i]%100 >= 60){ //ex 765
                time[i] = time[i]-60+100;
            }
        }
        

        for(int i=0; i<timelogs.length; i++){
            boolean ok = true; //지각인지 아닌지 확인하기 위함
            
            for(int j=0; j<timelogs[i].length; j++){
                                
                int dayOfWeek = (startday + j ) % 7; 
                if (dayOfWeek == 0 || dayOfWeek == 6) continue; // 주말 건너뜀


                if(timelogs[i][j] > time[i]){ //한번이라도 지각 있으면 안된다
                    ok = false;
                    break;
                }
                
            }
            if(ok) answer ++;
            
        }
        
        return answer;
    }
}