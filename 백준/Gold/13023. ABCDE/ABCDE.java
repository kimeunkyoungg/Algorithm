import java.io.*;
import java.util.*;

public class Main {
    static boolean isVisited[];
    static ArrayList<Integer>[] A;
    static boolean found = false; //답 찾으면 종료

    public static void main(String[] args) throws IOException {

        //N - 사람의 수. 노드 수
        //M - 친구 관계의 수. 엣지 수

        //A는 B와 친구다.
        //B는 C와 친구다.
        //C는 D와 친구다.
        //D는 E와 친구다.
        //DFS 깊이가 5인지 확인
        
        int count = 0;
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //5
        int M = Integer.parseInt(st.nextToken()); //4

        A = new ArrayList[N];
        isVisited = new boolean[N];

        for(int i=0 ; i<N; i++){
            A[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            A[a].add(b);
            A[b].add(a);
        }

        for(int i=0; i<N; i++){
            DFS(i, 1); //깊이 1부터 시작
            if(found) break; 
        }

        answer = found ? 1 : 0;
        System.out.println(answer);

    }
    static void DFS(int v, int depth){
        if(found){
            return;
        }
        
        if(depth == 5){
            found = true;
            return;
        }
        
        isVisited[v] = true;
        for(int i : A[v]){
            if(!isVisited[i]){
                DFS(i, depth+1);
            }
        }
        isVisited[v] = false;
    }
}