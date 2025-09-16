import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb  = new StringBuilder();

        int [] A= new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            int target = Integer.parseInt(st.nextToken());
            boolean found = false;

            int start = 0 ;
            int end = A.length-1;

            while(start <=end){
                int midIdx = (start + end) /2;

                int midnum = A[midIdx];
                if(target < midnum){
                    end = midIdx -1;
                }
                else if(target > midnum){
                    start = midIdx+1;
                }
                else{
                    found = true;
                    break;
                }
            }

            if(found){
                sb.append(1).append("\n");
            }
            else{
                sb.append(0).append("\n");
            }

        }
        System.out.println(sb.toString());

    }


}
