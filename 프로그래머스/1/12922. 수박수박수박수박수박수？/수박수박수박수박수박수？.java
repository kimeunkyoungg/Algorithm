class Solution {
    public String solution(int n) {
        String answer = "";
        char[] ch = {'수', '박'};
        
        for(int i=1; i<=n; i++){
            if(i%2==0){
                answer +=ch[1];
            }
            else{
                answer +=ch[0];
            }
        }
        return answer;
    }
}