import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<Integer>[] A;
    static boolean visited [];
    public static void main(String[] args) throws IOException {

        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //노드 수
        int M = Integer.parseInt(st.nextToken()); //엣지 수

        A = new ArrayList[N+1];
        visited = new boolean[N+1];

        for(int i=1; i<N+1; i++){
            A[i]= new ArrayList<Integer>();
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());

            A[idx].add(value);
            A[value].add(idx);
        }

        for(int i=1; i<N+1; i++){
            if(!visited[i]){
                answer ++;
                DFS(i);
            }
        }
        System.out.println(answer);
        br.close();

    }

    static void DFS(int v){
        if(visited[v]){
            return;
        }

        visited[v] = true;

        for(int i : A[v]){
            if(!visited[i]){ //연결 노드 중 방문하지 않은 노드만 탐색하기
                DFS(i);
            }
        }

    }
}

