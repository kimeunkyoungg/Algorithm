import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;

        char[] beforeChar = before.toCharArray();
        char[] afterChar = after.toCharArray();
        Arrays.sort(beforeChar);
        Arrays.sort(afterChar);
        return Arrays.equals(beforeChar, afterChar) ? 1: 0;
    }
}