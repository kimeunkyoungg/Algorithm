import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //산성 - 양수, 알칼리 - 음수
        //합쳐서 0에 가까운 두 용액 구학'

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int arr[] = new int[n]; //-2 4 -99 -1 98
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // -99 -2 -1 4 98 절댓값 비교?
        int total = Integer.MAX_VALUE;
        int i = 0;
        int j = n-1;

        int liq1 = 0;
        int liq2 = 0;

        while(i<j){
            int sum = Math.abs(arr[i] + arr[j]);
            if(sum < total){
                total = sum;
                liq1 = arr[i];
                liq2 = arr[j];
                if(total == 0){
                    break;
                }

            }
            if(arr[i] + arr[j] > 0){
                j--;
            }
            else{
                i++;
            }
        }

        System.out.println(liq1 +" " + liq2);
    }

}
