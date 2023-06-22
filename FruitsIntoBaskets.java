import java.util.Scanner;

public class FruitsIntoBaskets {
    public int totalFruit(int[] fruits) {
        //the fruit basket min-maxer
        int basket1 = -1;
        int basket2;
        int bundle = 1;
        for (int i = 0; i < fruits.length; i++) {   //let i be the present fruit
            if (fruits[i] == basket1){
                continue;
            }
            int pick = 0;
            if (i == (fruits.length - 1)) {
                break;
            }
            basket1 = fruits[i];
            basket2 = fruits[i+1];
            
            //for when the next index is the same fruit as the basket1 to basket2
            int a = 1;
            while (basket1 == basket2) {
                a++;
                if ((i+a) > (fruits.length -1)) {
                    break;
                }
                basket2 = fruits[i+a];
            }
            
            for (int j = i; j < fruits.length; j++) {   //let j be the fruit picker
                if (basket1 != fruits[j] && basket2 != fruits[j]) {
                    break;
                }
                if (basket1 == fruits[j]) {
                    pick++;
                }
                else if (basket2 == fruits[j]) {
                    pick++;
                }
            }

            if (bundle < pick) {
                bundle = pick;
            }
        }
        return bundle;
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("How many fruit trees are there?");
        int trees = console.nextInt();
        int[]fruits = new int[trees];

        for (int i = 0; i < fruits.length; i++) {
            do {
                System.out.print("Fruit #" + (i+1) + ": ");
                fruits[i] = console.nextInt();
                if (fruits[i] < 0 || fruits[i] > fruits.length) {
                    System.out.println("Please input number from 0 - " + fruits.length + "!");
                }
            } while (fruits[i] < 0 || fruits[i] > fruits.length);
        }

        System.out.println("Output: " + new FruitsIntoBaskets().totalFruit(fruits));
    }
}
