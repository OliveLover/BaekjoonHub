/*
  . : 임의의 한 문자를 나타냅니다. 단, 줄바꿈 문자(\n)를 제외합니다.
[] : 대괄호 안에 들어가는 문자 중 하나와 일치합니다.
[] 안에서 ^를 사용하면 해당 문자를 제외한 문자 중 하나와 일치합니다.
-를 사용해서 범위를 표현할 수 있습니다. 예를 들어 [a-z]는 알파벳 소문자 중 하나와 일치합니다.
* : 앞의 문자가 0회 이상 반복됨을 나타냅니다.
+ : 앞의 문자가 1회 이상 반복됨을 나타냅니다.
? : 앞의 문자가 0회 또는 1회 나타남을 나타냅니다.
{n} : 앞의 문자가 n회 반복됨을 나타냅니다.
{n,} : 앞의 문자가 n회 이상 반복됨을 나타냅니다.
{n,m} : 앞의 문자가 n회 이상 m회 이하로 반복됨을 나타냅니다.
() : 괄호 안에 있는 문자를 그룹화합니다.
| : OR 연산자를 나타냅니다. A|B는 A 또는 B 중 하나와 일치합니다.
\ : 다음에 나오는 문자를 이스케이프 합니다. 예를 들어 \+는 + 기호 자체를 나타냅니다.
 */
public class Solution {

    public String solution(String new_id) {

        System.out.println("0단계 : " + new_id);

        //1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        new_id = new_id.toLowerCase();
        System.out.println("1단계 :  " + new_id);

        //2단계 new_id에서 알 파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        System.out.println("2단계 : " + new_id);

        //3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        new_id = new_id.replaceAll("[.]+",".");
        System.out.println("3단계 : " + new_id);

        //4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        if(new_id.startsWith(".")) {
            new_id = new_id.substring(1);
        }
        if(new_id.endsWith(".")) {
            new_id = new_id.substring(0,new_id.length()-1);
        }
        System.out.println("4단계 : " + new_id);

        //5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if(new_id.equals("")) {
            new_id = "a";
        }
        System.out.println("5단계 : " + new_id);

        //6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        //만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if(new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
        }
        if(new_id.endsWith(".")) {
            new_id = new_id.substring(0,new_id.length()-1);
        }
        System.out.println("6단계 : "+ new_id);

        //7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        if(new_id.length()<=2) {
            while(new_id.length() != 3) {
                new_id += String.valueOf(new_id.charAt(new_id.length()-1));
            }
        }
        System.out.println("7단계 : "+ new_id);

        return new_id;
    }
}