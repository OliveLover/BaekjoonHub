import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Map<String, String> employees = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String state = st.nextToken();

            if (employees.containsKey(name)) employees.remove(name);
            else employees.put(name, state);
        }

        List<String> results = new ArrayList<>(employees.keySet());
        results.sort(Collections.reverseOrder());
        for (String result : results) {
            sb.append(result).append("\n");
        }

        System.out.print(sb);
    }
}