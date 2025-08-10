import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        List<String> str = new ArrayList<>();
        for(int i=0; i<finished.length; i++){
            if(!finished[i]){
                str.add(todo_list[i]);
                
            }
        }

        return str.stream().toArray(String[]::new);
    }
}