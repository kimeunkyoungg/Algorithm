import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {

        //1번 카드 제일 위에, N번 카드 제일 아래
        //제일 위에 있는 거 버리고, 제일 위에 있는 걸 제일 아래에 있는 카드 밑으로 옮김
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=N; i++){
            q.add(i);
        }

        while(q.size() >1){
            q.poll();
            q.add(q.poll());
        }
        System.out.println(q.poll());
        br.close();
    }
}
