class Solution {
    public String solution(String phone_number) {
        String [] phone = phone_number.split("");

        for(int i=0; i<phone.length-4; i++){
        phone[i] = "*";
        }
        return String.join("",phone);
      }
}