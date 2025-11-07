import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    
    static class Edge implements Comparable<Edge> {
        int to, weight;

        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            return this.weight - o.weight;
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        List<Edge>[] graph = new ArrayList[v + 1];
        for (int i = 1; i <= v; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<e; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph[a].add(new Edge(b,c));
            graph[b].add(new Edge(a,c));
        }

        boolean[] isVisited = new boolean[v+1];
        PriorityQueue<Edge> pq = new PriorityQueue<>();

        pq.add(new Edge(1,0));
        int result = 0;
        int count = 0;

        while(!pq.isEmpty()){

            Edge now = pq.poll();
            if(isVisited[now.to]) continue;
            isVisited[now.to] = true;
            result += now.weight;
            count++;

            if(count==v) break;

            for(Edge next: graph[now.to]){
                if(!isVisited[next.to]) pq.add(next);
            }

        }

        System.out.println(result);
    }
}
