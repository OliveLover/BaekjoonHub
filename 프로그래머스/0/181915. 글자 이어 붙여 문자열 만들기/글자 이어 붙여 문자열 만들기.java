class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char[] charactors = my_string.toCharArray();
        
        for (int number : index_list) {
            answer += charactors[number];
        }
        
        return answer;
    }
}