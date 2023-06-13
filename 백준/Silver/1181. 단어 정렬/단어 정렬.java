import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<String> sortList = new ArrayList<>();

        for(int i=0; i<n; i++) {
            sortList.add(br.readLine());
        }
        sortList.stream().distinct().sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()<o2.length()) {
                    return -1;
                }
                if(o1.length()==o2.length()) {
                    return o1.compareTo(o2);
                }
                return 1;
            }
        }).forEach(System.out::println);
    }
}