/*
 * Garrett J. Beasley
 * 01/21/2015
 * BusinessContact.java
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


/**This is the sub level3 Class for the program.
 * This will get the users name, age, cellphone,
 * businessPhone. Then will allow the users to
 * change the variables later on and 
 * return the variables as well
 */
public class BusinessContact extends Contact
{
	/*Variables for the project*/
	private String businessPhone;
	private String cellPhone;
	
	/**
	 * Main constructor for the business Contact with 4 parameters for the user to enter
	 * String, Int, String, String.
	 * @param name The users name that is passed up to the superConstructor
	 * @param age The users age that is passed up to the superConstructor
	 * @param cellPhone The users cellPhone number is stored in the 
	 * cellPhone then passed into the global cell phone (String)
	 * @param businessPhone The users businessPhone number is stored in the 
	 * businessPhone then passed into the global businessPhone(String)
	 */
	public BusinessContact(String name, int age, String cellPhone, String businessPhone) 
	{
		super(name, age);
		this.cellPhone = cellPhone;
		this.businessPhone = businessPhone;
		validate();
	}
	
	/**
	 * Method named getBusinessPhone to pass the users phone and return it
	 * @return the users business phone that was passed
	 * into the program
	 */
	public String getBusinessPhone()
	{
		return businessPhone;
		
	}
	
	/**
	 * Method named getCellPhone to pass the users phone and return it
	 * @return the users personal phone that was passed (cellPhone)
	 * into the program
	 */
	public String getCellPhone()
	{
		return cellPhone;
		
	}
	
	/**
	 * Method named setBusinessPhone to set the 
	 * businessPhone to a new businessPhone 
	 * provided by the user.
	 * @param businessPhone sets a new
	 *  businessPhone provided by the user.
	 */
	public void setBusinessPhone(String businessPhone)
	{
		this.businessPhone = businessPhone;
	}
	
	/**
	 * Method named setCellPhone to set the 
	 * CellPhone to a new CellPhone 
	 * provided by the user.
	 * @param cellPhone sets a new
	 * cellPhone provided by the user.
	 */
	public void setCellPhone(String cellPhone)
	{
		this.cellPhone = cellPhone;
	}
	
	/**
	 * New toString method because we want
	 * a real string not a memory address
	 */
	public String toString()
	{
		return "Personal Contact: " + getName() + " (" + getAge() + "), " +"Busniess Cell: " 
				+ businessPhone + ", Personal Phone: " + cellPhone;
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
		
		if(cellPhone.length() != 12)
		{
			throw new IllegalStateException("Not valid phone number needs to be"
					+ " formated as XXX-XXX-XXXX !");
		}
		
		if(businessPhone.length() != 12)
		{
			throw new IllegalStateException("Not valid phone number needs to be"
					+ " formated as XXX-XXX-XXXX !");
		}
	}
	

}

