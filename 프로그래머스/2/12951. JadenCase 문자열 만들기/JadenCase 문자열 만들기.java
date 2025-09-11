class Solution {
    public String solution(String s) {

        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;

        for(char ch : s.toCharArray()){
            if(isFirst && Character.isLetter(ch)){
                sb.append(Character.toUpperCase(ch));
            }
            else{
                sb.append(ch);
            }
            isFirst = (ch == ' ');
        }
        return sb.toString();
    }
}