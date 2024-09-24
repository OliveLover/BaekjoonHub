class Solution {
    public int solution(int[] num_list) {
        int num_list_length = num_list.length;
        String odd = "";
        String even = "";
        
        for (int i = 0; i < num_list_length; i++ ) {
            int cur = num_list[i];
            
            if (cur % 2 == 0) {
                even += String.valueOf(num_list[i]);
            } else {
                odd += String.valueOf(num_list[i]);
            }
            
        }
        
        return Integer.valueOf(even) + Integer.valueOf(odd);
    }
}