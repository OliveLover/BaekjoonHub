class Solution {
    public int[] solution(int start_num, int end_num) {
        int arrLength = end_num - start_num + 1;
        int[] answer = new int[arrLength];
        
        for (int i = 0; i < arrLength; i++) {
            answer[i] = start_num++;
        }
        
        return answer;
    }
}