class Solution {
    public String solution(int age) {
        StringBuffer sb = new StringBuffer();
        String programmers = "abcdefghij";

        String ageStr= String.valueOf(age);
        for(char ch: ageStr.toCharArray()){
            sb.append(programmers.charAt(ch-'0'));
        }

        return sb.toString();
    }
}        
