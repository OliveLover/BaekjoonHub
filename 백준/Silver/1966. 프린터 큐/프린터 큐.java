import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.LinkedList;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int testCase = Integer.parseInt(br.readLine());

    while(testCase-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int n = Integer.parseInt(st.nextToken());
      int m = Integer.parseInt(st.nextToken());

      LinkedList<int[]> q = new LinkedList<>();

      st = new StringTokenizer(br.readLine(), " ");
      for(int i=0; i<n; i++) {
        q.offer(new int[] {i, Integer.parseInt(st.nextToken())});
      }

      int count = 0;
      
      while(!q.isEmpty()) {
        int[] front = q.poll();
        boolean isMax = true;

        int size = q.size();
        for(int j=0; j<size; j++) {
          if(front[1] < q.get(j)[1]) {
            q.offer(front);
            for(int k=0; k<j; k++) {
              q.offer(q.poll());
            }
            isMax = false;
            break;
          }
        }

        if(isMax == false) continue;

        count++;
        if(front[0] == m) break;
      }

      sb.append(count).append("\n");
    }

    System.out.print(sb);
  }
}