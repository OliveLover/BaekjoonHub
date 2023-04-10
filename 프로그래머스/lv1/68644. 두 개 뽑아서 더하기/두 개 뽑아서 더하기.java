import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> sum = new LinkedHashSet<>();
        int numberLength = numbers.length;
        for(int i=0; i< numberLength; i++){
            for(int j= i+1; j<numberLength; j++){
                sum.add(numbers[i] + numbers[j]);
            }
        }

        ArrayList<Integer> list = new ArrayList<>(sum);
        Collections.sort(list);

        answer = new int[list.size()];
        int listLength = list.size();
        for (int i=0; i<listLength;i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}