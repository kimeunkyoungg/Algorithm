class Solution {
    public int solution(String number) {
        String[] arr = number.split("");
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum +=Integer.parseInt(arr[i]);
        }

        return sum%9;
    }
}