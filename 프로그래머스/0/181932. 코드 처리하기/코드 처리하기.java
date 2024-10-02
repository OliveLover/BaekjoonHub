class Solution {
    public String solution(String code) {
        String answer = "";
        int condLength = code.length();

        boolean flag = true;
        int mode = 0;
        for (int i = 0; i < condLength; i++) {
            char c = code.charAt(i);

            if (c == ' ') {
                flag = false;
                break;
            }

            if (c == '1' && mode == 0) {
                mode = 1;
                continue;
            }

            if (c == '1' && mode == 1) {
                mode = 0;
                continue;
            }

            if (mode == 0 && i % 2 == 0) {
                answer += String.valueOf(code.charAt(i));
            }

            if (mode == 1 && i % 2 == 1) {
                answer += String.valueOf(code.charAt(i));
            }
        }

        if (answer.equals("")) {
            flag = false;
        }

        if (flag) {
            return answer;
        } else {
            return "EMPTY";
        }
    }
}