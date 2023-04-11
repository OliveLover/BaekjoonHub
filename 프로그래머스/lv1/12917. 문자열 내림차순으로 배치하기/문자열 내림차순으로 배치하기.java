import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer ="";
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());

        answer =String.join("",arr);

        return answer;
    }
}