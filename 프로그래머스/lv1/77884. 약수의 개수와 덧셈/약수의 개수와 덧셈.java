class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i=left; i<=right; i++) {

            //약수의 갯수 check
            int measureCount = 0;
            for(int j=1; j <= i; j++) {
                if(i%j == 0) {
                    measureCount ++;
                }
            }

            //짝수인경우 더하기 홀수인 경우 빼기
            if(measureCount %2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }


        return answer;
    }
}