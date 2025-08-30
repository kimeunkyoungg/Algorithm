class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {

                    int num = nums[i] + nums[j] + nums[k];
                    // 소수 판별 후 count 증가
                    if (isPrime(num)) answer += 1;
                }
            }
        }

        return answer;
    }
    
    // 소수 판별 메서드
    private boolean isPrime(int num) {
        if (num == 2) return true;
        
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
