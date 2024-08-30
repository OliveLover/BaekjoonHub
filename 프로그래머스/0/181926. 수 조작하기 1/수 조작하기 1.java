class Solution {
    public int solution(int n, String control) {
        int strLength = control.length();

        for (int i = 0; i < strLength; i++) {
            char c = control.charAt(i);

            if (c == 'w') {
                n++;
            } else if (c == 's') {
                n--;
            } else if (c == 'd') {
                n += 10;
            } else if (c == 'a') {
                n -= 10;
            }
        }
        return n;
    }
}