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
        while (true){
            System.out.print("rock = 0; paper = 1; scissors = 2\n" + "Your choice is: ");
            int choice = scan.nextInt();
            System.out.println("The Winner is: " + winner(choice) + "\n");
        }
    }
}