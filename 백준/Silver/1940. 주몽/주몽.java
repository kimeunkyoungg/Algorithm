import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {


        //두 재료 합쳐서 M이 되도록 하는 값 구하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine()); //재료의 개수
        int M = Integer.parseInt(br.readLine()); //갑옷 만드는 데 필요한 수

        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr); //1 2 3 4 5 7

        int answer = 0;
        int start_idx= 0; //인덱스 두개로 양쪽 끝에서 점점 좁혀지도록 함
        int end_idx= N-1;

        while(start_idx<end_idx){
            if(arr[start_idx]+ arr[end_idx] < M){
                start_idx++;
            }

            else if(arr[start_idx]+ arr[end_idx] > M){
                end_idx--;
            }

            else if(arr[start_idx] + arr[end_idx] == M){
                answer++;
                start_idx++;
                end_idx--;
            }
        }
        System.out.println(answer);
        br.close();

    }

}