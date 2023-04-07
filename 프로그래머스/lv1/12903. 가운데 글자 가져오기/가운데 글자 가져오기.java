class Solution {
    public String solution(String s) {
        String answer = "";
        int center = s.length()/2;
        //String 길이가 짝수 일때
        if(s.length()%2==0){
            answer = s.charAt(center-1) + String.valueOf(s.charAt(center));

        }
        //String 길이가 홀수 일때
        else{
            answer= String.valueOf(s.charAt(center));
        }
        return answer;
    }
}