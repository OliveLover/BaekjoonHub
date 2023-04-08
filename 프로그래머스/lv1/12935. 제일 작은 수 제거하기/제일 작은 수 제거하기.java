import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        if (arr.length <= 1) {
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        } else {
            for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
            }
            int min = arr[0]; // 기준값

            for(int i=0; i< arr.length; i++){
                min =Math.min(min,arr[i]);
            } // min 최솟값 > 가장 작은 수 구하기

            list.remove(Integer.valueOf(min));

            int[] answer = new int[list.size()];

            for (int i = 0; i < answer.length; i++) {
                answer[i] = list.get(i);
            }
            return answer;
        }
    }
}