import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[][] = new int[N][2]; //[n][0]은 시작, [n][0]은 종료

        StringTokenizer st;

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){ //종료 시간 같으면 시작시간이 빠른순으로 정렬
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int count = 0;
        int pre_time = 0;
        for(int i=0; i<N; i++){
            if(pre_time <= arr[i][0]){
                count ++;
                pre_time = arr[i][1];
            }
        }
        System.out.println(count);
    }
}