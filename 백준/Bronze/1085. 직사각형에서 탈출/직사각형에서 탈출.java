import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 1000;

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int case1 = w - x;
        int case2 = h - y;

        if(min >= x) {
            min = x;
        }
        if(min >= case1) {
            min = case1;
        }
        if(min >= y) {
            min = y;
        }
        if(min >= case2) {
            min = case2;
        }
        System.out.println(min);
    }
}