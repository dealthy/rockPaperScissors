/**
 * @author Dealthy
 * The programmer is a rock paper scissors programme playing with a bot
 * The winner method aims to generate the robots choice using java.util.Random, and decide the winner
 * The main method output teh result and take in the input
 */
import java.util.Scanner;
import java.util.Random;
public class app{
    public static String winner(int human){
        // cases in total
        Random rand = new Random();
        String computerChoice = "";
        int computer = rand.nextInt(2);
        switch(computer){
            case 0: {
                computerChoice = "rock";
            }
            case 1: {
                computerChoice = "paper";
            }
            case 2: {
                computerChoice = "scissors";
            }
        }
        System.out.println("Computer's choice is: " + computerChoice);
        if(human == computer){
            return "draw";
            //all draw cases (3)
        } else if(human - computer == 1){
            return "human";
        } else if (computer - human == 1){
            return "computer";
            //3 cases when the rock meets paper
        } else if(computer - human == 2){
            return "human";
        } else{
            return "computer";
            //3 cases when rock meets scissors
        }
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("welcome to rock paper scissors");
        int scoreHuman = 0;
        int scoreComputer = 0;
        String winner = "";
        //bo1
        while (true){
            System.out.print("rock = 0; paper = 1; scissors = 2; go to bo3 = 3\n" + "Your choice is: ");
            int choice = scan.nextInt();
            if(choice == 3){
                break;
            }
            System.out.println("The Winner is: " + winner(choice));
        }
        //bo3
        while (true){
            System.out.print("rock = 0; paper = 1; scissors = 2\n" + "Your choice is: ");
            int choice = scan.nextInt();
            winner = winner(choice);
            if(winner == "computer"){
                System.out.println("The Winner of the round is: " + winner);
                scoreComputer += 1;
            } else if(winner == "human"){
                System.out.println("The Winner of the round is: " + winner);
                scoreHuman += 1;
            } else{
                System.out.println("The round is draw");
            }
            if(scoreComputer == 2){
                System.out.println("The Winner is: computer");
                break;
            } else if(scoreHuman == 2){
                System.out.println("The Winner is: human");
                break;
            }
        }
    }
}