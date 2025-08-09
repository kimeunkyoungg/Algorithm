class Solution {
    public int[] solution(int[] numbers, String direction) {
 
        int num = numbers.length;
               
        int[] answer = new int[num];
        if(direction.equals("right")){
            answer[0] = numbers[num-1];
            for(int i=1; i<num; i++){
                answer[i] = numbers[i-1];
            }
        }
        
        else if(direction.equals("left")){
            for(int i=0; i<num-1; i++){
                answer[i] = numbers[i+1];
            }
            answer[num-1] = numbers[0];
        }
        return answer;
    }
}