import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        if (n % 2 == 1) {
            return IntStream.range(1, n + 1)
                    .boxed()
                    .filter(num -> num % 2 == 1)
                    .reduce(Integer::sum)
                    .orElse(0);
        } else {
            return IntStream.range(1, n + 1)
                    .boxed()
                    .filter(num -> num % 2 == 0)
                    .map(num -> num * num)
                    .reduce(Integer::sum)
                    .orElse(0);
        }
    }
}