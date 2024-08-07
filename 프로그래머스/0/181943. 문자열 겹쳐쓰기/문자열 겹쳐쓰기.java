class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        int myLength = my_string.length();
        int overLength = overwrite_string.length();
        char[] charArr = new char[myLength];
        
        for(int i = 0; i < myLength; i++) {
            charArr[i] = my_string.charAt(i);
        }
        
        for (int i = 0; i < overLength; i++) {
            charArr[s + i] = overwrite_string.charAt(i);
        }
        
        String answer = "";
        for (char c : charArr) {
            answer += c;
        }
        
        return answer;
    }
}