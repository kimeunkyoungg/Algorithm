class Solution {
    public int solution(int n) {
        if (n < 2) return 0;

        boolean[] composite = new boolean[n + 1]; // 합성수 표시
        for (int p = 2; p * p <= n; p++) {
            if (!composite[p]) {
                for (long q = (long)p * p; q <= n; q += p) {
                    composite[(int)q] = true;
                }
            }
        }

        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            if (!composite[i]) cnt++;
        }
        return cnt;
    }
}