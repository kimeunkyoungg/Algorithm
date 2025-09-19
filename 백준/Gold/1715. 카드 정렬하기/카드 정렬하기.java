import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq= new PriorityQueue<>();
        int answer = 0;
        int a = 0;
        int b = 0;
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            pq.add(num);
        }
        while(pq.size()!=1){
            a = pq.remove();
            b = pq.remove();
            answer += a +b;
            pq.add(a+b);
        }

        System.out.println(answer);
    }
}