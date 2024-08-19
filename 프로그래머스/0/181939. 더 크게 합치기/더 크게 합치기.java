class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        int num1 = Integer.parseInt(String.valueOf(a) + b);
        int num2 = Integer.parseInt(String.valueOf(b) + a);
        answer = Math.max(num1, num2);

        return answer;
    }
}