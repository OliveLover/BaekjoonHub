class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int countCheck = 1;

        int sLength = s.length();
        for (int i = 0; i < sLength; i++) {
            if (s.charAt(i) == ' '){
                sb.append(" ");
                countCheck = 1;
            }
            else if (countCheck %2 == 1) {
                sb.append(String.valueOf(s.charAt(i)).toUpperCase());
                countCheck++;
            } else if(countCheck % 2 == 0) {
                sb.append(String.valueOf(s.charAt(i)).toLowerCase());
                countCheck++;
            }
        }
        answer = sb.toString();
        return answer;
    }
}