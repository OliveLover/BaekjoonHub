import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String ascending = "1 2 3 4 5 6 7 8";
        String descending = "8 7 6 5 4 3 2 1";
        String n = br.readLine();
        String result = "mixed";

        if(n.equals(ascending)) result = "ascending";
        if(n.equals(descending)) result = "descending";

        sb.append(result);

        System.out.print(sb);
    }
}