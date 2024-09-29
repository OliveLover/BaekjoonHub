class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] sequence = new int[102];
        int includedLength = included.length;
         
        for (int i = 1; i <= includedLength; i++) {
            sequence[i] = a + d * (i - 1);
            
            if (included[i - 1]) {
                answer += sequence[i];
            }
        }
        
        return answer;
    }
}