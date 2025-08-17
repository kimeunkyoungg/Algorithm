class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int min = m>n ? n : m;
        int gcd = 0;
        for(int i=1; i<=min; i++){
            if(m % i ==0 && n%i ==0){
                gcd = i;
            }
        }
        
        answer[0] = gcd;
        answer[1] = (m*n)/gcd; 
        return answer;
    }
}