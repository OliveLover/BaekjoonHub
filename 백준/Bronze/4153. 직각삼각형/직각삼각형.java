import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;
        int c;

        do {
            int[] triangleSide = new int[3];
            triangleSide[0] = scanner.nextInt();
            triangleSide[1] = scanner.nextInt();
            triangleSide[2] = scanner.nextInt();

            Arrays.sort(triangleSide);

            a = triangleSide[0];
            b = triangleSide[1];
            c = triangleSide[2];

            if(a==0 && b == 0 && c == 0) break;

            if (a * a + b * b == c * c) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

        } while (a != 0 && b != 0 && c != 0);

    }
}