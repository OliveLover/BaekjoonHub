import java.util.Arrays;
import java.util.Comparator;

class Solution {
    int m;

    public String[] solution(String[] strings, int n) {
        //setM(n);
        m = n;
        Arrays.sort(strings, new StringComparator());

        return strings;

    }

    /*public void setM(int n) {
        m = n;
    }*/

    class StringComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {

            if(s1.charAt(m)==s2.charAt(m)){
                return s1.compareTo(s2);
            }
            return s1.charAt(m)-s2.charAt(m);
//            
        }
    }
}