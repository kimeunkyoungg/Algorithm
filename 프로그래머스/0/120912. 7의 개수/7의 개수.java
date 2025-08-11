class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int arr : array){
            String str = String.valueOf(arr);
            for(int i=0; i<str.length(); i++){
                String num = String.valueOf(str.charAt(i));
                if(num.equals("7")){
                    answer ++;
                }
            }
        }
    
        return answer;
    }
}