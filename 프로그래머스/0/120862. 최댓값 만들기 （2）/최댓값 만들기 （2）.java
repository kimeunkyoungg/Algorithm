import java.util.*;

class Solution {
    public int solution(int[] numbers) {

        int n = numbers.length;
        Arrays.sort(numbers);
        
        int case1 = numbers[0]*numbers[1];
        
        int case2 = numbers[n-1] * numbers[n-2];
        
        return case1>case2 ? case1 : case2;
    }
}