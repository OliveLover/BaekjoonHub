import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<int[]> arrayList = new ArrayList<>();

        for(int i=0; i<n; i++) arrayList.add(new int[] {Integer.parseInt(br.readLine()), i});

        arrayList.sort(Comparator.comparingInt(a -> a[0]));

        int max = -n;

        for(int i=0; i<n; i++) {
            int result = arrayList.get(i)[1]- i;
            if(max < result) {
                max = result;
            }
        }

        System.out.println(max+1);
    }
}