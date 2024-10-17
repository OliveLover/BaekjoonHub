class Solution {
    public int solution(String number) {
        int answer = 0;
        int strNumLength = number.length();

        int sum = 0;
        for (int i = 0; i < strNumLength; i++) {
            sum += (int) number.charAt(i) - '0';
        }

        answer = sum % 9;

        return answer;
    }
}