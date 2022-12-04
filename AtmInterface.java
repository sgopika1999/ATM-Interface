package project;
import java.util.Scanner;

public class AtmInterface {

	public static void main(String[] args) {
		int pin,withdrawal,deposit;
		int balance=100000;
		int ch;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("ATM");
			System.out.println("press 1 for check balance");
			System.out.println("press 2 for withdraw");
			System.out.println("press 3 for deposit");
			System.out.println("press 4 for exit");
			
			ch=sc.nextInt();
			System.out.println("\nEnter the pin number");
			pin=sc.nextInt();
			switch (ch) {
			case 1:
				
			if (pin==3461) {
				System.out.println("Total Available Balance:" + balance);
				} else {
					System.out.println("Wrong pin number..please try again");
					
				}
			break;
			case 2:
			if (pin == 3461)  {
				System.out.println("Enter the amount for withdrawal");
				withdrawal = sc.nextInt();
				
				if (balance >= withdrawal) {
					balance = balance - withdrawal;
					System.out.println("please wait and collect your money");
				} else {
					System.out.println("Insufficient balance");
					break;
				}
			}
			
			else {
				System.out.println("Invalid pin number");
			}
			break;
			
			
			case 3:
			if (pin == 3461) {
			System.out.println("Enter the amount for deposit");
			deposit = sc.nextInt();
			balance= balance + deposit;
			System.out.println("Your amount has been successfully deposited");
			break;
			} else {
		    System.out.println("Invalid pin number");
			}
			break;
			case 4:
			System.exit(0);
			break;
			
			}
			
			
			}
	        }

}
