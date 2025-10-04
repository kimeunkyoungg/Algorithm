import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int n = elements.length;
        HashSet<Integer> set = new HashSet<>();
        int arr[] = new int[n*2];
        
        for(int i=0; i<n*2; i++){
            arr[i] = elements[i%n];
        }
        
        int prefix[] = new int[n*2+1];
        for(int i=1; i<=n*2; i++){
            prefix[i]= prefix[i-1] + arr[i-1];
        }
        
        
        for(int i=1; i<=n; i++){
           
            for(int j=0; j<n; j++){
                int sum = prefix[j+i] - prefix[j];
                set.add(sum);
            }
        }

        return set.size();
    }
}