// Programmers:  Zain, Shane
// Course:  CS 212
// Due Date: 2/11
// Lab Assignment: ATM
// Problem Statement: create a ATM
// Data In: username, choice
// Data Out: balance
// Credits: Notes

import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
		double balance = 212.90, withdraw, deposit;
		
		Scanner ATM = new Scanner(System.in);
		
		System.out.println("Enter Name");
		
		String username = ATM.nextLine();
		
		while(true)
		{
		    System.out.println("Choose 1 to Withdraw");  
            System.out.println("Choose 2 to Deposit");  
            System.out.println("Choose 3 to Check Balance");  
            System.out.println("Choose 4 to Leave");  
            System.out.print("Choose the operation you want to perform: ");
            
            int choice = ATM.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("How much do you want to withdraw? ");
                    
                    withdraw = ATM.nextInt();
                    
                    if(balance >= withdraw)
                    {
                        balance = balance - withdraw;
                    }
                    else
                    {
                        System.out.println("Not enough money!");
                    }
                break;
                
                case 2:
                    System.out.print("How much do you want to deposit? ");
                    
                    deposit = ATM.nextInt();
                    
                    balance = balance + deposit;
                    
                break;
                
                case 3:
                    System.out.println("Balance : "+balance);
                    
                break;
                
                case 4:
                    
                    System.out.println("Would you like a receipt or an email? ");
                    System.out.println("5 for receipt, 6 for email ");
                    
                    int reciept = ATM.nextInt();
                    switch(receipt)
                    {
                        case 5:
                            System.out.println("Make sure to grab your receipt! ");
                        break;
                        case 6:
                            System.out.println("Enter your Email ");
                            String userEmail = ATM.nextLine();
                        break;
                    }
                    
                    System.exit(0);
                    
                    
            }
		}
	}
}
