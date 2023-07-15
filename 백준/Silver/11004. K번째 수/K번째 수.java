import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {
    private static final int INSERTION_SORT_THRESHOLD = 10;
    private static final Random random = new Random();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        quickSort(arr, 0, n - 1, k - 1);

        System.out.println(arr[k - 1]);
    }

    public static void quickSort(int[] arr, int s, int e, int k) {
        if (s < e) {
            if (e - s + 1 <= INSERTION_SORT_THRESHOLD) {
                insertionSort(arr, s, e);
                return;
            }

            int pivotIndex = random.nextInt(e - s + 1) + s;
            int pivot = arr[pivotIndex];

            int left = s;
            int right = e;

            while (left <= right) {
                while (arr[left] < pivot) {
                    left++;
                }
                while (arr[right] > pivot) {
                    right--;
                }
                if (left <= right) {
                    swap(arr, left, right);
                    left++;
                    right--;
                }
            }

            if (k <= right) {
                quickSort(arr, s, right, k);
            } else if (k >= left) {
                quickSort(arr, left, e, k);
            }
        }
    }

    public static void insertionSort(int[] arr, int s, int e) {
        for (int i = s + 1; i <= e; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= s && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}