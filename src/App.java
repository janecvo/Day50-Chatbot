import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner (System.in); 

    public static void main(String[] args) throws Exception {
        greeting();
        getName();
        guessAge();
        guessAgeWithMath();
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

    public static void guessAge(){
        System.out.println("Now let me guess your age by asking you some questions!");
        System.out.println("First question: were you born BEFORE or AFTER 2000?");
        String answerOne = scanner.nextLine();

        if (answerOne.equalsIgnoreCase("before") ){
            System.out.println("You are older than me! I am not sure if I can count that high but I'll try!?");

            System.out.println("Who was the US president when you were in high school: Carter, Reagan, H.W. Bush, Clinton, W. Bush, Obama?");
            String president = scanner.nextLine();

            switch (president.toLowerCase()){
                    case "carter":
                    System.out.println("You are between 56-60 years old.");
                    break;

                    case "reagan":
                    System.out.println("You are between 48-56 years old.");
                    break;

                    case "h. w. bush":
                    System.out.println("You are between 44-48 years old.");
                    break;

                    case "clinton":
                    System.out.println("You are between 36-44 years old.");
                    break;

                    case "w. bush":
                    System.out.println("You are between 28-36 years old.");
                    break;

                    case "obama":
                    System.out.println("You are between 22-28 years old.");
                    break;

                    default:
                    System.out.println("Does not compute. beep bop bop boop!");
                }
        }else{
            System.out.println("You're a young'un like me! This may be easier than I thought! *happy dance*");

            System.out.println("Have you graduated from high school?");
            // String answer = scanner.nextLine();

            while (true){
                String answer = scanner.nextLine().toLowerCase();

                if (answer.equals("yes")){
                    System.out.println("You are between 18 - 22 years old.");
                break;

                }else  if (answer.equals("no")){
                    System.out.println("You ARE a young'un!  Why are you chatting with a bot??!?!");
                    break;

                }else{
                    System.out.println("Sorry, I didn't understand what you wrote. Please answer yes or no.");
                }
            }
        }
    }

   // Guessing the user's age with Math
        public static void guessAgeWithMath(){
            System.out.println("So I got an age range. Now let me guess your EXACT age with MATH!");
            System.out.println("Pick a number between 1-9.");
                while (true){
                    int num = Integer.valueOf(scanner.nextLine());
                    if (num >=11){
                        System.out.println("Your number is greater than 9. Please pick a number between 1-.");
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

//tell a story about user







