import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        
        list.add(n);
        while(n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
               n = 3 * n + 1;
            }
            
            list.add(n);
            count++;
        }
        
        int[] answer = new int[list.size()];
        
        int i = 0;
        for (int num : list) {
            answer[i] = num;
            i++;
        }
        
        return answer;
    }
}