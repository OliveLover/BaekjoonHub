import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> temp = new ArrayList<>();

        while(n>0){
            temp.add(n%3);
            n /= 3;
        }
        int tempLength = temp.size();

        for (int i=0; i<tempLength; i++){
            answer += (Math.pow(3,tempLength-i-1)*temp.get(i));
        }
        return answer;
    }
}