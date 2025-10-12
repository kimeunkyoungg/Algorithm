import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        long arr[] = new long[k];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<k; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }

        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(long num : arr){
            pq.offer(num);
        }

        for(int i=0; i<n-1; i++){
            long num = pq.poll();
            for(int j=0; j<k; j++){
                long mul = num *arr[j];
                pq.add(mul);
                
                if(num % arr[j] == 0) {// 중복이면 제외
                    break;
                }
            }
        }
        
        System.out.println(pq.poll());
    }
}
