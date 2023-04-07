import java.time.LocalDate;

class Solution {
   public String solution(int a, int b) {
       String answer = " ";
       LocalDate date = LocalDate.of(2016, a, b);
       int week = date.getDayOfWeek().getValue();

       switch (week) {
           case 7 -> answer = "SUN";
           case 1-> answer = "MON";
           case 2 -> answer = "TUE";
           case 3 -> answer = "WED";
           case 4 -> answer = "THU";
           case 5 -> answer = "FRI";
           case 6 -> answer = "SAT";
       }

       return answer;
   }
}