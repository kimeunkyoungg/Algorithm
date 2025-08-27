import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        //코드번호, 제조일, 최대 수량, 최소 수량
        //조건 만족하는 데이터만 뽑아 정렬
        
        //data -> 정렬할 데이터 담김
        //ext -> 뽑아낼 기준
        //val_ext -> 뽑아낼 정보의 기준값
        //sort_by -> 정보 정렬할 기준
        
        //data에서 ext 값이 val_ext보다 작은 데이터만 뽑은 후, sort_by에 해당하는 값을 기준으로 오름차순
        int[][] answer = {};
     
        ArrayList<int[]> arr = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);
        
        int idx = map.get(ext); //어떤 데이터 기준으로 뽑아내는지 인덱스 추출
        int sortIdx = map.get(sort_by);
        
        for(int i=0; i<data.length; i++){
            if(data[i][idx] <val_ext){
                arr.add(data[i]);
            }
        }
        

        Collections.sort(arr, Comparator.comparingInt(a -> a[sortIdx]));


        return arr.toArray(new int[arr.size()][]);
    }
}