import java.io.BufferedReader;
import java.util.Arrays;
import java.io.InputStreamReader;

public class Main {
  public static void main(String args[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String words = br.readLine().toUpperCase();
    int[] alphaCheck = new int[26];

    int wordsLength = words.length();
    for(int i=0; i<wordsLength; i++) {
      char w = words.charAt(i);
        alphaCheck[w-65] ++;
    }
    
    int max = 0;
    int maxCount = 0;
    int maxIdx = -1;
    for(int i=0; i<26; i++) {
      if(max < alphaCheck[i]) {
        max = alphaCheck[i];
        maxIdx = i; 
      }
    }

    for(int i=0; i<26; i++) {
      if(max == alphaCheck[i]) maxCount++; 
    }
    
    if(maxCount > 1) {
      System.out.println('?');
    } else {
      System.out.println((char)(maxIdx+65));
    }
   }
}