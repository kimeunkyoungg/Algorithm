import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        //R 배열 수 순서 뒤집기. D 첫번 째 수 버리기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Deque<Integer> dq;

        int t = Integer.parseInt(br.readLine()); //테스트 케이스 수

        StringBuilder sb = new StringBuilder();


        while(t-- >0){

            String p = br.readLine(); //실행 함수 RDD
            int n = Integer.parseInt(br.readLine()); //배열 수

            st = new StringTokenizer(br.readLine(), "[],");
            dq = new ArrayDeque<>();

            for(int i =0; i<n; i++){
                dq.add(Integer.parseInt(st.nextToken()));
            }

            boolean error = false;
            boolean reversed = false;

            for(char ch : p.toCharArray()){
                if(ch =='R'){
                    reversed = !reversed;
                }

                else if(ch=='D'){
                    if(dq.isEmpty()){
                        error = true;
                        break;
                    }
                    if(!reversed){
                        dq.pollFirst();
                    }
                    else{
                        dq.pollLast();
                    }
                }
            }

            if(error){
                sb.append("error\n");
                continue;
            }

            sb.append("[");
            if(!dq.isEmpty()){
                if(!reversed){
                    Iterator<Integer> it = dq.iterator();
                    sb.append(it.next());
                    while (it.hasNext()) sb.append(",").append(it.next());
                }
                else{
                    Iterator<Integer> it = dq.descendingIterator();
                    sb.append(it.next());
                    while (it.hasNext()) sb.append(",").append(it.next());

                }
            }

            sb.append("]\n");

        }

        System.out.println(sb);
    }



}
