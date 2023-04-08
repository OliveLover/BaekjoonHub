import java.util.Objects;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int idx = 0;
        for (String s : seoul) {
            if (Objects.equals("Kim", s)) {
                return "김서방은 "+idx+"에 있다";
            }
            idx++;
        }
        return "0";
    }
}