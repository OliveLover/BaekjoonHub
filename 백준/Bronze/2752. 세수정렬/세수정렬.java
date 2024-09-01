import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        Stream.of(new BufferedReader(new InputStreamReader(System.in)).readLine().split(" "))
                .mapToInt(str -> Integer.parseInt(String.valueOf(str)))
                .sorted()
                .forEach(num -> System.out.print(num + " "));
    }
}