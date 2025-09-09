import java.io.*;

//병합 정렬 사용
public class Main {

    public static int[] A;
    public static int[] tmp; //정렬할 때 사용할 배열
    public static int result;

    public static void main(String[] args) throws IOException {

        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        A = new int[N+1];
        tmp = new int[N+1];

        for(int i=1; i<=N; i++){
            A[i] = Integer.parseInt(br.readLine());
        }

        merge_sort(1, N);

        for(int i=1; i<=N; i++){
            bw.write(A[i] +"\n");
        }

        bw.flush();
        br.close();

    }

    public static void merge_sort(int s, int e){
        if(e-s < 1){
            return;
        }

        int m = (s + e) / 2;
        //재귀 함수 사용
        merge_sort(s, m);
        merge_sort(m+1, e);

        for(int i = s; i<=e; i++){
            tmp[i] = A[i];
        }

        int k = s;
        int idx1 = s;
        int idx2 = m+1;

        while(idx1 <=m && idx2 <=e){ //두 그룹 병합
            if(tmp[idx1] > tmp[idx2]){
                A[k] = tmp[idx2];
                k++;
                idx2++;
            }
            else{
                A[k] = tmp[idx1];
                k++;
                idx1++;
            }
        }

        while(idx1 <= m){ //한쪽 그룹이 모두 선택된 후 남아있는 값 정리
            A[k] = tmp[idx1];
            k++;
            idx1++;
        }

        while (idx2 <= e){
            A[k] = tmp[idx2];
            k++;
            idx2++;
        }
    }
}