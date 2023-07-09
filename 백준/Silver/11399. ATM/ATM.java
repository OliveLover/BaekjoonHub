import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Scanner scanner = new Scanner(System.in);

        //낮은 숫자 우선순위
        PriorityQueue<Integer> peopleTimes = new PriorityQueue<>();

        int n = Integer.parseInt(br.readLine());
        //int n = scanner.nextInt();

        int totalTimes = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++) {
            
            peopleTimes.offer(Integer.parseInt(st.nextToken()));
            //peopleTimes.offer(scanner.nextInt());
        }
        for(int j=n; j>0; j--) {
            totalTimes += peopleTimes.poll()*j;
        }
        System.out.println(totalTimes);
    }
}