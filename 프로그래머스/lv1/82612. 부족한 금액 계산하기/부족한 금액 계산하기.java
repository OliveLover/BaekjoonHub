class Solution {
    public long solution(long price, long money, int count) {
        long answer = -1;
        int ncount = 0;

        //count이하 까지 다 더하기
        for(int i=1; i <= count; i++){
            ncount += i;
        }
        answer= ncount * price - money;

        if(answer <=0){
            return 0;
        }else{
            return answer;
        }

    }
}