class Solution {
    public int solution(int n) {
        int answer = 0;
        
        do {
            answer++;
        }
        while(n % answer != 1);
        
        return answer;
    }
}