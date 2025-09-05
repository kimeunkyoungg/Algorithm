import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;


public class Main {

    public static void main(String[] args) throws IOException {

        //배열에 정수 x 넣기
        //배열에서 가장 절댓값이 가장 작은 값 출력하고 그 값을 배열에서 삭제
        //만약 같은 값 여러개면 가장 작은 수 출력하고 그 값을 배열에서 삭제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>((n1, n2) ->{
            int first_abs = Math.abs(n1);
            int second_abs = Math.abs(n2);
            
            if(first_abs == second_abs) 
                return n1 > n2 ? 1 : -1 ; //같으면 음수 우선 정렬
        
            else{
                return first_abs-second_abs; //절대값 기준으로 정렬
            }
        
        });

        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0) {
                if(pq.isEmpty()){
                    System.out.println("0");
                }
                else{
                    System.out.println(pq.poll()); //0일때 가장 작은 값 출력하고 제거
                }
            }
            else pq.add(num);
        }
        br.close();
    }
}
