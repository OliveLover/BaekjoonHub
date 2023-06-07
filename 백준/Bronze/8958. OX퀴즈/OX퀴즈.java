import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int points;
        int score;

        for(int i=0; i<n; i++) {
            String quiz = br.readLine();
            points = 0;
            score = 0;
            int quizLength = quiz.length();
            for(int j=0; j<quizLength; j++) {
                char q = quiz.charAt(j);
                if(q == 'O') {
                    points += 1;
                    score += points;
                } else {
                    points = 0;
                    score += points;
                }
            }
            sb.append(score).append("\n");
        }
        System.out.print(sb);
    }
}