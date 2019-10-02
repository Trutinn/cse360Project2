/*
Preston Mott, 70641, Assignment 2 
*/
package cse360assign2;


public class AddingMachine {
	
	private int total;
	private String returnString = "0";
	
	//constructor to set the total to be equal to 0
	public AddingMachine () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	//returns the current total
	public int getTotal () 
	{
		return total;
	}
	
	//add the parameter to the current total
	public void add (int value) 
	{
		total += value;
		returnString = returnString + " + " + value;
	}
	
	//subtract the parameter to the current total
	public void subtract (int value) 
	{
		total -= value;
		returnString = returnString + " - " + value;
	}
		
	//returns all past operations performed
	public String toString () 
	{
		return returnString;
	}

	//clears the history
	public void clear() 
	{
		returnString = "0";
	}
}
