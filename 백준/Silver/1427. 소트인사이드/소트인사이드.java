import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    String n = br.readLine();
    int strLen = n.length();

    int[] arr = new int[strLen];
    for(int i=0; i<strLen; i++) {
      arr[i] = n.charAt(i)-48;
    }

    for(int i=0; i<strLen; i++) {
      int max = 0;
      for(int j=i; j<strLen; j++) {
        if(max < arr[j]) {
          max = arr[j];
        }
      }
      
      for(int j=i; j<strLen; j++) {
        if(max == arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
      
      sb.append(arr[i]);
   
    }
    
    System.out.println(sb);
  
  }
}