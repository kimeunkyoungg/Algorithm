class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String kStr = String.valueOf(k);
        
        for(int n = i; n<=j; n++){
            String nStr = String.valueOf(n);
            for(int m=0; m<nStr.length(); m++){
                if(String.valueOf(nStr.charAt(m)).equals(kStr)){
                    answer ++;
                }
            }
        }
        return answer;
    }
}