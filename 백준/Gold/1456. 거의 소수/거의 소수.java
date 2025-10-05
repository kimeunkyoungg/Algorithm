import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        //에라토스테네스의 체
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        int sqrtB = (int)Math.sqrt(b);
        boolean isPrime[] = new boolean[sqrtB+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i=2; i*i<=sqrtB; i++){
            if(isPrime[i]){
                for(int j=i*i; j<=sqrtB; j+=i){
                    isPrime[j] = false;
                }
            }
        }

        for(int i=2; i<=sqrtB; i++){
            if(isPrime[i]){
                long num = i;
                while((double)num*i <=b){
                    num*=i;
                    if(num >=a)
                        answer++;
                }
            }
        }

        System.out.println(answer);
    }

}
