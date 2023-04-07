class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int i = 0;
        for(int absolute : absolutes){
            answer += (signs[i])   ? 1 * absolute : -1 * absolute;
            i++;
        }
        return answer;
    }
}