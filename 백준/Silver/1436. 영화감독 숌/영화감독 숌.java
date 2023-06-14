import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //몇번째인지
        int cnt=1;
        //number 초기값
        int num = 666;


        while(cnt!=n){
            num+=1;

            if(String.valueOf(num).contains("666")){
                cnt++;
            }
        }
        System.out.println(num);

    }
}