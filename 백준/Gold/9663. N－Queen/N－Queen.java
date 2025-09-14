import java.io.*;

public class Main {
    static int[] A;
    static int N;
    static int answer= 0;

    public static void main(String[] args) throws IOException {
        
        //N*N 체스판 위에 N개의 퀸
        //가로 세로 대각선 공격 가능
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        A = new int[N];
        backTracking(0);
        System.out.println(answer);

    }

    public static void backTracking(int row){
        if(row == N){
            answer ++;
            return;
        }

        for(int i = 0; i<N; i++){
            A[row]= i;
            if(check(row)){
                backTracking(row+1);
            }
        }
    }
    
    public static boolean check(int row){
        for(int i=0; i<row; i++){
            if(A[i] == A[row]) return false; //일직선에 있는 경우
            if(Math.abs(row-i) == Math.abs(A[i] - A[row])) return false; //대각선에 있는 경우
        }
        return true;
    }
}
