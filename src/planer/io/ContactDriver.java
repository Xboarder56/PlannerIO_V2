/*
 * Garrett J. Beasley
 * 01/21/2015
 * ContactDriver.java
 */

/**
 * @author Garrett J. Beasley
 * @date 01/21/2015
 * @description The program is a simple program that will allow
 * the user to display the contacts and data about there contacts
 * in a user's planner.
 */

/*Package for the project (planer.io)*/
package planer.io;

/*Imports for the project*/
import java.util.Scanner;

/**This is the MAIN Class for the program to be launched from.
 * The program consists of 3 options for the user to select
 * 1. Display contacts, 2. Contact data, 3. Exit
 * Once the option is selected the user then completes the program
 * and will have a option to enter the other menu options once again. 
 */

public class ContactDriver 
{

	
	/*Variables for the program.*/
	private static final Scanner console = new Scanner(System.in);
	private static Contact[] contacts;
	
	public static void main(String[] args) 
	{
		
		/*Calling the methods into the main method to be run.*/
		intro();
		inputReader();
		
		/*Close the console*/
		console.close();
	}
	
	/**Intro UI for the program
	 * @description This basically is the console ui for the program allowing
	 * the user to select 1-3 and then the program will enter into that mode.
	 *  */
	public static void intro()
	{
		/*User input and selections for the user*/
		System.out.println("Welcome to my planner!");
		System.out.println("Create a new contact?");
		System.out.println("1. Personal Contact");
		System.out.println("2. Business Contact");
		System.out.println("3. Exit.");
		System.out.println(" ");
		
	}
	
	/**
	 * Input One (when the user hits 1)
	 * @description When 1 is pressed the program will enter
	 * into the inputOne method and print out the contacts in the array
	 */
	public static void inputOne()
	{
		/*Tell the user to pick a selection between 1-4*/
		System.out.println("Please enter how many contacts: ");
		int contactAmount = console.nextInt(); //clears the prompt (to skip enter key)
		console.nextLine();
	
		for(int i=0; i<contactAmount; i++)
		{
			contacts = new Contact[contactAmount];
			
			/*Tell the user to pick a selection between 1-4*/
			System.out.println("Please enter the name: ");
			String name = console.nextLine(); //clears the prompt (to skip enter key)
			
			/*Tell the user to pick a selection between 1-4*/
			System.out.println("Please enter the age: ");
			int age = console.nextInt(); //clears the prompt (to skip enter key)
			console.nextLine();
			
			/*Tell the user to pick a selection between 1-4*/
			System.out.println("Please enter the first part of the address: ");
			String address = console.nextLine(); //clears the prompt (to skip enter key)
			
			
			/*Tell the user to pick a selection between 1-4*/
			System.out.println("Please enter the city: ");
			String city = console.nextLine(); //clears the prompt (to skip enter key)
			
			/*Tell the user to pick a selection between 1-4*/
			System.out.println("Please enter the state: ");
			String state = console.nextLine(); //clears the prompt (to skip enter key)
			
			/*Tell the user to pick a selection between 1-4*/
			System.out.println("Please enter the zip: ");
			int zip = console.nextInt(); //clears the prompt (to skip enter key)
			console.nextLine();
			
			try
			{
			contacts[i] = new PersonalContact(name, age, address, city, state, zip);
			}
			catch(IllegalStateException | NullPointerException ex)
			{
				System.out.println(ex.getMessage());
				System.out.println("An invald varibile has been inputed, Try again!");
				inputOne();
			}
		}
		
		for(int i=0; i<contacts.length; i++)
		{
			
			System.out.println(contacts[i]);
		}
		System.out.println(" ");
	}
	
	/**
	 * Input Two (when the user hits 2)
	 * @description When 2 is pressed the program will enter
	 * into the inputTwo method and calculate the data based
	 * upon the array that is preprogrammed into the program
	 * it will print out, total contacts, personal contact#, 
	 * business contact#, average contact age
	 */
	public static void inputTwo()
	{
		/*Tell the user to pick a selection between 1-4*/
		System.out.println("Please enter how many contacts: ");
		int contactAmount = console.nextInt(); //clears the prompt (to skip enter key)
		console.nextLine();
	
		for(int i=0; i<contactAmount; i++)
		{
			contacts = new Contact[contactAmount];
			
			/*Tell the user to pick a selection between 1-4*/
			System.out.println("Please enter the name: ");
			String name = console.nextLine(); //clears the prompt (to skip enter key)
			
			/*Tell the user to pick a selection between 1-4*/
			System.out.println("Please enter the age: ");
			int age = console.nextInt(); //clears the prompt (to skip enter key)
			console.nextLine();
			
			/*Tell the user to pick a selection between 1-4*/
			System.out.println("Please enter your BusinessCell: ");
			String businessCell = console.nextLine(); //clears the prompt (to skip enter key)
			
			
			/*Tell the user to pick a selection between 1-4*/
			System.out.println("Please enter your PersonalCell: ");
			String personalCell = console.nextLine(); //clears the prompt (to skip enter key)
			
			try
			{
			contacts[i] = new BusinessContact(name, age, businessCell, personalCell);
			}
			catch(IllegalStateException | NullPointerException ex)
			{
				System.out.println(ex.getMessage());
				System.out.println("An invald varibile has been inputed!");
				inputTwo();
			}
		}
		
		for(int i=0; i<contacts.length; i++)
		{
			
			System.out.println(contacts[i]);
		}
		System.out.println(" ");
	}
	
	/**
	 * Input 3 (when the user hits 3)
	 * @description When 3 is pressed the program will enter
	 * into the inputFour method and tell the user goodbye
	 * then the system will exit the java machine.
	 */
	public static void inputThree()
	{
		/*Goodbye to the user and thank them*/
		System.out.println("Thanks for checking the planer!! :)");
		
		/*Close the java machine*/
		System.exit(0);
	}

	/**
	 * This will read what the user inputs under the UI
	 * @description: This will read the users input from the UI then
	 * there selected decision will be placed into a variable between 1-3
	 * and compared to the programmed selections 1. Display contacts, 2. Contact info
	 * 3. Exit
	 */
	public static void inputReader()
	{
		/*Tell the user to pick a selection between 1-4*/
		System.out.println("Please enter a selection: ");
		int selection = console.nextInt(); //clears the prompt (to skip enter key)
		console.nextLine();
		
		/*If user enters 1 enter this section*/
		if(selection == 1)
		{
			/*Go to 1 then loop the code after*/
			inputOne();
			intro();
			inputReader();
		}
		
		/*If user enters 2 enter this section*/
		else if(selection == 2)
		{
			/*Go to 2 then loop the code after*/
			inputTwo();
			intro();
			inputReader();
		}
		
		/*If user enters 3 enter this section*/
		else if(selection == 3)
		{
			/*Go to 3 then loop the code after*/
			inputThree();
		}
		
		/*Anything else other then 1-4 will go down here*/ 
		else
		{
			/*Tell the user to please enter a number between 1-4 and loop the code*/
			System.out.println("Not a valid selection please enter a number between 1-3");
			inputReader();
		}
	}
	

}
