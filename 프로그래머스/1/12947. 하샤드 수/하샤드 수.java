class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int xnum = x;
        int sum  = 0;
        
        while(xnum>0){
            sum += xnum%10;
            xnum = xnum/10;
        }

        return x % sum == 0? true : false ;
    }
}