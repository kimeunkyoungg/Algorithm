import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //자연수 N이하로 연속된 자연수의 합 구하기

        int answer = 1; //기본적으로 N 자체만으로 답이 되므로 처음 값을 1로
        int start_idx = 1;
        int end_idx = 1;
        int sum = 1;
        
        while(end_idx!=N){
            if(sum == N){
                answer++;
                end_idx++;
                sum +=end_idx;
            }
            else if(sum<N){ //N보다 작으면 끝 포인터를 증가시켜 배열의 합을 증가
                end_idx++;
                sum += end_idx;
            }
            else{ //N보다 크면 처음 포인터를 증가시켜 배열의 합을 감소
                sum -= start_idx;
                start_idx++;
            }

        }

        System.out.println(answer);

    }

}
