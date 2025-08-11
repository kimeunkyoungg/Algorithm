class Solution {
    public int[] solution(int[] arr) {

        int len = arr.length;
        int target =1;
        while(len>target){
            target = target*2;
        }
                
        int[] answer = new int[target];
        for(int i=0;i<len; i++)
            answer[i] = arr[i];
        return answer;
    }
}