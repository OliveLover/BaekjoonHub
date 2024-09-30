class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int arrLength = arr.length;
        int[] answer = new int[arrLength];
        int queriesLength = queries.length;
        for (int i = 0; i < queriesLength; i++) {
            int temp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;
        }
        
        for (int i = 0; i < arrLength; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}