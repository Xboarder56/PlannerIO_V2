/*
 * Garrett J. Beasley
 * 01/21/2015
 * PersonalContact.java
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

/**This is the sub level3 Class for the program.
 * This will get the users name, age, address,
 * city, state, and zip. Then will allow the users to
 * change the variables later on and 
 * return the variables as well
 */
public class PersonalContact extends Contact
{
	/*Variables for the project*/
	private String address;
	private String state;
	private String city;
	private int zip;
	
	/**
	 * Main constructor for the business Contact with 4 parameters for the user to enter
	 * String, Int, String, String, String, Int.
	 * @param name The users name that is passed up to the superConstructor (String)
	 * @param age The users age that is passed up to the superConstructor (INT)
	 * @param address The users address is stored in the 
	 * address then passed into the global address (String)
	 * @param city The users city is stored in the 
	 * city variable then passed into the global city variable (String)
	 * @param state The users state is stored in the 
	 * state variable then passed into the global state variable (String)
	 * @param zip  The users zip code is stored in the 
	 * zip variable then passed into the global zip variable (INT)
	 */
	public PersonalContact( String name, int age, String address, String city, String state, int zip) 
	{
		super(name, age);
		this.address = address;
		this.state = state;
		this.city = city;
		this.zip = zip;
		validate();
	}
	
	/**
	 * Method named getAddress to pass the users address and return it
	 * @return the users address that was passed (address)
	 * into the program via a String variable
	 */
	public String getAddress()
	{
		return address;
		
	}
	
	/**
	 * Method named getState to pass the users state and return it
	 * @return the users state that was passed (state)
	 * into the program via a String variable
	 */
	public String getState()
	{
		return state;
		
	}
	
	/**
	 * Method named getCity to pass the users city and return it
	 * @return the users city that was passed (city)
	 * into the program via a String variable
	 */
	public String getCity()
	{
		return city;
		
	}
	
	/**
	 * Method named getZip to pass the users zip code and return it
	 * @return the users zip code that was passed (zip)
	 * into the program via a INT variable
	 */
	public int getZip()
	{
		return zip;
	}
	
	/**
	 * Method named setAddress to set the 
	 * address to a new address 
	 * provided by the user. (String)
	 * @param address sets a new
	 * address provided by the user.
	 */
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	/**
	 * Method named setState to set the 
	 * state to a new state
	 * provided by the user. (String)
	 * @param state sets a new
	 * state provided by the user.
	 */
	public void setState(String state)
	{
		this.state = state;
	}
	
	/**
	 * Method named setCity to set the 
	 * city to a new city
	 * provided by the user. (String)
	 * @param city sets a new
	 * city provided by the user.
	 */
	public void setCity(String city)
	{
		this.city = city;
	}
	
	/**
	 * Method named setZip to set the 
	 * zip code to a new zip 
	 * provided by the user. (INT)
	 * @param zip sets a new
	 * zip provided by the user.
	 */
	public void setZip(int zip)
	{
		this.zip = zip;
		
	}
	
	/**
	 * New toString method because we want
	 * a real string not a memory address
	 */
	public String toString()
	{
		return "Personal Contact: " + getName() + " (" + getAge() + "), " + address +
				", " + city + ", " + state + ", " + zip;
	}
	
	/**
	 * Validate method to insure the user is 
	 * providing real values not just junk into
	 *  the program that could cause it to crash.
	 *  If they provide bad values throw an exception
	 */
	public void validate()
	{
		if(getName().equals("") || getName().equals(null))
		{
			throw new NullPointerException("You need to enter a valid name!");
		}
		
		if(getAge() < 1 || getAge() > 100 )
		{
			throw new IllegalStateException("The age you provided is not in a valid range!");
		}
		
		if(address.equals("") || address.equals(null))
		{
			throw new NullPointerException("You need to enter a valid address!");
		}
		
		if(city.equals("") || city.equals(null))
		{
			throw new NullPointerException("You need to enter a valid city!");
		}
		
		if(state.length() != 2)
		{
			throw new IllegalStateException("Not valid state XX !");
		}
		
		if(zip != 5)
		{
			throw new IllegalStateException("Not valid zipcode XXXXX !");
		}
	}

}
