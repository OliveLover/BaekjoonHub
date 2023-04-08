class Solution {
    public long solution(long n) {
        long answer = 0;
        long x = 1;
        if (n == 1) {
            return 4;
        }
        while (x <= n / 2) {
            if (x*x == n) {
                answer = (x+1)*(x+1);
                return answer;
            }
            x++;
        }
        return -1;
    }
}