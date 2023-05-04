import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Boolean> primeList;

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] numList = new int[n];
        for(int i = 0; i < n; i++) {
            numList[i] = scanner.nextInt();
        }

        primeList = new ArrayList<Boolean>(1001);

        primeList.add(false);
        primeList.add(false);

        for(int i=2; i<=1000; i++) primeList.add(i,true);

        for (int i = 2; (i * i) <= 1000; i++) {
            if (primeList.get(i)) {
                for (int j = i * i; j <= 1000; j += i) primeList.set(j, false);
            }
        }
        int count = 0;
        for (int i : numList) {
            if (primeList.get(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}