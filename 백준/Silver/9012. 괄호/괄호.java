import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();
            boolean isVPS = true;
            
            for(char ch : str.toCharArray()){
                if(ch =='('){
                    stack.push(ch);
                }

                else{
                    if(stack.isEmpty()){
                        isVPS = false;
                        break;

                    }
                    stack.pop();

                }
            }
            if(isVPS&&stack.isEmpty()){
                sb.append("YES\n");
            }
            else{
                sb.append("NO\n");
            }
        }
        System.out.println(sb.toString());
    }
}
