import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        String [] arr= N.split("-");
        
        for(int i=0; i<arr.length; i++){
            int tmp = getSum(arr[i]);
            if(i==0){
                answer = answer + tmp;
            }
            else{
                answer= answer-tmp;
            }
        }

        System.out.println(answer);
    }
    
    static int getSum(String s){
        String [] split = s.split("[+]");
        int sum = 0;
        for(int i=0; i<split.length; i++){
            sum+= Integer.parseInt(split[i]);
        }
        
        return sum;
    }
}
