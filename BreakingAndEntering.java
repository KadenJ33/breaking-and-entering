package com.techelevator;

import java.util.Scanner;

public class BreakingAndEntering {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int percent = 0;
		
		
		System.out.println("Are you thinking about breaking and entering?");
		System.out.println("Before you wander in to any random house, run the stats through our B&E Probability of Success Calculator!");
		
		System.out.println("First and foremost, are you willing to break the law? (Yes or No)");
		String yesNo1 = input.nextLine();
		
		if("Yes".equals(yesNo1) || "yes".equals(yesNo1)) {
			percent += 10;
		} 
		else if("No".equals(yesNo1) || "no".equals(yesNo1)) {
			percent -= 10;
		}
		System.out.println("Are you willing to be injured or even killed? (Yes or No)");
		String yesNo2 = input.nextLine();
		
		if("Yes".equals(yesNo2) || "yes".equals(yesNo2)) {
			percent += 10;
		} 
		else if("No".equals(yesNo2) || "no".equals(yesNo2)) {
			percent -= 10;
		}
		
		System.out.println("To your knowledge, is anyone home? (Yes or No");
		String yesNo17 = input.nextLine();
		if("Yes".equals(yesNo17) || "yes".equals(yesNo17)) {
			percent -= 15;
		} 
		else if("No".equals(yesNo17) || "no".equals(yesNo17)) {
			percent += 15;
		}
		System.out.println("Is it dark outside? (Yes or No)");
		String yesNo3 = input.nextLine();
		
		if("Yes".equals(yesNo3) || "yes".equals(yesNo3)) {
			percent += 6;
		} 
		else if("No".equals(yesNo3) || "no".equals(yesNo3)) {
			percent -= 6;
		}
		System.out.println("Are there neighbors outside? (Yes or No)");
		String yesNo4 = input.nextLine();
		
		if("Yes".equals(yesNo4) || "yes".equals(yesNo4)) {
			percent -= 6;
		} 
		else if("No".equals(yesNo4) || "no".equals(yesNo4)) {
			percent += 6;
		}
		System.out.println("Are there vehicles in the driveway? (Yes or No");
		String yesNo5 = input.nextLine();
		
		if("Yes".equals(yesNo5) || "yes".equals(yesNo5)) {
			System.out.println("How many vehicles? Choose one >> [1] [2] [3] [4] [5+] ");
			String numOfCars = input.nextLine();
			if("1".equals(numOfCars)) {
				percent -= 4;
			} else if("2".equals(numOfCars)) {
				percent -= 8;
			} else if("3".equals(numOfCars)) {
				percent -= 15;
			} else if("4".equals(numOfCars)) {
				percent -= 25;
			} else if("5".equals(numOfCars) || "5+".equals(numOfCars)) {
				percent -= 50;
			}
		}
		else if("No".equals(yesNo5) || "no".equals(yesNo5)) {
			percent += 6;
		}
		System.out.println("To your knowledge, do they have a security system or cameras? (Yes or No)");
		System.out.println("(Look for a company sign in the yard or logo in the window)");
		String yesNo6 = input.nextLine();
		
		if("Yes".equals(yesNo6) || "yes".equals(yesNo6)) {
			percent -= 6;
		} 
		else if("No".equals(yesNo6) || "no".equals(yesNo6)) {
			percent += 6;
		}
		System.out.println("To your knowledge, do they have any dogs? (Yes or No)");
		String yesNo7 = input.nextLine();
		
		if("Yes".equals(yesNo7) || "yes".equals(yesNo7)) {
			percent -= 6;
		} 
		else if("No".equals(yesNo7) || "no".equals(yesNo7)) {
			percent += 6;
		}
		System.out.println("Are there any lights on inside? (Yes or No)");
		String yesNo8 = input.nextLine();
		
		if("Yes".equals(yesNo8) || "yes".equals(yesNo8)) {
			percent -= 6;
		}
		else if("No".equals(yesNo8) || "no".equals(yesNo8)) {
			percent += 6;
		}
		System.out.println("Are there any lights on outside? (Yes or No)");
		String yesNo9 = input.nextLine();
		
		if("Yes".equals(yesNo9) || "yes".equals(yesNo9)) {
			percent -= 6;
		}
		else if("No".equals(yesNo9) || "no".equals(yesNo9)) {
			percent += 6;
		}
		System.out.println("To your knowledge, is the neighborhood frequently police patrolled? (Yes or No)");
		String yesNo10 = input.nextLine();
		
		if("Yes".equals(yesNo10) || "yes".equals(yesNo10)) {
			percent -= 6;
		}
		else if("No".equals(yesNo10) || "no".equals(yesNo10)) {
			percent += 6;
		}
		System.out.println("To your knowledge, is there a community such as neighborhood watch or crime stoppers? (Yes or No)");
		String yesNo11 = input.nextLine();
		
		if("Yes".equals(yesNo11) || "yes".equals(yesNo11)) {
			percent -= 6;
		}
		else if("No".equals(yesNo11) || "no".equals(yesNo11)) {
			percent += 6;
		}
		System.out.println("Are any windows or doors open? (Yes or No)");
		String yesNo12 = input.nextLine();
		
		if("Yes".equals(yesNo12) || "yes".equals(yesNo12)) {
			percent += 6;
		}
		else if("No".equals(yesNo12) || "no".equals(yesNo12)) {
			percent -= 6;
		}
		System.out.println("Time to see if you are prepared.");
		System.out.println("Are you able to move around quietly? (Yes or No)");
		String yesNo13 = input.nextLine();
		
		if("Yes".equals(yesNo13) || "yes".equals(yesNo13)) {
			percent += 6;
		}
		else if("No".equals(yesNo13) || "no".equals(yesNo13)) {
			percent -= 6;
		}
		System.out.println("Do you have gloves? (Yes or NO)");
		String yesNo14 = input.nextLine();
		
		if("Yes".equals(yesNo14) || "yes".equals(yesNo14)) {
			percent += 6;
		}
		else if("No".equals(yesNo14) || "no".equals(yesNo14)) {
			percent -= 6;
		}
		System.out.println("Do you have a flashlight? (Yes or No)");
		String yesNo15 = input.nextLine();
		
		if("Yes".equals(yesNo15) || "yes".equals(yesNo15)) {
			percent += 6;
		}
		else if("No".equals(yesNo15) || "no".equals(yesNo15)) {
			percent -= 6;
		}
		System.out.println("Do you have a large backpack or duffle? (Yes or No)");
		String yesNo16 = input.nextLine();
		
		if("Yes".equals(yesNo16) || "yes".equals(yesNo16)) {
			percent += 6;
		}
		else if("No".equals(yesNo16) || "no".equals(yesNo16)) {
			percent -= 6;
		}
		System.out.println("Calculating your results...");
		
		if(percent < 0) {
			percent *= 0;
		}
		if(percent >= 100) {
			percent = 99;
		}
		System.out.println("You have a " + percent + "% chance of a successful burglary.");
		System.out.println("The creator of the B&E Probaility of Success Calculator does not condone the use of the program for any illegal activities.");
		System.out.println("The program is strictly for fun but can be used to test the chances a home intruder would have to successfully burglarise the users home. ");
		
		
		System.exit(0);
	}

}
