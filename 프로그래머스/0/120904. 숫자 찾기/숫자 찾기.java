class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = String.valueOf(num);
        char ch = (char)(k + '0');
        
        for(int i=0; i<str.length(); i++){
            if(ch == str.charAt(i)){
                answer =i+1;
                break;
            } 
            else answer =-1;
              
        }
        return answer;
    }
}