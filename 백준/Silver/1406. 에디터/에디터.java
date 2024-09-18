import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String text = br.readLine();
        int textLength = text.length();

        LinkedList<Character> strLine = new LinkedList<>();

        for (int i = 0; i < textLength; i++) {
            strLine.add(text.charAt(i));
        }

        int n = Integer.parseInt(br.readLine());

        ListIterator<Character> iter = strLine.listIterator();

        while (iter.hasNext()) {
            iter.next();
        }

        for (int i = 0; i < n; i++) {
            String inputStr = br.readLine();
            char command = inputStr.charAt(0);

            switch (command) {
                case 'P':
                    iter.add(inputStr.charAt(2));
                    break;
                case 'L':
                    if (iter.hasPrevious()) {
                        iter.previous();
                    }
                    break;
                case 'D':
                    if (iter.hasNext()) {
                        iter.next();
                    }
                    break;
                default:
                    if (iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
            }
        }

        for (char c : strLine) {
            sb.append(c);
        }

        System.out.println(sb);

    }
}