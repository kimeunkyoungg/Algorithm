import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] A;
    static int N, M, V;
    static StringBuilder sb = new StringBuilder();
    static boolean isVisited[];

    public static void main(String[] args) throws IOException {

        //첫째줄 DFS
        //둘째줄 BFS
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 정점의 개수 
        M = Integer.parseInt(st.nextToken()); // 간선의 개수 
        V = Integer.parseInt(st.nextToken()); // 탐색 시작 번호 

        A = new ArrayList[N+1]; //1번부터 시작이므로

        for(int i= 1; i<=N; i++){
            A[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            A[a].add(b);
            A[b].add(a);

        }

        // 정점 번호가 작은 것부터 방문하기 위해 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(A[i]);
        }

        isVisited = new boolean[N + 1];
        DFS(V);
        System.out.println(sb.toString().trim());

        sb.setLength(0); // StringBuilder 초기화
        isVisited = new boolean[N + 1];
        BFS(V);
        System.out.println(sb.toString().trim());

    }

    public static void DFS(int node){
        sb.append(node).append(" ");
        isVisited[node] = true;
        for(int i : A[node]){
            if(!isVisited[i]){
                DFS(i);
            }
        }
    }

    public static void BFS(int node){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        isVisited[node] = true;

        while(!queue.isEmpty()){
            int now_node = queue.poll();
            sb.append(now_node).append(" ");

            for(int i : A[now_node]){
                if(!isVisited[i]){
                    isVisited[i] = true;
                    queue.add(i);
                }
            }
        }

    }
}