class Solution {
    public String solution(String str1, String str2) {
        int str1Length = str1.length();
        int str2Length = str2.length();
        int totalLength = str1Length + str2Length ;

        String answer = "";

        boolean odd = false;
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < totalLength; i++) {
            if(odd) {
                answer += String.valueOf(str2.charAt(oddCount));
                oddCount++;
                odd = false;
            } else {
                answer += String.valueOf(str1.charAt(evenCount));
                evenCount++;
                odd = true;
            }
        }

        return answer;
    }
}