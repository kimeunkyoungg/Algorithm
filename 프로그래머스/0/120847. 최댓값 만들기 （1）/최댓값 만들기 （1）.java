import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers); //오름차순
        int num = numbers.length;
        
        int m = numbers[num-1];
        int n = numbers[num-2];
        
        return m*n;
        
    }
}