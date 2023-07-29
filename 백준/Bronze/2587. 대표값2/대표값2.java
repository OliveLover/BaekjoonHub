import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    static int[] tmp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = 5;

        tmp = new int[n];
        int[] arr = IntStream.range(0, n)
                .map(i -> {
                    try {
                        return Integer.parseInt(br.readLine());
                    } catch (NumberFormatException | IOException ex) {
                        System.out.println("잘못된 숫자 형식 입니다.");
                        return 0;
                    }
                })
                .toArray();

        int avg = average(arr, 0, n - 1);

        sb.append(avg).append("\n");

        mergeSort(arr, 0, n - 1);

        sb.append(arr[n/2]);

        System.out.print(sb);
    }

    private static int average(int[] arr, int s, int e) {
        return Arrays.stream(arr, s, e + 1)
                .sum() / (e + 1 - s);
    }

    public static void mergeSort(int[] arr, int s, int e) {
        if (e - s < 1) return;

        int m = s + (e - s) / 2;
        mergeSort(arr, s, m);
        mergeSort(arr, m + 1, e);

        if (e + 1 - s >= 0) System.arraycopy(arr, s, tmp, s, e + 1 - s);

        int k = s;
        int index1 = s;
        int index2 = m + 1;

        while (index1 <= m && index2 <= e) {
            if (tmp[index1] > tmp[index2]) {
                arr[k] = tmp[index2];
                index2++;
                k++;
            } else {
                arr[k] = tmp[index1];
                index1++;
                k++;
            }
        }

        while (index1 <= m) {
            arr[k] = tmp[index1];
            k++;
            index1++;
        }
        while (index2 <= e) {
            arr[k] = tmp[index2];
            k++;
            index2++;
        }
    }
}