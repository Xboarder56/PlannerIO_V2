/*
 * Garrett J. Beasley
 * 01/21/2015
 * Contact.java
 */

/**
 * @author Garrett J. Beasley
 * @date 01/21/2015
 * @description The program is a simple game that will allow
 * the user to display the contacts and data about there contacts
 * in a user's planner.
 */

/*Package for the project (planer.io)*/
package planer.io;

/**This is the sub level2 Class for the program.
 * This will get the users name and age
 * Then will allow the users to
 * change the variables later on and 
 * return the variables as well
 */
public abstract class Contact
{
	/*Variables for the project*/
	private String name;
	private int age;

	/**
	 * Constructor for the program to pass in the name 
	 * and age and then store them in a global variable (name, age)
	 * @param name passes the users name to a string
	 * @param age passes the users age to a int
	 */
	public Contact(String name, int age) 
	{
		super();
		this.name = name;
		this.age = age;
	}
	
	/**
	 * Method named getName to pass the users name and return it
	 * @return the users name that was passed
	 * into the program
	 */
	public String getName()
	{
		return name;
		
	}
	
	/**
	 * Method named getAge to pass the users age and return it
	 * @return the users age that was passed
	 * into the program
	 */
	public int getAge()
	{
		return age;
	}
	
	/**
	 * Method named setName to set the name to a new name
	 * provided by the user.
	 * @param name sets a new name provided by the user.
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Method named setAge to set the age to a new age
	 * provided by the user.
	 * @param name sets a new age provided by the user.
	 */
	public void setAge(int age)
	{
		this.age = age;
		
	}
	
	/**
	 * New toString method because we want
	 * a real string not a memory address
	 */
	public String toString()
	{
		return "Name: " + name + "Age " + age;
	}
	
	public abstract void validate();

}

