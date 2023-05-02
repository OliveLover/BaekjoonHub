import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String step;
        String finalStep = " clap stomp clap";
        while((step = bufferedReader.readLine()) != null) {
            Queue<Integer> wrongNumber = new ArrayDeque<>();
            String[] strArr = step.split(" ");
            List<Integer> wrongDip = new ArrayList<>();
            //1번 규칙
            int strArrLen = strArr.length;
            for (int i = 0; i < strArrLen; i++) {
                if (!strArr[i].equals("dip")) continue;
                boolean case1 = false;
                boolean case2 = false;
                boolean case3 = false;
                if (strArr.length != i + 1) {
                    if (strArr[i].equals("dip") && strArr[i + 1].equals("twirl")) {
                        case1 = true;
                    }
                }

                if (i >= 1) {
                    if (strArr[i].equals("dip")) {
                        if (strArr[i - 1].equals("jiggle")) {
                            case2 = true;
                        }
                    }
                }
                if (i >= 2) {
                    if (strArr[i].equals("dip")) {
                        if (strArr[i - 2].equals("jiggle")) {
                            case3 = true;
                        }
                    }
                }
                if (!(case1 || case2 || case3)) {
                    wrongDip.add(i);
                    strArr[i] = "DIP";
                }
            }
            if (wrongDip.size() != 0) {
                wrongNumber.offer(1);
            }
            step = String.join(" ", strArr);

            //2번 규칙
            if (step.length() >= 16) {
                if (!step.substring(step.length() - 16, step.length()).equals(finalStep)) {
                    wrongNumber.offer(2);
                }
            } else {
                wrongNumber.offer(2);
            }


            //3번 규칙
            if (step.contains("twirl")) {
                if (!step.contains("hop")) {
                    wrongNumber.offer(3);
                }
            }
            //4번 규칙
            if (step.startsWith("jiggle")) {
                wrongNumber.offer(4);
            }
            //5번 규칙
            if (!step.contains("dip") && !step.contains("DIP")) {
                wrongNumber.offer(5);
            }

            if(wrongNumber.size() == 0) {
                System.out.println("form ok: " + step);
            } else if(wrongNumber.size() == 1){
                System.out.println("form error " + wrongNumber.peek() + ": " + step);
            } else if(wrongNumber.size() == 2){
                System.out.println("form errors " + wrongNumber.poll() + " and " + wrongNumber.poll() + ": " + step);
            } else if(wrongNumber.size() == 3) {
                System.out.println("form errors " + wrongNumber.poll() + ", " + wrongNumber.poll() + " and " + wrongNumber.poll() + ": " + step);
            } else if(wrongNumber.size() == 4) {
                System.out.println("form errors " + wrongNumber.poll() + ", " +wrongNumber.poll() + ", " + wrongNumber.poll() + " and " + wrongNumber.poll() + ": " + step);
            } else {
                System.out.println("form errors " +wrongNumber.poll() + ", " + wrongNumber.poll() + ", " +wrongNumber.poll() + ", " + wrongNumber.poll() + " and " + wrongNumber.poll() + ": " + step);
            }

        }
        bufferedReader.close();
    }
        }



