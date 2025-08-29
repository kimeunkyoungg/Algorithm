import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer =new int[id_list.length];
        int [] middle = new int[id_list.length]; //신고 횟수 담을 배열

        
        HashMap<String, Integer> map = new HashMap<>(); //이름, id 쌍으로 넣어주기
        for(int i=0; i<id_list.length; i++){ 
            map.put(id_list[i], i);
        }
        
        Set<String> reportSet = new HashSet<>(Arrays.asList(report)); //중복제거 하기 위함

        //신고 당한 횟수 세기
        for (String r : reportSet) {
            String[] arr = r.split(" ");
            String reporter = arr[0];
            String stop = arr[1];

            middle[map.get(stop)]++;
        }

        
        //신고 메일 횟수 세기
        for (String r : reportSet) {
            String[] arr = r.split(" ");
            String reporter = arr[0];
            String stop = arr[1];
            
            int stopIdx = map.get(stop);
            
            if(middle[stopIdx]>=k){
                answer[map.get(reporter)]++;
            }

        }
        
        return answer;
    }
}