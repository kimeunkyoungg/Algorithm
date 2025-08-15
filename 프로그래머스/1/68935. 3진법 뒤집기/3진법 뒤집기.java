class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n,3);
        String reversed = new StringBuilder(s).reverse().toString();
        
        return Integer.parseInt(reversed, 3);
    }
}