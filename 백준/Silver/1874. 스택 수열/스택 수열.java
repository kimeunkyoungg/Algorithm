import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());;
        }

        boolean isPossible = true;
        int num = 1; //1부터 오름차순으로 넣음
        for(int i=0; i<N; i++){
            int su = arr[i];
            if(su>=num){
                while(su >= num){
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }
            else{ //num<first
                int top = stack.pop();
                if(top > su){
                    System.out.println("NO");
                    isPossible = false;
                    break;
                }
                else{
                    sb.append("-\n");
                }
            }

        }
        if(isPossible){
            System.out.println(sb.toString());
        }

        br.close();

    }


}

