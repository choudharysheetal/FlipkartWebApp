package Utility;


import java.text.SimpleDateFormat;
import java.util.Random;
 import java.util.Date;
/**
 * this class contains java resusable methods
 * @author Admin
 *
 */
public final class JavaUtility {
	/**
	 * This method is used to generate the Random Number with in limit
	 * @param limit
	 * @return
	 */
	
	public int getRandomNumber(int limit)
	{
		return new Random().nextInt(limit);
	}
	
	
	
	
	/**
	 * This method is used to generate the random number with in 1000
	 * @return
	 */
	
	public int getRandomNumber()
	{
		return new Random().nextInt(1000);
		
	}
	/**
	 * This method is used to convert the string to long data type
	 * @param stringData
	 * @return
	 */
	public long convertStringToLong(String stringData)
	{
		return Long.parseLong(stringData);
		
	}
	/**
	 * This method is used to print the value in console
	 * @param value
	 */
	
	public void printStatement(String value)
	{
		System.out.println(value);
	}
	
	public String[] splitString(String value, String strategy)
	{
		return value.split(strategy);
		
	}
	/**
	 * This method is used to get current data in specified strategy
	 * @param strategy
	 * @return
	 */
	
	public String getCurrentDate(String strategy) {
		return new SimpleDateFormat(strategy).format(new Date());
	}
	}

