class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int sLength = s.length();
        int countCheck = 0;

        for (int i =0; i<sLength; i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                countCheck++;
            }
        }
        if(sLength == 4 || sLength == 6) {
            if (countCheck == sLength) {
                answer = true;
            } else {
                answer = false;
            }
        } else {
            answer = false;
        }
        
        return answer;
    }
}