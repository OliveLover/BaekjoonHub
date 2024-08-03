import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        String a = sc.next();
        String b = sc.next();
        
        sb.append(a + b);
        
        System.out.print(sb);
    }
}