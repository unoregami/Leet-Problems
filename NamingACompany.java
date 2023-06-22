import java.util.Scanner;

public class NamingACompany {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.println("How many ideas?");
        int idea = console.nextInt();
        while (idea < 2 || idea > 50000) {
            System.out.println("Input numbers 2 - 50,000");
            idea = console.nextInt();
        }
        String[] ideas = new String[idea];

        //get ideas
        for (int i = 0; i < ideas.length; i++) {
            System.out.print("Idea #" + (i+1) + ": ");
            ideas[i] = console.next().toLowerCase();    //lowercases the user input
            while (ideas[i].length() < 1 || ideas[i].length() > 10) {   //accept ideas that have 1 - 10 letters only
                System.out.println("Input ideas that have 1 - 10 letters only!");
                System.out.print("Idea #" + (i+1) + ": ");
                ideas[i] = console.next().toLowerCase();
            }
            //check ideas if already in array
            /*for (int j = 0; j < i; j++) {
                if (ideas[j].equals(ideas[i])) {
                    System.out.println("The idea is already in. Please choose another.");
                    System.out.print("Idea #" + (i+1) + ": ");
                    ideas[i] = console.next().toLowerCase();
                    j = -1; //resets index
                }
            }*/
        }
        System.out.println();

        //swap letters
        int output = 0;
        for (int i = 0; i < ideas.length; i++) {    //let i be the first idea
            for (int j = (i+1); j < ideas.length; j++) {    //let j be the second moving idea
                String ideaA = ideas[i].replaceFirst(Character.toString(ideas[i].charAt(0)), Character.toString(ideas[j].charAt(0)));
                String ideaB = ideas[j].replaceFirst(Character.toString(ideas[j].charAt(0)), Character.toString(ideas[i].charAt(0)));

                int anomaly = 0;
                for (int k = 0; k < ideas.length; k++) {    //let k be the checker for the ideas variation
                    if (ideas[k].equals(ideaA) || ideas[k].equals(ideaB)) {
                        anomaly++;
                    }
                }
                if (anomaly == 0) {
                    output += 2;
                    System.out.println((output - 1) + ". " + ideaA + " " + ideaB);
                    System.out.println((output) + ". " +ideaB + " " + ideaA);
                }
            }
        }

        System.out.println();
        System.out.println("Output: " + output);
    }
}
