class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch ==' ') { 
                answer +=ch; 
                continue;
            }
if (ch >= 'a' && ch <= 'z') {
                answer += (char) ((ch - 'a' + n) % 26 + 'a');
            } else { // ch가 대문자인 경우
                answer += (char) ((ch - 'A' + n) % 26 + 'A');
            }

        }
        return answer;
    }
}