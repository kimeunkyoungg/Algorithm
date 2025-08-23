class Solution {
    public int solution(String[] babbling) {
        int answer =0;
        String [] bab = {"aya", "ye", "woo", "ma"};
        for(String b : babbling){
            for(String w : bab){
                if(b.contains(w+w)) break;
                b = b.replace(w, " ");
            }
            if(b.trim().isEmpty()) answer++;
        }


        return answer;
    }
    
}