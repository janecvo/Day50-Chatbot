import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner (System.in); 

    public static void main(String[] args) throws Exception {
        greeting();
        getName();
        guessAge();
        countingToUserNum();
        testUserKnowledge();
        farewellUser();
    }

    public static void greeting(){
        System.out.println("Greetings carbon lifeform! Thanks for chatting with me!");
    }

    //Asking the user to repeat their name
    public static void getName(){
        System.out.println("What is your name?");
        // Scanner scanner = new Scanner (System.in);
        String name = scanner.nextLine();
        String output1 = name.substring(0,1).toUpperCase() + name.substring(1);
        System.out.println("Hello " + output1 +"!");
        System.out.println("Just to be sure, can you tell me your name again?");
        String repeatName = scanner.nextLine();
        String output2 = repeatName.substring(0,1).toUpperCase() + repeatName.substring(1);

        if (repeatName.equalsIgnoreCase(name)){
            System.out.println("Thank you " + output2 + " for telling me again! I was correct the first time!"); 
        }else {
            System.out.println("I am sorry " + output2 + ". I thought your name was " + output1 + ". The correction has been noted!");
        }   
    }

   // Guessing the user's age
        public static void guessAge(){
            System.out.println("Let's guess your age! I hope you like math. ");
            System.out.println("Pick a number between 1-9.");
                while (true){
                    int num = Integer.valueOf(scanner.nextLine());
                    if (num >=11){
                        System.out.println("Your number is greater than 9. Please pick a number between 1-9.");
                    }else
                        {System.out.println("Next, take your  "+  num + " and multiply it by 2.\n Add 5 and then mulitply total by 50 \n I have a question for you. Did your birthday already pass this year?");
                        String birthday = scanner.nextLine();

                                if (birthday.equalsIgnoreCase("yes")){
                                    System.out.println("Add 1772 to your number, \n subtract your birth year and tell me your number!"); 
                                    String numAge = scanner.nextLine();
                                    String[] digits = numAge.split("(?<=.)");
                                    System.out.println("Your age is " + digits[1] + digits[2] + ".  Amazing right?!?!?!");
                                    break;
                                }else  if (birthday.equalsIgnoreCase("no")){
                                    System.out.println("Add 1771 to your number, \n subtract your birth year and tell me your number!");
                                    String numAge = scanner.nextLine();
                                    String[] digits = numAge.split("(?<=.)");
                                    System.out.println("Your age is " + digits[1] + digits[2] + ".  Amazing right?!?!?!");
                                    break;
                                }else {
                                    System.out.println("Beep Boop Boop, I do not compute, try answering the question again!");
                                    continue;
                                    }    
                            }
                        }
                    }
        

    //Counting to any number the user wants. Use a loop
    public static void countingToUserNum(){
        System.out.println("Maybe I am good with numbers. Let's see if I can count to any number you want!");
        int userNum = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i <= userNum; i++){
            System.out.println(i);        
        }
    }

//testing user's programming knowledge
    public static void testUserKnowledge(){
        System.out.println("Now it's time to see how awesome you are! Let's see if you can answer this question. \n Which of the following is NOT a java primitive type? Enter a number for your answer. \n 1. int \n 2. String \n 3.boolean \n 4. char ");
            while (true){
                int userAnswer = Integer.valueOf(scanner.nextLine());
                if (userAnswer == 2){
                    System.out.println("Good job rockstar!");
                    break;
                }
                else{
                    System.out.println("Negative! Maybe you can get it this time!");
                }
            }
        }
    

    public static void farewellUser(){  
        System.out.println("It's been fun! Let's do it again soon! Ta-ta for now!");
    }
}
