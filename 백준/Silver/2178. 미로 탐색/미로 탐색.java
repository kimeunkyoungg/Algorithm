import java.io.*;
import java.util.*;

public class Main {
    static int[][] A;
    static int N, M;
    static boolean isVisited[][];
    static int[] dx = { -1, 1, 0, 0 }; // 상하좌우
    static int[] dy = { 0, 0, -1, 1 };

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N][M];
        isVisited = new boolean[N][M];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken(); // 한줄씩

            for(int j=0; j<M; j++){
                A[i][j] = Integer.parseInt(line.substring(j,j+1));
            }
        }

        System.out.println(BFS(0,0));

    }


    public static int BFS(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        isVisited[x][y] = true;

        while(!queue.isEmpty()){
            int [] now  = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            for(int i=0; i<4; i++){
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                // 범위 체크
                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) continue;
                // 방문 여부 + 길 체크
                if (isVisited[nextX][nextY] || A[nextX][nextY] == 0) continue;

                queue.add(new int[] {nextX, nextY});
                isVisited[nextX][nextY] = true;
                A[nextX][nextY] = A[nowX][nowY] + 1; // 거리 갱신
            }
        }
        return A[N-1][M-1];
    }
}
