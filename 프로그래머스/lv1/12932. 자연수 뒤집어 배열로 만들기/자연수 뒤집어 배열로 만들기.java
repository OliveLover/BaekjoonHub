class Solution {
    public int[] solution(long n) {
        String strNum = String.valueOf(n);
        int  i = 0;
        int[] answer = new int[strNum.length()];
        while (n > 0) {
            answer[i] = (int)(n%10);
            n /= 10;
            i++;
        }
        return answer;
    }
}