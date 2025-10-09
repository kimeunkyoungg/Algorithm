import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        //Q에 저장된 데이터 중 최대/최소 출력
        //I는 삽입, D는 삭제
        //D 1은 최대값 삭제, D -1은 최솟값 삭제. 비어있으면 무시
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- >0){
            int k = Integer.parseInt(br.readLine());
            PriorityQueue<Integer> minQ = new PriorityQueue<>();
            PriorityQueue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());
            Map<Integer, Integer> map = new HashMap<>();

            for(int j=0; j<k; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String s = st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                if(s.equals("I")){
                    minQ.offer(num);
                    maxQ.offer(num);
                    map.put(num, map.getOrDefault(num, 0) + 1);
                }
                else if(s.equals("D")){
                    if(map.isEmpty()){
                        continue;

                    }
                    if(num == 1){
                        if(!maxQ.isEmpty()){
                            removeInvalid(maxQ, map);
                            int x = maxQ.poll();
                            map.put(x, map.get(x)-1);
                            if(map.get(x) == 0){
                                map.remove(x);
                            }
                        }
                    }
                    else{
                        if(!minQ.isEmpty()){
                            removeInvalid(minQ, map);
                            int x = minQ.poll();
                            map.put(x, map.get(x)-1);
                            if(map.get(x) == 0){
                                map.remove(x);
                            }

                        }
                    }
                }

            }
            removeInvalid(minQ, map);
            removeInvalid(maxQ, map);

            if(map.isEmpty()){
                sb.append("EMPTY\n");
            }
            else{
                sb.append(maxQ.peek()).append(" ").append(minQ.peek()).append("\n");
            }

        }
        System.out.println(sb.toString());
    }

    // 유효하지 않은 값(이미 map=0인 값) 제거
    static void removeInvalid(PriorityQueue<Integer> pq, Map<Integer, Integer> map) {
        while (!pq.isEmpty() && (!map.containsKey(pq.peek()) || map.get(pq.peek()) == 0)) {
            pq.poll();
        }
    }
}