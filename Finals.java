import java.util.Scanner;

public class Finals {
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    
         String[] Questions = new String[5];
         Questions[0] = "What is the capital of Indonesia? ";
         Questions[1] = "What is the capital of Pakistan? ";
         Questions[2] = "What is the capital of Spain? ";
         Questions[3] = "What is the capital of Turkey? ";
         Questions[4] = "What is the capital of Egypt? ";
        
          String[][] Choices = new String[5][3];
          Choices[0][0] = "a.Jakarta";
          Choices[0][1] = "b.Bangkok";
          Choices[0][2] = "c.Kuala lumpur";
          
          Choices[1][0] = "a.Islamabad";
          Choices[1][1] = "b.Kabul";
          Choices[1][2] = "c.Tehran";
          
          Choices[2][0] = "a.Barcelona";
          Choices[2][1] = "b.Madrid";
          Choices[2][2] = "c.London";
          
          Choices[3][0] = "a.Ankara";
          Choices[3][1] = "b.Athens";
          Choices[3][2] = "c.Istanbul";
          
          Choices[4][0] = "a.Giza";
          Choices[4][1] = "b.Alexandria";
          Choices[4][2] = "c.Cairo";
          
          char a;
          int i;
          
          char[] Answers = {'a', 'a', 'b', 'a', 'c'};
          int score = 0;
        
           for(i = 0; i < 5; i++){
              
              System.out.println(Questions[i]);
              System.out.println("\n" + Choices[i][0] + "\n" + Choices[i][1] + "\n" + Choices[i][2] + "\n");
              System.out.print("Enter your answer: ");
              a = input.next().charAt(0);
              
              System.out.println("");
              
              if(a == Answers[i]){
            
              score++;
           
              }
            
              results(score);
              
           }
  
    }
    
   public static void results(int score){
      
       System.out.println("Your Score " + score + "/5");
    
   }
    
}
