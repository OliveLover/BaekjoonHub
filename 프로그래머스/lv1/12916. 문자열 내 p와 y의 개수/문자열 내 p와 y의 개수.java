import java.util.Locale;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0, y = 0;
        s = s.toLowerCase(Locale.ENGLISH);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p'){
                p++;
            }else if (s.charAt(i) == 'y') {
                y++;
            }
        }
        if (p == 0 && y == 0) {
            return true;
        }else if (p == y) {
            return true;
        }else {
            return false;
        }
    }
}