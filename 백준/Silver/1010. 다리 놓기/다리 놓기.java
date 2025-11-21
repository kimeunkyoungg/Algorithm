import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
        다리 짓기 적합한 곳 - 사이트
        서쪽에는 N개, 동쪽에는 M개의 사이트
        서쪽 N개의 개수만큼 다리를 짓는다.
        다리를 지을 수 있는 경우의 수
        겹칠 수 없음
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        int[][] arr = new int[t][2];

        while(t-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            sb.append(combination(m,n)).append("\n");
        }


        System.out.println(sb.toString());
    }
    public static long combination(int m, int n){

        long result = 1;
        for(int i=1; i<=n; i++){
            result = result*(m-i+1)/i;
        }

        return result;
    }
}
