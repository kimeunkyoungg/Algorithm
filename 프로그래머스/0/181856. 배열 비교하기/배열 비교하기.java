class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int len1 = arr1.length;
        int len2 = arr2.length;
        int sum1 = 0;
        int sum2 = 0;
        for(int i =0; i<len1; i++){
            sum1+=arr1[i];
        }
        for(int i =0; i<len2; i++){
            sum2+=arr2[i];
        }
        
        if(len1!=len2){
            return len1>len2 ? 1 : -1;
        }
        
        else{
            if(sum1 == sum2){
                return 0;
            }
            else{
                 return sum1>sum2 ? 1 : -1 ;
            
            }
           
        }

    }
}