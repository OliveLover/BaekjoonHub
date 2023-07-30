import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] tmp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        tmp = new int[n];

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .limit(n)
                .mapToInt(Integer::parseInt)
                .toArray();

        mergeSort(arr, 0, n - 1);

        System.out.println(arr[k - 1]);
    }

    public static void mergeSort(int[] arr, int s, int e) {
        if(e - s < 1) return;

        int m = s + (e - s) / 2;

        mergeSort(arr, s, m);
        mergeSort(arr, m + 1, e);

        if(e + 1 - s >= 0) System.arraycopy(arr, s, tmp, s, e + 1 - s);

        int k = s;
        int index1 = s;
        int index2 = m + 1;

        while(index1 <= m && index2 <= e) {
            if(tmp[index1] > tmp[index2]) {
                arr[k] = tmp[index1];
                k++;
                index1++;
            } else {
                arr[k] = tmp[index2];
                k++;
                index2++;
            }
        }

        while(index1 <= m) {
            arr[k] = tmp[index1];
            k++;
            index1++;
        }

        while(index2 <= e) {
            arr[k] = tmp[index2];
            k++;
            index2++;
        }
    }
}