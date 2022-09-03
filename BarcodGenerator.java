package aSoftUni;

import java.util.Scanner;

public class BarcodGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char firstDigits = '@', secondDigits = '@', thirdDigits = '@', fourDigits = '@';
        boolean isTrue = false;


        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.next());

        String firstString = String.valueOf(first);
        String secondString = String.valueOf(second);

        for (int i = firstString.charAt(0); i <= secondString.charAt(0); i++) {
            if (!(i % 2 == 0)) {
                firstDigits = (char) i;

            } else {
                continue;
            }
            for (int a = firstString.charAt(1); a <= secondString.charAt(1); a++) {
                if (!(a % 2 == 0)) {
                    secondDigits = (char) a;

                } else {
                    continue;
                }
                for (int w = firstString.charAt(2); w <= secondString.charAt(2); w++) {
                    if (!(w % 2 == 0)) {
                        thirdDigits = (char) w;

                    } else {
                        continue;
                    }
                    for (int s = firstString.charAt(3); s <= secondString.charAt(3); s++) {
                        if (!(s % 2 == 0)) {
                            fourDigits = (char) s;
                            isTrue = true;
                            break;
                        }
                    }

//                    if (isTrue) {
//                        break;
//                    }
                }

//                if (isTrue) {
//                    break;
//                }
            }

            System.out.println("" + firstDigits + secondDigits + thirdDigits + fourDigits);
        }
    }
}

/*
 2345
 6789
 * -----
 * 3355
 * 3357
 * 3359
 * 3375
 * 3377
 * 3379
 * 3555
 * 3557
 * 3559
 * 3575
 * 3577
 * 3579
 * 3755
 * 3757
 * 3759
 * 3775
 * 3777
 * 3779
 * 5355
 * 5357
 * 5359
 * 5375
 * 5377
 * 5379
 * 5555
 * 5557
 * 5559
 * 5575
 * 5577
 * 5579
 * 5755
 * 5757
 * 5759
 * 5775
 * 5777
 * 5779
 */
