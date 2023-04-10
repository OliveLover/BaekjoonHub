class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        int matchCount = 0;
        int zeroCount = 0;
        for (int lotto : lottos) {
            if(lotto == 0){
                zeroCount ++;
            }
            for (int winNum : win_nums) {
                if (lotto == winNum) {
                    matchCount++;
                }
            }
        }
        answer = new int[2];
        switch (matchCount) {
            case 0, 1 -> answer[1] = 6;
            case 2 -> answer[1] = 5;
            case 3 -> answer[1] = 4;
            case 4 -> answer[1] = 3;
            case 5 -> answer[1] = 2;
            case 6 -> answer[1] = 1;
        }

        if(zeroCount > 5) {
            answer[0] = answer[1] - 5;
        } else {
            answer[0] = answer[1] - zeroCount;
        }

        return answer;
    }
}