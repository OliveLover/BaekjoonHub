import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = scanner.nextInt();
        int[][] coordinate = new int[n][2];

        for(int i=0; i<n; i++) {
            coordinate[i][0] = scanner.nextInt();
            coordinate[i][1]= scanner.nextInt();
        }
        Arrays.sort(coordinate, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                //첫번째 숫자가 같으면
                if(o1[1] == o2[1]) {
                    //두번째 숫자 오름차순
                    return o1[0] - o2[0];
                }
                else {
                    //아니라면 첫번째 숫자 오름차순
                   return o1[1] - o2[1];
                }
            }
        });

        //출력확인
        for(int i=0; i<n; i++) {
            sb.append(coordinate[i][0] + " "+coordinate[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}