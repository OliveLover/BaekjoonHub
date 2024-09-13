import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alphaArr = new int[26];

        String str1 = br.readLine();
        int str1Length = str1.length();

        String str2 = br.readLine();
        int str2Length = str2.length();

        for (int i = 0; i < str1Length; i++) {
            alphaArr[str1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str2Length; i++) {
            alphaArr[str2.charAt(i) - 'a']--;
        }
        
        int count = Arrays.stream(alphaArr).filter(e -> e != 0).map(Math::abs).sum();

        System.out.println(count);
    }
}