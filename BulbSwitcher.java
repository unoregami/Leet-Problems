/* BULB SWITCHER
 * Delete code comments to reveal the process and indexing of the bulbs and rounds 
*/

import java.util.Scanner;
public class BulbSwitcher {

    public static int bulbSwitch(int n) {
        //-1 == off | 1 == on | n == bulbs
        int[] bulbs = new int[n];

        for (int j = 0; j < n; j++) {   //j == rounds
            //System.out.println("Round: " + (j+1));
            if (j == 0) {   //round 1, turn on all bulbs
                for (int i = j; i < n; i++) {
                    bulbs[i] = 1;
                    //System.out.println("Bulb " + (i+1) + ": " + bulbs[i]);
                }
            } else {    //round j, turn bulb 'j' to opposite (if on, then off. if off, then on)
                for (int i = j; i < n; i += j+1) { //i == bulbs index
                    bulbs[i] *= -1;
                    //System.out.println("Bulb " + (i+1) + ": " + bulbs[i]);
                }
            }
            //System.out.println();
        }

        //count how many are turned on
        int on = 0;
        for (int i = 0; i < n; i++) {
            if (bulbs[i] == 1) {
                System.out.println("Bulb " + (i+1) + ": ON");
                on++;
            } else
            System.out.println("Bulb " + (i+1) + ": OFF");
        }
        return on;
    }

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        System.out.print("How many bulbs: ");
        int input = console.nextInt();
        

        System.out.println("Bulbs turned on: " + bulbSwitch(input));

    }
}
