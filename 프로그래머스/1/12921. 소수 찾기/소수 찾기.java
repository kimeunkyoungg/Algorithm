class Solution {
    public int solution(int n) {
        int answer = 0;
        //짝수는 2제외하고 무조건 아님
        //boolean 쓰는거 익숙해지기
        if(n>=2) answer ++;
        
        for(int i=3; i<=n; i+=2){ //홀수만 검사
            boolean isPrime = true;
            for(int j=3; i>=j*j; j+=2){
                if(i%j == 0) {
                    isPrime = false;
                    break;
                }
                
            }
            if(isPrime) answer ++;
        }

        return answer;
    }
}