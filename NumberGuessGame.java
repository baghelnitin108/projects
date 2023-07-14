import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int secretNumber = (int) (Math.random()*100+1);

        System.out.println("Press S to Start");
        char ch=sc.next().charAt(0);
        int guess=-1;

        if(ch=='s'||ch=='S'){
            while(guess!=secretNumber){
                System.out.println("Guess a Number");
                guess=sc.nextInt();

                if(guess>secretNumber){
                    System.out.println("Guessed Number is Greater" );
                }else if(guess<secretNumber){
                    System.out.println("Guessed Number is Smaller");
                }else{
                    System.out.println("Guess is Correct");
                }
            }



            
        }else{
            System.out.println("Game End");
        }
    }
    
}
