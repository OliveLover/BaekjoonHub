import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        //int[]  = Arrays.copyOfRange(array, commands[commands.length][3]);

        //int[] command = new int[commands.length];
        for(int i = 0; i<commands.length; i++){
            //command = commands[i];
            int[] command = Arrays.copyOfRange(array, commands[i][0]-1,commands[i][1]);

            System.out.println("정렬 전 :" +Arrays.toString(command));

            Arrays.sort(command);

            System.out.println("정렬 후 : " + Arrays.toString(command));
            answer[i] = command[commands[i][2]-1];
        }

        return answer;
    }
}