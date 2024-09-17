import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            int cursor = 0;
            String str = br.readLine();
            LinkedList<Character> strLine = new LinkedList<>();
            for (int i = 0; i < str.length(); i++) {
                int curLength = strLine.size();
                char c = str.charAt(i);
                switch (c) {
                    case '<':
                        if (cursor > 0) {
                            cursor--;
                        }
                        break;
                    case '>':
                        if (cursor < curLength) {
                            cursor++;
                        }
                        break;
                    case '-':
                        if (cursor > 0) {
                            cursor--;
                            strLine.remove(cursor);
                        }
                        break;
                    default:
                        strLine.add(cursor, c);
                        cursor++;
                }
            }

            sb.append(strLine.stream().map(String::valueOf).collect(Collectors.joining())).append("\n");
        }

        System.out.print(sb);
    }
}