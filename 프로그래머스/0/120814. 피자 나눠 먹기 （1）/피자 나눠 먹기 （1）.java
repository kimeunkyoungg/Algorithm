class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //return n%7 ==0 ? n/7 : n/7+1;
        return (int) Math.ceil((double) n / 7);  //Math.ceil은 무조건 반올림

    }
}