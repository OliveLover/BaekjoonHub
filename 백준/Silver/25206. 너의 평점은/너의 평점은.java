import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        double totalSumCredit = 0;
        double totalSumCreditByGrade = 0;
        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());

            String subjectName = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            double gradeScore;

            if (grade.equals("P")) {
                continue;
            }

            switch (grade) {
                case "A+" : gradeScore = 4.5; break;
                case "A0" : gradeScore = 4.0; break;
                case "B+" : gradeScore = 3.5; break;
                case "B0" : gradeScore = 3.0; break;
                case "C+" : gradeScore = 2.5; break;
                case "C0" : gradeScore = 2.0; break;
                case "D+" : gradeScore = 1.5; break;
                case "D0" : gradeScore = 1.0; break;
                default: gradeScore = 0.0; break;
            }

            totalSumCredit += credit;
            totalSumCreditByGrade += (credit * gradeScore);
        }

        double result = totalSumCreditByGrade / totalSumCredit;
        System.out.println(result);
    }
}