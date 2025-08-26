class Solution {
    public String solution(String new_id) {

        String answer = "";
        
                
        //1. 대문자를 소문자로
        answer = new_id.toLowerCase();
                
                
        //2. 못쓰는 문자 제거 
        //소문자, 숫자, - , _ , .만 사용 가능
        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        

        // 3단계: 마침표(.) 2번 이상 → 하나로 치환
        answer = answer.replaceAll("\\.{2,}", ".");
        

        // 4단계: 마침표(.)가 처음/끝에 있으면 제거
        answer = answer.replaceAll("^\\.|\\.$", "");
        
                
        //5. 빈 문자열이면 a 대입
        if(answer.isEmpty()) answer="a";
        
        
        //6. 길이 16자 이상이면 15개 제외한 나머지 제거. 마찬가지로 마침표 마지막에 있으면 제거
        if(answer.length()>=16) {
            answer = answer.substring(0,15);
            answer = answer.replaceAll("\\.$", "");
        }

        //7. 길이 2자 이하면 마지막 글자를 3이상이 될때까지 끝에 붙여주기        
                
        while (answer.length() < 3) {
            answer += answer.charAt(answer.length() - 1);
        }
        
        return answer;
    }
}