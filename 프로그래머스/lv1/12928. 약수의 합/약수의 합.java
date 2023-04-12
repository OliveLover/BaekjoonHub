import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n) {
        int answer = 0;

        //약수 구하기
        List<Integer> measureList = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                measureList.add(i);
            }
        }

        //약수합 구하기
        for (Integer integer : measureList) {
            answer += integer;
        }

        return answer;
    }
}