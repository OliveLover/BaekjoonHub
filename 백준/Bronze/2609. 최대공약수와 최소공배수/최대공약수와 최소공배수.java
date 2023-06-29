import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");   //공백으로 자르는 함수?
        StringBuilder sb = new StringBuilder();

        int firstNum = Integer.parseInt(st.nextToken());
        int lastNum = Integer.parseInt(st.nextToken());

        int gcd = calcGcd(firstNum, lastNum);
        sb.append(gcd).append('\n');
        sb.append((firstNum * lastNum) / gcd);
        System.out.println(sb);
    }
    //최대공약수 => 유클리드 호제법
    public static int calcGcd(int big, int small) {
        if(big % small == 0) {
            return small;
        }

        return calcGcd(small, big % small);
    }
}