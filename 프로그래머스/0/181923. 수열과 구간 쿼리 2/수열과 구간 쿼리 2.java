public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int queriesLength = queries.length;
        int[] answer = new int[queriesLength];

        for (int i = 0; i < queriesLength; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            boolean flag = false;
            int target = Integer.MAX_VALUE;
            for ( int j = s; j <= e; j++) {
                if (arr[j] > k) {
                    flag = true;
                    target = Math.min(target, arr[j]);
                }
            }

            if (flag) {
                answer[i] = target;
            } else {
                answer[i] = -1;
            }
        }

        return answer;
    }
}
