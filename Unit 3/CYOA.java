import java.util.Scanner;

public class CYOA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line;

        //Start with an initial prompt
        System.out.println("You find yourself at an intersection (East/West)");

        //Then let the user respond
        line = input.nextLine();

        //Finally, have your program react to their input
        //"East" will lead to another prompt.
        if (line.equals("East")) {
            System.out.println("you went East.  Now what do you do? (North/South)?");
            line = input.nextLine();
            if(line.equals("North")) {
                System.out.println("you went North");
            }
            else if(line.equals("South")) {
                System.out.println("you went South");
            }
            else {
                System.out.println("I didn’t understand that");
            }        
        }
        //"West" will be a dead-end.
        else if (line.equals("West")) {
            System.out.println("you went West.  Wrong way!");
        }
        //Don't forget to handle invalid inputs!
        else {
            System.out.println("I didn’t understand that");
        }
    }
}