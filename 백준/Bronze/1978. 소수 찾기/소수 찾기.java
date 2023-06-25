import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    int[] arr = new int[n];

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    
    for(int i=0; i<n; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    ArrayList<Boolean> primeList = new ArrayList<>(1001);

    primeList.add(false);
    primeList.add(false);

    for(int i=2; i<=1001; i++) {
      primeList.add(i, true);
    }

    for(int i=2; i*i<=1001; i++) {
      if(primeList.get(i)) {
        for(int j=i*i; j<=1001; j+= i) primeList.set(j, false);
      }
    }

    int count = 0;
    
    for(int i=0; i<n; i++) {
      if(primeList.get(arr[i])) count++;
    }

    System.out.println(count);
    
  }
}