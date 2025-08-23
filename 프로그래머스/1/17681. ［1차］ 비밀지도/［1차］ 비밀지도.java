class Solution {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        //한변이 n인 정사각형 지도
        //각 칸은 공백 또는 벽#
        //1은 벽, 0은 공백
        String[] answer = new String[n];

        for(int i=0; i<n; i++){
            //배열 원소 2진수로
            String str1 = Integer.toBinaryString(arr1[i]);
            String str2 = Integer.toBinaryString(arr2[i]);

            if(str1.length() < n){
                //앞에 0붙이기
                int diff = n - str1.length();
                StringBuilder sb = new StringBuilder();
                for(int j=0; j<diff; j++){
                    sb.append("0");
                }
                sb.append(str1);
                str1 = sb.toString();
            }

            if(str2.length() < n){
                //앞에 0붙이기
                int diff = n - str2.length();
                StringBuilder sb = new StringBuilder();
                for(int j=0; j<diff; j++){
                    sb.append("0");
                }
                sb.append(str2);
                str2 = sb.toString();
            }

            StringBuilder row = new StringBuilder();
            for(int j=0; j<n; j++){
                if(str1.charAt(j) =='1' || str2.charAt(j)=='1'){
                    row.append("#");
                }
                else{
                    row.append(" ");
                }
            }
            answer[i] = row.toString();
        }



        return answer;
    }
}