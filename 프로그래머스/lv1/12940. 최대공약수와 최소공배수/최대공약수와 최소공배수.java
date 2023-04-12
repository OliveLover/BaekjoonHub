class Solution {
    public int[] solution(int n, int m) {
        
        int gcd = gcd(n,m);
        int lcm = n * m / gcd;
        int[] answer = {gcd, lcm};
        return answer;
    }


    //유클리드 호제법
    public static int gcd(int a, int b) {

        if (b == 0) return a;
        
        return gcd(b, a%b);
    }
}