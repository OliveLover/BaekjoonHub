import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

    static LinkedList<Integer> linkedList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arrayList = new ArrayList<>();

        linkedList = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            linkedList.add(i);
        }

        for (int i = 0; i < n; i++) {
            rotate(k);
            arrayList.add(linkedList.pollFirst());
        }

        String str = arrayList.stream().map(String::valueOf).collect(Collectors.joining(", "));
        System.out.println("<" + str + ">");

    }

    public static void rotate(int k) {
        while (k > 1) {
            linkedList.offerLast(linkedList.pollFirst());
            k--;
        }
    }
}