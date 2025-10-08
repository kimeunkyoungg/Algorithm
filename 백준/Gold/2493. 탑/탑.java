import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<int[]> stack = new Stack<>(); // [0] = 높이, [1] = 인덱스
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<=n; i++) {
            int top = Integer.parseInt(st.nextToken());

            while (!stack.isEmpty() && stack.peek()[0] < top) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                sb.append("0 ");
            } else {
                sb.append(stack.peek()[1]).append(" ");
            }

            stack.push(new int[]{top, i});

        }

        System.out.println(sb.toString());
    }

}
