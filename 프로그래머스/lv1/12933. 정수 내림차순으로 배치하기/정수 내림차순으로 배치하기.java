import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        StringBuilder sb = new StringBuilder();
        String strNum = String.valueOf(n);
        int strNumLength = strNum.length();
        int i = 0;
        Long[] arr = new Long[strNumLength];
        while(n>0) {
            arr[i] = n%10;
            n /= 10;
            i++;
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for (int j = 0; j < strNumLength; j++) {
            sb.append(arr[j]);
        }
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}