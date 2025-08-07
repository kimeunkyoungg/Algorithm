class Solution {
    public int solution(int[][] arr) {
        int num = arr.length;

        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                if(arr[i][j]!=arr[j][i]){
                    return 0;
                }

            }
        }       
        return 1;
    }
}