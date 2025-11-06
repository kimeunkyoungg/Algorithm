import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken()); //무게

        int[] W = new int[N + 1]; //무게
        int[] V = new int[N + 1]; // 가치
        int[][] dp = new int[N + 1][K + 1];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            W[i] = Integer.parseInt(st.nextToken());
            V[i] = Integer.parseInt(st.nextToken());
        }

        // 6 4 3 5
        //13 8 6 12

        for(int i=1; i<=N; i++){
            for(int w=1; w<=K; w++){
                if(W[i] > w){ //현재 물건의 무게 > 배낭의 무게
                    dp[i][w] = dp[i-1][w];
                }
                else{
                    dp[i][w]=  Math.max(dp[i - 1][w], dp[i - 1][w - W[i]] + V[i]);
                }

            }
        }

        System.out.println(dp[N][K]);
    }
}
