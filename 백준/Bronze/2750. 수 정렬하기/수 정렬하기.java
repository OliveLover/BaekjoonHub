import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];

    for(int i=0; i<n; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }
    
    arr = bubleSort(arr, n);

    for(int i=0; i<n; i++) {
      sb.append(arr[i]).append("\n");
    }

    System.out.print(sb);
    
  }

  public static int[] bubleSort(int[] arr, int n) {
    for(int i=0; i<n-1; i++) {
      for(int j=0; j<n-1-i; j++) {
        int temp = 0;
        if(arr[j] >= arr[j+1]) {
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    return arr;
  }
 
}