// Scanners
import java.util.Random; // import Random
import java.util.Scanner; // import Scanner
public class Ass02_Craps { // class Ass02_Craps
    public static void main(String[] args) { // main
        // Declare Variables
        Random rnd = new Random(); // Random
        Scanner in = new Scanner(System.in); // Scanner

        int die1 = rnd.nextInt(6) + 1; // num die1 = random number [1-6]
        int die2 = rnd.nextInt(6) + 1; // num die2 = random number [1-6]
        String answer = ""; // String answer = ""
        boolean done = false; // boolean done = false
        boolean endgame = false; // boolean endgame = false

        // Prompt and input
        do { // do
            System.out.print("Rolling the two dice..."); // output "Rolling the two dice..."
            die1 = rnd.nextInt(6) + 1; // input random die1 num
            die2 = rnd.nextInt(6) + 1; // input random die2 num
            System.out.println("You rolled a " + die1 + " and a " + die2); // output "You rolled a " + die1 + " and a " + die2
            int crapsRoll = die1 + die2; // num crapsRoll = die1 + die2

            // if else
            if ((crapsRoll == 2) | (crapsRoll == 3) | (crapsRoll == 12)) // if ((crapsRoll == 2) | (crapsRoll == 3) | (crapsRoll == 12)) then
            {
                System.out.println("Craps! You lost."); // output "Craps! You lost."
            }
            else if ((crapsRoll == 7) | (crapsRoll == 11)) // else if ((crapsRoll == 7) | (crapsRoll == 11)) then
            {
                System.out.println("A natural! You win!"); // output "A natural! You win!"
            }
            else // else
            {
                System.out.println("A point! The point is " + crapsRoll); // output "A point! The point is " + crapsRoll
                do { // do
                        System.out.println("Rolling again."); // output "Rolling again."

                        System.out.print("Rolling the two dice...");// output "Rolling the two dice..." (second time)
                        die1 = rnd.nextInt(6) + 1; // input random die1 num
                        die2 = rnd.nextInt(6) + 1; // input random die2 num
                        System.out.println("You rolled a " + die1 + " and a " + die2); // output "You rolled a " + die1 + " and a " + die2
                        int crapsRoll1 = die1 + die2; // num crapsRoll1 = die1 + die2;

                        // if else
                        if (crapsRoll1 == 7) // if crapsRoll == 7 then
                        {
                            System.out.println("Craps! You lost the game."); // output "Craps! You lost the game."
                            endgame = true; // endgame = true
                        }
                        else if (crapsRoll1 == crapsRoll) // else if crapsRoll1 == crapsRoll then
                        {
                            System.out.println("You win the game!"); // output "You win the game!"
                            endgame = true; // endgame = true
                        }
                        else // else
                        {
                            endgame = false; // endgame = false
                        }
                } while (!endgame); // while endgame = false
            }
        do { // do
            System.out.print("Do you want to play again? [Y or N]: "); //output "Do you want to continue playing [Y or N]: "
                if (in.hasNext("Y|N|y|n")) // if input == "Y|N|y|n then
                {
                    answer = in.nextLine(); // input answer
                    done = true; // done = true
                }
                else // else
                {
                    System.out.println("This is an invalid input, please type Y or N. "); // output "This is an invalid input, please type Y or N. "
                    done = false; // done = false
                    in.nextLine(); // clears buffer
                }
            } while (!done); // while done = false

        } while (answer.equalsIgnoreCase("Y")); // while answer == "Y"
    } // return
} // end class