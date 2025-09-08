import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A[] = new int[N];
        int S[] = new int[N];
        
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        S[0] = A[0];
        for(int i=1; i<N; i++){ //누적 합 배열
            S[i] = S[i-1] +A[i];
        }


        for(int i=0; i<N; i++){
            answer +=S[i];
        }
        System.out.println(answer);

        br.close();

    }
}
