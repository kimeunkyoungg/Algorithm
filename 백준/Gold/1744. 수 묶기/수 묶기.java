import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {

        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Integer> plus = new PriorityQueue<>(Collections.reverseOrder()); //양수 그룹
        PriorityQueue<Integer> minus = new PriorityQueue<>(); //음수 그룹
        int zero = 0; //0의 개수
        int one = 0; //1의 개수

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            int k  = Integer.parseInt(br.readLine());
            if(k == 0) zero ++;
            else if (k ==1) one++;
            else if( k>0){
                plus.add(k);
            }
            else{
                minus.add(k);
            }
        }
        while(plus.size()>1){
            int a = plus.remove();
            int b = plus.remove();
            answer += a * b;
        }
        if(!plus.isEmpty()){
            answer += plus.remove();
        }

        while(minus.size()>1){
            int a = minus.remove();
            int b = minus.remove();
            answer += a * b;
        }

        if(!minus.isEmpty()){
            if(zero==0){
                answer += minus.remove();
            }
        }

        answer += one;

        System.out.println(answer);
    }
}