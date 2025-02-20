import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean pass = true;
        double resultTask, resultQuiz, resultMidTest, resultfinalTest = 0;

        System.out.println("CALCULATE FINAL GRADE PROGRAM");
        System.out.println("=============================");
        System.out.print("Enter Task Value: "); // input task value
        double taskValue = input.nextInt();
        System.out.print("Enter Quiz value: "); // input Quiz value
        double quisValue = input.nextInt();
        System.out.print("Enter Mid Test Value: "); // input Mid Test value
        double midTestValue = input.nextInt();
        System.out.print("Enter Final Test Value: "); // input Final Test value
        double finalTest = input.nextInt();
        input.nextLine(); // give space 
        System.out.println("==============================");
        System.out.println("==============================");

    if (taskValue <= 100 && taskValue >= 0 && quisValue <= 100 && quisValue >= 0 && midTestValue <= 100 && midTestValue >=0 && finalTest <= 100 && finalTest >=0 ) { // value selection
        
         resultTask = ((0.2) * taskValue); // calculate Task x 20/100 
         resultQuiz = ((0.2) * quisValue); // calcuate quiz x 20/100
         resultMidTest = ((0.3) * midTestValue); // calculate Mid Test x 30/100
         resultfinalTest = ((0.3) * finalTest); // calculate Final Test x 30/100
        int finalResult = (int) (resultTask + resultQuiz + resultMidTest + resultfinalTest); // result from sum value task, quiz, mideterm, and final examination
        System.out.println("The Final Grade: " + finalResult);
        if (finalResult > 80 && finalResult <= 100) {
            System.out.println("Letter Grade : A");
          } else if (finalResult > 73 && finalResult <= 80) {
            System.out.println("Letter Grade : B+");
          } else if (finalResult > 65 && finalResult <= 73) {
          System.out.println("Letter Grade : B");
          } else if (finalResult > 60 && finalResult <= 65) {
            System.out.println("Letter Grade : C+");
          } else if (finalResult > 50 && finalResult <= 60) {
            System.out.println("Letter Grade : C");
          } else if (finalResult > 39 && finalResult <= 50) {
            System.out.println("Letter Grade : D");
            pass = false;
          } else { 
            System.out.println("Letter Grade E");
            pass = false;
          }

          System.out.println("========================================");
          System.out.println("========================================");

          if (pass == false) {
                System.out.println("Sorry, you failed"); // if get D or E, fail
          } else {
            System.out.println("Congratulations, you passed"); // if get out of D or E, pass
          }
    } else {
        System.out.println("Invalid number"); // invalid number when value more than 100 or less than 0
    }  
    }
}
