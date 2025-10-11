import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new LinkedList<>();

        while(t-->0){
            String str = br.readLine();

            if(str.startsWith("push")){
                String arr[] = str.split(" ");
                int n = Integer.parseInt(arr[1]);
                queue.offer(n);
            }
            else if(str.equals("pop")){
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");

                }
                else{
                    sb.append(queue.poll()).append("\n");
                }

            }
            else if(str.equals("front")){
                if (queue.isEmpty()) sb.append(-1).append('\n');
                else sb.append(queue.peekFirst()).append('\n');

            }
            else if(str.equals("back")){
                if (queue.isEmpty()) sb.append(-1).append('\n');
                else sb.append(queue.peekLast()).append('\n');

            }
            else if(str.equals("size")){
                sb.append(queue.size()).append("\n");

            }
            else if(str.equals("empty")){
                sb.append(queue.isEmpty() ? 1 : 0).append('\n');
            }

        }
        System.out.println(sb.toString());
    }
}
