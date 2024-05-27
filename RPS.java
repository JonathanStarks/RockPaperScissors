import java.util.Random;
import java.util.Scanner;

public class RPS
{
    public static int user_score = 0;
    public static int computer_score = 0;
    public static int ties = 0;
    // These are the instructions for the game
    static void instructions()
    {
        System.out.println("╔═══════════════════════════════  Welcome to the program  ═══════════════════════════════╗");
        System.out.println("║This is a rock paper scissors game, you will either choose rock, paper, or scissors and ║");
        System.out.println("║then the computer will choose one at random, then the winner will be chosen!            ║");
        System.out.println("║The program will run for 5 times, here we go!                                           ║");
        System.out.println("╠════════════════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║Here are your options, just type option you want and press enter.                       ║");
        System.out.println("║- Rock                                                                                  ║");
        System.out.println("║- Paper                                                                                 ║");
        System.out.println("║- Scissors                                                                              ║");
        System.out.println("╠════════════════════════════════════════════════════════════════════════════════════════╣");
    }

    // This is the actual code that will run the game
    static void game()
    {
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < 5; i++)
            {
                System.out.print("║Your Choice: ");
                String user_true_choice = scanner.nextLine();
                String user_choice = user_true_choice.toLowerCase();
                
                // The following section of code will be the choice that the computer will make.
                // The computer's choice will be determined by a random number between 0 and 2
                Random random = new Random();
                int computer_choice = random.nextInt(3);
                
                // The following section of code will determine who wins, it will go through 9
                // different if statements to figure out who wins.
                // If computer chooses rock
                if (computer_choice == 0 && user_choice.equals("rock"))
                {
                    System.out.println("║Computer: Rock                                                                          ║");
                    System.out.println("║Its a tie!                                                                              ║");
                    ties = ties + 1;
                }
                else if (computer_choice == 0 && user_choice.equals("paper"))
                {
                    System.out.println("║Computer: Rock                                                                          ║");
                    System.out.println("║You win!                                                                                ║");
                    user_score = user_score + 1;
                }
                else if (computer_choice == 0 && user_choice.equals("scissors"))
                {
                    System.out.println("║Computer: Rock                                                                          ║");
                    System.out.println("║You loose!                                                                              ║");
                    computer_score = computer_score + 1;
                }
                // If computer chooses paper
                else if (computer_choice == 1 && user_choice.equals("rock"))
                {
                    System.out.println("║Computer: Paper                                                                         ║");
                    System.out.println("║You loose!                                                                              ║");
                    computer_score = computer_score + 1;
                }
                else if (computer_choice == 1 && user_choice.equals("paper"))
                {
                    System.out.println("║Computer: Paper                                                                         ║");
                    System.out.println("║Its a tie!                                                                              ║");
                    ties = ties + 1;
                }
                else if (computer_choice == 1 && user_choice.equals("scissors"))
                {
                    System.out.println("║Computer: Paper                                                                         ║");
                    System.out.println("║You win!                                                                                ║");
                    user_score = user_score + 1;
                }
                // If computer chooses scissors
                else if (computer_choice == 2 && user_choice.equals("rock"))
                {
                    System.out.println("║Computer: Scissors                                                                      ║");
                    System.out.println("║You win!                                                                                ║");
                    user_score = user_score + 1;
                }
                else if (computer_choice == 2 && user_choice.equals("paper"))
                {
                    System.out.println("║Computer: Scissors                                                                      ║");
                    System.out.println("║You loose!                                                                              ║");
                    computer_score = computer_score + 1;
                }
                else if (computer_choice == 2 && user_choice.equals("scissors"))
                {
                    System.out.println("║Computer: Scissors                                                                      ║");
                    System.out.println("║Its a tie!                                                                              ║");
                    ties = ties + 1;
                }
                System.out.println("╠════════════════════════════════════════ Scores ════════════════════════════════════════╣");
                System.out.println("║Your score: " + user_score + "                                                                           ║");
                System.out.println("║Computer's score: " + computer_score + "                                                                     ║");
                System.out.println("║Numebr of ties: " + ties + "                                                                       ║");
        }
    }
    }
    // Says to have the code run
    public static void main(String[] args)
    {
        instructions();
        game();
        System.out.println("╚════════════════════════════════════════════════════════════════════════════════════════╝");        
    }
}