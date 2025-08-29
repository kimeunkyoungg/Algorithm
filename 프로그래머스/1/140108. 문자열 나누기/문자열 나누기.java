class Solution {
    public int solution(String s) {
        int answer = 0;
        char now = s.charAt(0);
        int same = 0;   // 기준 문자 개수
        int diff = 0;   // 다른 문자 개수

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == now) {
                same++;
            } else {
                diff++;
            }

            // 기준 문자와 다른 문자 개수가 같으면 분리
            if (same == diff) {
                answer++;
                // 다음 구간 시작 준비
                if (i + 1 < s.length()) {
                    now = s.charAt(i + 1);
                }
                same = 0;
                diff = 0;
            }
            
        }
        
        if(same!=diff)answer ++;
        
        return answer;
    }
}