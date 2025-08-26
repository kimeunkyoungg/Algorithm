import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        //모든 달은 28일까지 있다고 가정
        //파기해야할 번호 구하기
        //년도는 2000~2022
        
        //약관의 유효기간을 담은 1차원 문자열 배열 terms "A 6"
        //수집된 개인정보의 정보를 담은 1차원 문자열 배열 privacies "2021.05.02 A"
        //privacies + terms >= today -> answer에 넣어주기
        List <Integer> answer = new ArrayList<>();
        
        int totalDays = convertToDays(today);
    
        Map<Character ,Integer> termsMap = new HashMap<>();
        
        for(int i=0; i<terms.length; i++){
                
            char key = terms[i].charAt(0); // "A 6" → 'A'
            int value = Integer.parseInt(terms[i].split(" ")[1]); // "6" → 6
            termsMap.put(key, value);
        }
        
        for(int i=0; i<privacies.length; i++){
            String date = privacies[i].split(" ")[0];  //2021.05.02
            char pName = privacies[i].split(" ")[1].charAt(0); //privacies의 name 임. 이후 terms의 name과 구별 //A

            int termMonth = termsMap.get(pName);
            int startDays = convertToDays(date); //날짜 전체 합으로 바꿔주고
            int expireDays = startDays + termMonth*28;
            
            if(expireDays<=totalDays){
                answer.add(i+1);
            }
            
            

        }
        

        return answer.stream().mapToInt(Integer :: intValue).toArray();
    }
    
    public static int convertToDays(String date){ //전체 날짜로 바꿔주는 함수
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        return year * 12 * 28 + month * 28 + day;
    }
}