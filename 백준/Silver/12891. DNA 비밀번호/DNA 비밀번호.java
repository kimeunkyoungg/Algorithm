import java.io.*;
import java.util.*;


public class Main {
    static int checkArr[]; //비밀번호 상태 체크 배열
    static int myArr[]; //현재 상태 배열
    static int check; //몇개의 문자가 개수와 일치하는지

    public static void main(String[] args) throws NumberFormatException,IOException {


        // {‘A’, ‘C’, ‘G’, ‘T’}

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;

        int S = Integer.parseInt(st.nextToken()); //9
        int P= Integer.parseInt(st.nextToken()); //8

        char A[] = new char[S];

        checkArr = new int[4];
        myArr = new int[4];
        check = 0;

        A = br.readLine().toCharArray();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if(checkArr[i]== 0) check++;
        }


        for(int i=0; i<P; i++){
            Add(A[i]);
        }

        if(check == 4) answer++;

        for(int i=P; i<S; i++){
            int j = i - P;
            Add(A[i]);
            Remove(A[j]);
            if(check == 4) answer++;
        }


        System.out.println(answer);
        br.close();

    }

    private static void Add(char ch) { //새로 들어온 문자를 처리함
        switch (ch) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0]) check++;
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1]) check++;
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2]) check++;
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3]) check++;
                break;

        }
    }

    private static void Remove(char ch) { //제거되는 문자를 처리함
        switch (ch) {
            case 'A':
                if (myArr[0] == checkArr[0]) check--;
                myArr[0]--;
                break;
            case 'C':
                if (myArr[1] == checkArr[1]) check--;
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == checkArr[2]) check--;
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == checkArr[3]) check--;
                myArr[3]--;
                break;
        }
    }

}


