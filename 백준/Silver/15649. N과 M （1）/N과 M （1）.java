import java.io.*;
import java.util.*;


public class Main {
    static boolean isVisited[];
    static int[] A;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {


        //1부터 N까지의 자연수 중에서 중복 없이 M개를 고른 수열

        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); 
        int M = Integer.parseInt(st.nextToken()); 

        A = new int[M];
        isVisited = new boolean[N];
        DFS(N, M, 0);

        System.out.println(sb.toString());

    }

    public static void DFS(int N, int M, int depth){
        if(depth == M){
            for(int i : A){
                sb.append(i + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 0; i<N; i++){
            if(!isVisited[i]){
                isVisited[i] = true;
                A[depth] = i+1;
                DFS(N, M, depth+1);
                isVisited[i] = false;
            }
        }
    }
}

