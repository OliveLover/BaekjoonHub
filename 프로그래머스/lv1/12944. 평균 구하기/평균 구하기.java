class Solution {
    public double solution(int[] arr) {
        double answer = 0;

        for (int a : arr) {
            answer += a;
        }
        
        return answer / arr.length;
    }
}