class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        //전부 초로 바꿔서?
        
        //10초 전으로 이동, 10초 후로 이동, 오프닝 건너뚜기
        //기능이 수행되기 직전의 재생위치를 나타내는 문자열 pos
        //오프닝 시작/종료 시각을 나타내는 문자열 op_start, op_end
        //사용자의 입력을 나타내는 1차원 문자열 배열 commands
        //입력 끝난 후 동영상의 위치 mm:ss형식으로 리턴

        int total_len = changeSec(video_len);
        int pos_len = changeSec(pos); //현재 시점 기준으로 하기
        int op_startlen = changeSec(op_start);
        int op_endlen = changeSec(op_end);
        
        for(String com : commands){

                                    //오프닝 시간이면 
            if(pos_len>=op_startlen && pos_len<=op_endlen){
                pos_len = op_endlen;
            }
            if(com.equals("prev")){

                pos_len = Math.max(0, pos_len - 10);
            }
            
            else if(com.equals("next")){

                pos_len = Math.min(total_len, pos_len + 10);
            }
                                    //오프닝 시간이면 
            if(pos_len>=op_startlen && pos_len<=op_endlen){
                pos_len = op_endlen;
            }

        }
        
        String result_min = String.valueOf(pos_len/60);
        String result_sec = String.valueOf(pos_len%60);

        if(result_min.length()==1){
            result_min = "0" + result_min;
        }
        
                
        if(result_sec.length()==1){
            result_sec = "0" + result_sec;
        }
        return result_min + ":" + result_sec;
    }
    
    public static int changeSec(String s){
        int min = Integer.parseInt(s.split(":")[0]);
        int sec = Integer.parseInt(s.split(":")[1]);
        int total = min*60 + sec; //전체 길이 초로 바꿈
        
        return total;
    }
}