class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = String.valueOf(order);
        
        for(char ch : str.toCharArray()){
            int num = ch -'0';
            if(num ==3 || num ==6 || num==9){
                answer ++;
            }
        }

        return answer;
    }
}