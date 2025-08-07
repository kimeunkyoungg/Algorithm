class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int evensum =0;
        int oddsum =0;
        
        for(int i=0; i<num_list.length; i++){
            if(i%2==0){
                evensum+=num_list[i];
            }
            else{
                oddsum+=num_list[i];
            }
        }
        
        if(evensum>oddsum){
            return evensum;
        }
        else if(evensum<oddsum){
            return oddsum;
        }
        else{
            return evensum;
        }

    }
}