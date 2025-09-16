import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class Edge {
        int to;
        int weight;
        public Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static ArrayList<Edge>[] A;
    static int V;
    static boolean[] isVisited;
    static int[] d; // 거리 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        V = Integer.parseInt(br.readLine());
        A = new ArrayList[V + 1];
        isVisited = new boolean[V + 1];
        d = new int[V + 1];

        for (int i = 1; i <= V; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < V; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            while (true) {
                int to = Integer.parseInt(st.nextToken());
                if (to == -1) break;
                int weight = Integer.parseInt(st.nextToken());
                A[from].add(new Edge(to, weight));
            }
        }

        // 1. 임의의 노드에서 가장 먼 노드 찾기
        BFS(1);
        int max = 1;
        for (int i = 2; i <= V; i++) {
            if (d[i] > d[max]) {
                max = i;
            }
        }

        // 2. 가장 먼 노드에서 BFS 다시 수행
        isVisited = new boolean[V + 1];
        d = new int[V + 1];
        BFS(max);

        // 3. 거리 배열에서 최대값 출력
        int diameter = 0;
        for (int i = 1; i <= V; i++) {
            diameter = Math.max(diameter, d[i]);
        }
        System.out.println(diameter);
    }

    public static void BFS(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        isVisited[start] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (Edge e : A[now]) {
                if (!isVisited[e.to]) {
                    isVisited[e.to] = true;
                    queue.add(e.to);
                    d[e.to] = d[now] + e.weight;
                }
            }
        }
    }
}