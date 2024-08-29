package Project;
import java.util.Scanner;

class Guesser{
    int GuesserNum;
    @SuppressWarnings("resource")
    public int GuesserNumb(){
        Scanner Scan = new Scanner(System.in);
        System.out.println("Guesser kindly guess a number");
        GuesserNum = Scan.nextInt();
        return GuesserNum = Scan.nextInt();
               
        
    }
}
class player{
    int playerNum;
    public int playerNumb(){
        Scanner Scan = new Scanner(System.in);
        playerNum= Scan.nextInt();
        return playerNum;
    }
}
class umpaire{
    int GuesserNum;
    int playerNum1;
    int playerNum2;
    int playerNum3;

    public void collectNumFormGuesser(){
        Guesser Gu = new Guesser();
        GuesserNum = Gu.GuesserNumb();
    }
    public void collectNumFormPlayers(){
        System.out.println("Player 1 guess your numb");
        player p1 = new player();
        playerNum1 = p1.playerNumb();
        
        System.out.println("Player 2 guess your numb");
        player p2 = new player();
        playerNum2 = p2.playerNumb();

        System.out.println("Player 3 guess your numb");
        player p3 = new player();
        playerNum3 = p3.playerNumb();

    }
    public void  Compare(){
        if(GuesserNum==playerNum1){
            if(GuesserNum==playerNum2 && GuesserNum==playerNum3){
                System.out.println("All players won the game");
            }
            else if(GuesserNum==playerNum2){
                System.out.println("Player 1 and player 2 won the game");
            }
            else if(GuesserNum==playerNum3){
                System.out.println("Player 1 and player 3 won the game");
            }
            else{
                System.out.println("only player won the game");
            }
        }


        else if(GuesserNum==playerNum2){
            if(GuesserNum==playerNum3){
            System.out.println("Player 2 and player 3");
            }
            else {
                System.out.println("player 2");
            }
        }
        else if(GuesserNum==playerNum3){
            System.out.println("Only player 3 won the game");
        }
        else{
            System.out.println("All player lost the game");
        }
    }
}
public class MyGuesserGame{
    public static void main(String[] args) {
        System.out.println("---Game Stared---");
        umpaire UM = new umpaire();
        UM.collectNumFormGuesser();
        UM.collectNumFormPlayers();
        UM.Compare();
        System.out.println("--- Game Over---");
    }
}
    
    
        






