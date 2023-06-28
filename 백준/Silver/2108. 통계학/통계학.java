import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        //산술 평균
        int avg = average(sum, n);
        sb.append(avg).append("\n");

        //중앙값
        int[] median = median(arr, n);
        if (median.length == 1) {
            sb.append(median[0]).append("\n");
        }

        if (median.length == 2) {
            sb.append(median[0]).append(" ").append(median[1]).append("\n");
        }

        //최빈값
        int mod = mod(arr, n);
        sb.append(mod).append("\n");

        //범위
        int range = range(arr, n);
        sb.append(range).append("\n");

        System.out.print(sb);
    }

    public static int average(int sum, int n) {
        return (int)Math.round((double) sum / n);
    }

    public static int[] median(int[] arr, int n) {
        Arrays.sort(arr);
        int[] medianArr;

        if (n % 2 == 1) {
            medianArr = new int[1];
            medianArr[0] = arr[n / 2];
        } else {
            medianArr = new int[2];
            medianArr[0] = arr[n / 2];
            medianArr[1] = arr[n / 2 + 1];
        }

        return medianArr;
    }

    public static int mod(int[] arr, int n) {
        int firstNum = arr[0];
        int range = arr[n - 1] - firstNum + 1;
        int[] numCount = new int[range];

        for (int i = 0; i < n; i++) {
            numCount[arr[i] - firstNum]++;
        }

        int maxCountNum = 0;
        for (int i = 0; i < range; i++) {
            if (maxCountNum < numCount[i]) maxCountNum = numCount[i];
        }

        int count = 0;
        int idx = 0;
        for (int i = 0; i < range; i++) {
            if (maxCountNum == numCount[i]) {
                count++;
                idx = i;
            }
            if (count >= 2) {
                break;
            }
        }

        return firstNum + idx;
    }


    public static int range(int[] arr, int n) {
        int max = -4000;
        int min = 4000;

        for (int i = 0; i < n; i++) {
            if (max < arr[i]) max = arr[i];
            if (min > arr[i]) min = arr[i];
        }

        return max - min;
    }
}