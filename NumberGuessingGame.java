package Project;
import java.util.*;
import java.lang.*;
public class NumberGuessingGame {
	int choice;
	Random r=new Random();
	Scanner sc=new Scanner(System.in);
	void printRule() {
		System.out.println("===========Welcome To Random Game================");
		System.out.println();
		System.out.println("===========RULE FOR GAME=========");
		System.out.println("1.The Game will generated random number Between 1 to 10 ");
		System.out.println("2.You have to enter Your guess number");
		System.out.println("3.After each guess, you will be told \n  if your guess is too high,  too low, or correct.");
		System.out.println("4.Keep Going until you find correct output");
		System.out.println("=============================================");
	}
	void printMenu() {
		System.out.println("====Number Guessing Game====");
		System.out.println("1.Start The Game");
		System.out.println("2.Exit");
		System.out.println("Please choose option");
		choice=sc.nextInt();
		switch(choice) {
		case 1:startGame();break;
		case 2:System.out.println("Exiting The Game");
				break;
	}
		
	}
	private void startGame() {
		boolean hasGuessedCorrect=false;
		int numberOfTries=0;
//		System.out.println("Start the game");
		int randomNum=r.nextInt(1,10);
		System.out.println(randomNum);
		while(!hasGuessedCorrect) {//// Loop continues until hasGuessedCorrect is true
		System.out.println("Enter Your Answer");
		int userNum=sc.nextInt();
		numberOfTries++;
//		int difference=randomNum-userNum;
		 if (userNum < 1 || userNum > 10) {
             System.out.println("Please enter a number between 1 and 10.");
         } else if (userNum == randomNum) {
             System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries.");
             hasGuessedCorrect = true;
         } else {
             int difference = randomNum - userNum;
             if (difference > 2) {
                 System.out.println("You are far away from the answer.");
             } else {
                 System.out.println("You are very close to the answer.");
             }
             System.out.println("Try again.");
         }
		}
         
	}
	public static void main(String[] args) {
		NumberGuessingGame n=new NumberGuessingGame();
		n.printRule();
		n.printMenu();
}
	
}
