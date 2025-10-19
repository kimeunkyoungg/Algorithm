import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n,m;
    static int map[][];
    static int answer = 0;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0, 0, -1, 1};


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        //1- 벽, 0-빈칸, 2 - 바이러스
        n = Integer.parseInt(st.nextToken()); //세로
        m = Integer.parseInt(st.nextToken()); //가로

        map= new int[n][m];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        backTracking(0);

        System.out.println(answer);
    }

    private static void backTracking(int depth){
        if(depth==3){
            answer  = Math.max(answer, checkSafe(bfs()));
            return;
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map[i][j] ==0){
                    map[i][j]=1;
                    backTracking(depth+1);
                    map[i][j] = 0;
                }
            }
        }

    }

    private static int checkSafe(int[][] map){
        int safeArea  = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(map[i][j] == 0){
                    safeArea++;
                }
            }
        }
        return safeArea;
    }


    private static int[][] bfs(){
        int [][] newMap = new int[n][m];

        for (int i = 0; i < n; i++) {
            System.arraycopy(map[i], 0, newMap[i], 0, m);
        }
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (newMap[i][j] == 2) {
                    q.add(new int[]{i, j});
                }
            }
        }


        while(!q.isEmpty()){
            int[] tmp = q.poll();
            int x = tmp[0];
            int y = tmp[1];

            //좌우위아래 탐색
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >=0 && ny>=0 && nx<n && ny<m){
                    if(newMap[nx][ny] == 0){
                        newMap[nx][ny]=2;
                        q.add(new int[]{nx,ny});
                        
                    }
                }
            }
        }
        return newMap;
    }
}
