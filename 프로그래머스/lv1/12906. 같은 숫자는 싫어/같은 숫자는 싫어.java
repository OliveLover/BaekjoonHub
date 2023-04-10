import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int a = 10;

        ArrayList<Integer> arr2 = new ArrayList<>();

        for ( int num : arr){
            if (a!= num){
                arr2.add(num);
            }
            a = num;
        }

        answer = new int[arr2.size()];

        int answerLength = answer.length;
        for(int i=0; i< answerLength ; i++){
            answer[i] = arr2.get(i);
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        return answer;
    }
}