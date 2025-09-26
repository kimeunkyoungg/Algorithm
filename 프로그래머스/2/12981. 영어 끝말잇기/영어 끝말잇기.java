import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {

        HashSet<String> hashSet = new HashSet<>();

        int member = 0;
        int turn = 0;

        hashSet.add(words[0]);

        for(int i=1; i<words.length; i++){
            String prev = words[i-1];
            String curr = words[i];
            

            if(prev.charAt(prev.length()-1) != curr.charAt(0)){
                member = (i%n) +1;
                turn = (i/n) +1;
                return new int[]{member,turn};
            }
            
            if(hashSet.contains(curr)){
                member = (i%n) +1;
                turn = (i/n) +1;
                return new int[]{member,turn};
            }
            hashSet.add(curr);
        
        }
        return new int[]{0,0};
    }
}

