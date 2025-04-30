class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
       
        if(Integer.valueOf(s1+s2) > Integer.valueOf(s2+s1)){
            answer = Integer.valueOf(s1+s2);
            
        }
        else{
            answer = Integer.valueOf(s2+s1);
        }
        return answer;
        
        //return Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(b + "" + a));
    }
}