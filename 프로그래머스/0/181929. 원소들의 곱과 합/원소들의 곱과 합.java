class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        long result1 = 1;
        long result2 = 0;
        
        int num_list_length = num_list.length;
        
        for (int i = 0; i < num_list_length; i++) {
            result1 *= num_list[i];
            result2 += num_list[i];
        }
        
        if (result1 < result2 * result2) {
            return 1;
        } else {
            return 0;
        }
        
    }
}