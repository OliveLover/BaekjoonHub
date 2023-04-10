class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int longMax = 0;
        int shortMax = 0;
        int longer = 0;
        int shorter = 0;
        for (int i = 0; i < sizes.length ; i++) {
            longer = Math.max(sizes[i][0], sizes[i][1]);
            shorter = Math.min(sizes[i][0], sizes[i][1]);

            if (longer > longMax) {
                longMax = longer;
            }
            if (shorter > shortMax) {
                shortMax = shorter;
            }
        }
        answer = longMax * shortMax;
        return answer;
    }
}