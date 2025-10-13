import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int n,m;
    static int arr[][];
    static boolean isVisited[][];
    static int answer = 0;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        //1- 익은 토마토, 0-익지 않은 토마토, -1 - 빈칸
        m = Integer.parseInt(st.nextToken()); //가로
        n = Integer.parseInt(st.nextToken()); //세로

        arr= new int[n][m];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] == 1){
                    q.add(new int[] {i,j});
                }
            }
        }

        System.out.println(bfs());
    }

    private static int bfs(){
        while(!q.isEmpty()){
            int[] tmp = q.poll();
            int x = tmp[0];
            int y = tmp[1];

            //좌우위아래 탐색
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >=0 && ny>=0 && nx<n && ny<m){
                    if(arr[nx][ny] == 0){
                        q.add(new int[]{nx,ny});
                        arr[nx][ny] = arr[x][y] + 1;
                    }
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j] == 0){
                    return -1;
                }
                answer = Math.max(answer, arr[i][j]);
            }
        }

        if(answer == 1){
            return 0;
        }
        else{
            return answer -1;
        }
    }
}
