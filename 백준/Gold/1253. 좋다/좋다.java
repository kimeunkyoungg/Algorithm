import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {


        //N개의 수 중에 두개의 합으로 나타낼 수 있는 수의 개수 구하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine()); //수의 개수

        int answer = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] arr = new long[N];

        for(int i=0; i<N; i++){
            arr[i]=Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i=0; i<N; i++) {
            int start_idx = 0;
            int end_idx = N - 1;
            long find = arr[i]; //현재 비교하고자 하는 수

            while (start_idx < end_idx) {
                if (arr[start_idx] + arr[end_idx] == find) {
                    if(start_idx != i && end_idx != i){ //나 자신이 아니여야함
                        answer++;
                        break; //더 확인할 필요 없으므로 바로 탈출
                    }
                    else if(start_idx== i){
                        start_idx++;
                    }
                    else if(end_idx == i){
                        end_idx--;
                    }

                } else if (arr[start_idx] + arr[end_idx] < find) {
                    start_idx++;
                } else {
                    end_idx--;
                }

            }
        }

        System.out.println(answer);
        br.close();

    }

}
