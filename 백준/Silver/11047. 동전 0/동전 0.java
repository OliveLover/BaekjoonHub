import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] coins = new int[n];

        for(int i=n-1; i>=0; i--) {
            coins[i] = in.nextInt();
        }

        int count = 0;
        for (int coin : coins) {
            if(coin > k) continue;

            else {
                while(k>=coin) {
                    k -=coin;
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}