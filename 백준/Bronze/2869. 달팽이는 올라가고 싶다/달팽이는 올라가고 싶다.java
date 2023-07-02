import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextInt();
        int b = scanner.nextInt();
        int v = scanner.nextInt();
        int day;

        System.out.println((int)Math.ceil((v-b)/(a-b)));
    }
}