import java.util.*;

class Solution {
    public String solution(int[] numbers) {

        String[] arr = Arrays.stream(numbers).mapToObj(String::valueOf)
                                             .toArray(String[]::new);
        
        Arrays.sort(arr, (a,b) -> (b+a).compareTo(a+b));
        
        if(arr[0].equals("0")) return "0";
        
        StringBuilder answer = new StringBuilder();
        for(String s : arr) {
            answer.append(s);
        }
        return answer.toString();
    }
}