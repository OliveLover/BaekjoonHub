class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for (int i = 1; i < numLog.length; i++ ) {
            int diff = numLog[i] - numLog[i - 1];
            
            if (diff == 1) {
                answer += "w";
            } else if(diff == -1) {
                answer += "s";
            } else if(diff == 10) {
                answer += "d";
            } else {
                answer += "a";
            }
        }
        return answer;
    }
}