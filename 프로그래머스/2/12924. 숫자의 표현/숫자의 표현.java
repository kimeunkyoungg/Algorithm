class Solution {
    public int solution(int n) {
        int answer = 1; //기본적으로 본인 자체로 성립 가능
        
        int idx1 = 1;
        int idx2 = 1;
        int sum = 1;
        
        while(idx2 != n){
            if(sum == n){
                answer ++;
                idx2 ++;
                sum += idx2;
            }
            
            else if(sum < n){
                idx2 ++;
                sum += idx2;
            }
            else{
                sum -= idx1;
                idx1++;
            }
        }
        
        return answer;
    }
}