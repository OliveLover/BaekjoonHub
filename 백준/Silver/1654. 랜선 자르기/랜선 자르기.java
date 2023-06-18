import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int k = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());
    
    int[] lineList = new int[k];

    long high = 0;
    
    for(int i = 0; i < k; i++) {
      lineList[i] = Integer.parseInt(br.readLine());
      if(high < lineList[i]) high = lineList[i];
    }

    high++;
    long low = 1;
    

    while(low<high) {
      long mid = (low + high) / 2;
      long count = 0;
      
      for(int i = 0; i < k; i++) {
        count += lineList[i] / mid;
      }

      if(count < n) {
        high = mid;
      } else {
        low = mid + 1;
      } 
        }

    System.out.println(low-1);
  }
}