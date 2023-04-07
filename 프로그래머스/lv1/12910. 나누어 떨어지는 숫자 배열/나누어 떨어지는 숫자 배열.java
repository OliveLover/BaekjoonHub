import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int count = 0;

        int arrLength = arr.length;
        for (int i=0; i<arrLength; i++) {
            if(arr[i]%divisor==0){
                count++;
                
            }else {
                arr[i] = 0;
            }
        }

        int j = 0;
        answer = new int[count];
        for(int i =0; i<arrLength; i++) {
            if (arr[i] != 0) {
                answer[j] = arr[i];
                j++;
            }
        }

        if(count ==0){
            answer = new int[1];
            answer[0] = -1;
        }

        Arrays.sort(answer);
        return answer;
    }
}