import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> pokemons = new HashMap<>();
        String[] nameArr = new String[n];

        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            pokemons.put(name, i + 1);
            nameArr[i] = name;
        }

        for (int i = 0; i < m; i++) {
            String str = br.readLine();

            sb.append(str.matches("\\d*") ? nameArr[Integer.parseInt(str) - 1] : pokemons.get(str)).append("\n");
        }

        System.out.print(sb);
    }
}