class Solution {
    public int solution(int[] num_list) {

        if(num_list.length>=11){
                           
            int sum = 0;
            for(int i=0; i<num_list.length; i++){
 
                sum +=num_list[i];
            }
            return sum;
        }
        else{
            int pro =1;
            for(int i=0; i<num_list.length; i++){

                pro *=num_list[i];
            }
            return pro;
        }

    }
}