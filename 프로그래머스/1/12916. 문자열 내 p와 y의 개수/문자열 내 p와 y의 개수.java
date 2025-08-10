class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pnum = 0;
        int ynum = 0;
        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch =='p'){
                pnum++;
            }
            else if(ch =='y'){
                ynum++;
            }
        }
        
        if(pnum != ynum){
            answer =  false;
        }

        return answer;

    }
}