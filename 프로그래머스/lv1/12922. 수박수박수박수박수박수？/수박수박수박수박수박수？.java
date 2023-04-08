class Solution {
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        for(int i =0; i< n; i++) {
            if (i%2 == 1) {
                sb.append("박");
            } else {
                sb.append("수");
            }
        }
        answer = sb.toString();
        return answer;
    }
}