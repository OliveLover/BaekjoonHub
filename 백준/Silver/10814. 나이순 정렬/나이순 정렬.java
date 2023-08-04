import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        List<List<Object>> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            list.add(new ArrayList<>());

            st = new StringTokenizer(br.readLine());
            list.get(i).add(Integer.parseInt(st.nextToken()));
            list.get(i).add(st.nextToken());
        }

        list.sort(new Comparator<List<Object>>() {
            @Override
            public int compare(List<Object> o1, List<Object> o2) {
                int age1 = (int) o1.get(0);
                int age2 = (int) o2.get(0);

                return Integer.compare(age1, age2);

            }
        });

        for(int i = 0; i < n; i++) {
                sb.append(list.get(i).get(0)).append(" ");
                sb.append(list.get(i).get(1)).append("\n");
        }

        System.out.print(sb);
    }
}