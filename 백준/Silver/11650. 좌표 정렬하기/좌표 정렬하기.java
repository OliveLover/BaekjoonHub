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

        List<List<Integer>> numList = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            numList.add(new ArrayList<>());
            st = new StringTokenizer(br.readLine(), " ");

            numList.get(i).add(Integer.parseInt(st.nextToken()));
            numList.get(i).add(Integer.parseInt(st.nextToken()));
        }

        numList.sort((o1, o2) -> {
            if(Objects.equals(o1.get(0), o2.get(0))) {
                return o1.get(1).compareTo(o2.get(1));
            }
            return o1.get(0).compareTo(o2.get(0));
        });

        for(int i = 0; i < n; i++) {
            sb.append(numList.get(i).get(0)).append(" ");
            sb.append(numList.get(i).get(1)).append("\n");
        }

        System.out.println(sb);
    }
}