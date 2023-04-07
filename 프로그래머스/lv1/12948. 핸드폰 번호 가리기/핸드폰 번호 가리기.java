class Solution {
    public String solution(String phone_number) {
        String pattern = "^[0-9]*$";
        String answer = "";

        int pnl = phone_number.length();
        if (pnl >4) {
            for (int i = 0; i<pnl-4; i++){
                answer += String.valueOf(phone_number.charAt(i)).replaceAll(pattern, "*");
            }
        }
        answer += phone_number.substring(pnl-4, pnl);

        return answer;
    }
}
