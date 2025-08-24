import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        Set<Character> skipSet = new HashSet<>();
        for (char sk : skip.toCharArray()) skipSet.add(sk);

        for (char c : s.toCharArray()) {
            int count = 0;
            while (count < index) {
                c++;
                if (c > 'z') c = 'a'; // wrap-around 먼저
                if (skipSet.contains(c)) continue; // skip이면 그냥 넘어감
                count++;
            }
            sb.append(c);
        }

        return sb.toString();
    }
}