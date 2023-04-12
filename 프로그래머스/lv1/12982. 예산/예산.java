import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);
        for(int i=0; i< d.length; i++){
            budget -= d[i];
            if(budget <0) break;
            answer++;



            //            if(d[i] <= budget) { //예산 범위에서 지원
//                answer++;
//            budget -= d[i];//지원한 금액만큼 예산에서 차감
//
//
//            }else { //예산을 초과하면 반복문 탈출
//                break;
//
            }

        return answer;

    }
}