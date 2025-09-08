import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {

        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken()); //앞에서부터 k번째 있는 수 구해야함

        int A[] = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        quickSort(A, 0, N-1, K-1);
        answer = A[K-1];
        
        System.out.println(answer);

        br.close();

    }
    
    public static void quickSort(int[] A, int S, int E, int K) { //퀵 정렬 함수
        //S - 시작
        //E - 끝
        if (S < E) {
            int pivot = partition(A, S, E);
            if(pivot == K) return; //K번째 수가 pivot이면 구할 필요 없음
            
            else if(pivot > K){ //왼쪽 그룹만 정렬
                quickSort(A, S, pivot-1, K);
            }
            else quickSort(A, pivot+1, E, K); //오른쪽 그룹만 정렬
        }
    }
    
    public static int partition(int[]A, int S, int E) { //pivot 구하는 함수
        if (S + 1 == E) {
            if (A[S] > A[E]) swap(A, S, E);
            return E;
        }

        int M = (S + E) / 2;
        swap(A, S, M);
        int pivot = A[S];
        int i = S + 1;
        int j = E;

        while (i <= j) {
            while (j > S + 1 && pivot < A[j]) { //pivot보다 작은수가 나올때까지 j--
                j--;
            }

            while (i <= E && pivot > A[i]) { //pivot보다 큰 수가 나올때까지 i++
                i++;
            }

            if (i <= j) {
                swap(A, i++, j--);
            }
        }
        
        //pivot 데이터를 나눠진 두 그룹의 경계 index 에 저장
        A[S] = A[j];
        A[j] = pivot;
        return j;
    }
    
    public static void swap(int A[], int i,int j){
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
        
    }
}
