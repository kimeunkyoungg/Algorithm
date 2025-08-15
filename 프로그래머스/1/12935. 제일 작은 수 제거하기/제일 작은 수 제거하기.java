import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) {
            return new int[]{-1};
        }
        
        // 1. 최솟값 찾기
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        
        // 2. 최솟값 제외한 배열 만들기
        int[] result = new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != minValue) {
                result[index++] = arr[i];
            }
        }
        
        return result;
    }
}