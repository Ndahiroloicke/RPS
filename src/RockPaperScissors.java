import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        String[] rps = {"r","p","s"};
        String computerMove = rps[new Random().nextInt(rps.length)];

        Scanner scanner = new Scanner(System.in);
        String playerMove;
        while(true){
            System.out.println("Please enter your move(r, p, or s)");
            playerMove = scanner.nextLine();
            if(playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")){
                break;
            }
            System.out.println(playerMove + " is not a valid move.");
        }

        System.out.println("computer played:" + computerMove);

        if(playerMove.equals(computerMove)){
            System.out.println("The game was a tie!");
        }
        else if (playerMove.equals("r")){
            if(computerMove.equals("p")){
                System.out.println("you lose!");
            }else if(computerMove.equals("s")){
                System.out.println("You win!");
            }
        }
        else if(playerMove.equals("p")){
            if(computerMove.equals("r")){
                System.out.println("You win!");
            }else if(computerMove.equals("s")){
                System.out.println("You lose!");
            }
        }
        else if(playerMove.equals("s")){
            if(computerMove.equals("p")){
                System.out.println("You win!");
            }else if(computerMove.equals("r")){
                System.out.println("You lose!");
            }
        }

        System.out.println("Play again!");
        String playAgain = scanner.nextLine();


        if (!playAgain.equals("y")) {
            break;
        }
    }
}