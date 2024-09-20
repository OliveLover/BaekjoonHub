class Solution {
    public int[] solution(int[] num_list) {
        int num_list_size = num_list.length;
        int[] answer = new int[num_list_size + 1];

        for (int i = 0; i < num_list_size; i++) {
            answer[i] = num_list[i];

            if (num_list_size - 1== i) {
                System.out.println("num_list_size : " + num_list_size);
                System.out.println("num_list[" + i + "] : " + num_list[i]);
                boolean flag = num_list[num_list_size - 2] < num_list[num_list_size - 1];
                if (flag) {
                    answer[i + 1] = num_list[num_list_size - 1] - num_list[num_list_size - 2];
                } else {
                    answer[i + 1] = num_list[num_list_size - 1] * 2;
                }
            }
        }
        return answer;
    }
}