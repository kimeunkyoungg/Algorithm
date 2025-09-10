import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static StringBuilder sb = new StringBuilder();
    static int N;

    public static void main(String[] args) throws IOException {

        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        DFS(2,1);
        DFS(3,1);
        DFS(5,1);
        DFS(7,1);

        System.out.println(sb.toString());
        br.close();

    }

    static void DFS(int number, int count){

        if(count == N){
            if(isPrime(number)){
                sb.append(number+"\n");
            }
            return;
        }

        for(int i=1; i<10; i++){
            if(i%2 ==0){ //짝수면 탐색필요x
                continue;
            }
            if(isPrime( number*10+ i)){ //소수면 재귀함수로 자리수(count) 늘려주기
                DFS(number*10 + i, count+1);
            }
        }

    }

    static boolean isPrime(int num){
        for(int i=2; i<num/2; i++){
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }
}

