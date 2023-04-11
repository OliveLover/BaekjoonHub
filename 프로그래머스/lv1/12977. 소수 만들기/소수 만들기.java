import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] nums) {
        int answer = -1;
        int numLen = nums.length;

        List<Integer> sumList = new ArrayList<>();
        for(int i=0; i< numLen-2; i++){
            for(int j=i+1; j<numLen-1; j++){
                for(int k=j+1; k<numLen; k++) {
                    sumList.add(nums[i]+nums[j]+nums[k]);
                }
            }
        }

        System.out.println("sumList = " + sumList);
        //sumList에 있는 숫자들을 소수인지 아닌지 판별하여 카운트
        int count = 0;
        for (Integer integer : sumList) {
            int numcount = 0;
            for(int i = 2; i<integer;i++){
                if(integer%i == 0) {
                    numcount++;
                }
            }
            if(numcount == 0) count++;
        }

        answer = count;


        return answer;
    }
}