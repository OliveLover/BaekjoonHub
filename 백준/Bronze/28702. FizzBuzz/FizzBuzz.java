import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  static int n = 3;
  static String[] originalArr;
  static long[] numArr;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    originalArr = new String[n];
    numArr = new long[n];

    for (int i = 0; i < n; i++) {
      originalArr[i] = br.readLine();
    }

    transNumArr();

    System.out.print(fizzBuzz());

  }

  static void transNumArr() {
    for (int i = 0; i < n; i++) {
      try {
        numArr[i] = Long.parseLong(originalArr[i]);

        if (i == 0) {
          numArr[1] = numArr[0] + 1;
          numArr[2] = numArr[0] + 2;
        } else if (i == 1) {
          numArr[0] = numArr[1] - 1;
          numArr[2] = numArr[1] + 1;
        } else {
          numArr[0] = numArr[2] - 2;
          numArr[1] = numArr[2] - 1;
        }

      } catch (Exception e) {
        continue;
      }
    }
  }

  static String fizzBuzz() {
    long nextNum = numArr[2] + 1L;

    if (nextNum % 3 == 0 && nextNum % 5 == 0) {
      return "FizzBuzz";
    } else if (nextNum % 3 == 0 && nextNum % 5 != 0) {
      return "Fizz";
    } else if (nextNum % 3 != 0 && nextNum % 5 == 0) {
      return "Buzz";
    } else {
      return String.valueOf(nextNum);
    }
  }
}