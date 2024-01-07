import java.util.*;
class quiz {
    String Question;
    String option1;
    String option2;
    String option3;
    String option4;
    int ans;
}
public class QuizeGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        quiz[] ques = new quiz[6];
        
        questionsData(ques);

        boolean winner = true;
        int num = 0;
      

        while (num < ques.length && winner == true) {

            quiz q = ques[num];

            System.out.println(q.Question);
            System.out.println("1 " + q.option1);
            System.out.println("2 " + q.option2);
            System.out.println("3 " + q.option3);
            System.out.println("4 " + q.option4);

            System.out.print("Choose the correct option   ");
           
            boolean correctOption = true;
            while(correctOption==true){
               
                int n = sc.nextInt();
            if(n==q.ans){
                System.out.println("Hurray! You choosed the correct option"); 
                System.out.println("\n\n\n"); 
                correctOption=false;
                num++;
                
            }else if(n==1 || n==2 || n==3 || n==4){
                System.out.println(" You have choosen the wrong option & You lost the game ");
                winner = false; 
                correctOption=false;
            }else{
                System.out.println("Invalid Option choosen ");
                System.out.print("Try to choose once again  ");
            }
        }

        }

    }

    public static void questionsData(quiz[] ques){
      

        quiz  q1 = new quiz();

        q1.Question = "Which of the following gods is also known as ‘Gauri Nandan’?";
        q1.option1 = "Agnii";
        q1.option2 = "Chnadra";
        q1.option3 = "Hanuman";
        q1.option4 = "Ganesha";
        q1.ans = 4;

        ques[0]=q1;


        ques[1]=new quiz();
        ques[1].Question = "The wife of which of these famous sports persons was once captain of Indian volleyball team?";
        ques[1].option1 = "Milka Singh";
        ques[1].option2 = "Sachin Tendulkar";
        ques[1].option3 = "Usian Bolt";
        ques[1].option4 = "Virat Kohli";
        ques[1].ans = 1;

        ques[2]=new quiz();
        ques[2].Question = "Who invented Java Programming?";
        ques[2].option1 = "Guido van Rossum";
        ques[2].option2 = "James Gosling";
        ques[2].option3 = "Dennis Ritchie";
        ques[2].option4 = "Virat Kohli";
        ques[2].ans = 2;

        ques[3]=new quiz();
        ques[3].Question = "Who is the father of C language?";
        ques[3].option1 = "Guido van Rossum";
        ques[3].option2 = "James Gosling";
        ques[3].option3 = "Dennis Ritchie";
        ques[3].option4 = "Virat Kohli";
        ques[3].ans = 3;

         ques[4]=new quiz();
        ques[4].Question = "Which of the following words are inscribed on the national emblem?";
        ques[4].option1 = "Satyameva Jayate";
        ques[4].option2 = "Vande Mataram ";
        ques[4].option3 = "Jana-gana-mana";
        ques[4].option4 = "Bharat Mata Ki Jai";
        ques[4].ans = 1;

         ques[5]=new quiz();
        ques[5].Question = "A person eligible to become the president of India should not be less than?";
        ques[5].option1 = "40 year of age";
        ques[5].option2 = "35 year of age";
        ques[5].option3 = "50 year of age";
        ques[5].option4 = "60 year of age";
        ques[5].ans = 2;
    }
}