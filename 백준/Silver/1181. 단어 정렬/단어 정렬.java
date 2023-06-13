import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> tmp = new HashSet<>();

        for(int i = 0; i < N; i++)
            tmp.add(br.readLine());

        List<String> answer = new ArrayList<>(tmp);
        Collections.sort(answer, new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length())
                    return 1;
                else if (o1.length()< o2.length())
                    return -1;
                else{
                    for(int i = 0; i < o1.length(); i++){
                        if(o1.charAt(i) > o2.charAt(i))
                            return 1;
                        if(o1.charAt(i) < o2.charAt(i))
                            return -1;
                    }
                    return 0;
                }
            }
        });

        answer.forEach(System.out::println);
    }
}