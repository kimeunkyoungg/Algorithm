import java.util.*;

class Solution {
    int length = 0;
    boolean isVisited[];
    ArrayList<String> list;
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        
        length = tickets.length;
        
        isVisited = new boolean[length];
        list = new ArrayList<>();
        
        dfs("ICN", "ICN", tickets, 0);
        
        Collections.sort(list);
        answer = list.get(0).split(" ");
        
        return answer;
    }
    
    public void dfs(String start, String route, String[][] tickets, int count){
        if(count == length){
            list.add(route);
            return;
        }
        
        for(int i=0; i<length; i++){
            if(!isVisited[i] && start.equals(tickets[i][0])){
                isVisited[i] = true;
                dfs(tickets[i][1], route +" " + tickets[i][1], tickets, count+1);
                isVisited[i] = false;
            } 
        }
    }
}