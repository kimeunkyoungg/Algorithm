import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //N - 동전 종류
        //K - 총 합
        //그리디 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken()); 

        int answer = 0;

        int arr[] = new int[N];
        for(int i=0; i<N; i++){
            arr[i]= Integer.parseInt(br.readLine());
        }

        for(int i=N-1; i>=0; i--){
            if(K >= arr[i]){
                answer += K / arr[i];
                K = K % arr[i];
            }
        }

        System.out.println(answer);
    }
}
