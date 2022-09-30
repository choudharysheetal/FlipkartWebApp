package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class PropertyUtility {

	private Properties properties;
	
	/**
	 * This method is used for initialize the property file
	 * @param filePath
	 */
	public void intialiePropertyFile(String filePath)
	{
		FileInputStream fis = null;
		
		try
		{
			fis=new FileInputStream(filePath);
		}
			
			catch (FileNotFoundException e1)
			{
				e1.printStackTrace();
			}
			
			
		
			properties= new Properties();
			try
			{
				properties.load(fis);
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * this method is used to fetch the data from property file
	 * @param key
	 * @return
	 */
	public String getDataFromProperty(String key)
	{
		return properties.getProperty(key.trim());
		
	}
	
	
	/**
	 * This method is used to fetch the data From CSV file
	 * @param csvFilePath
	 * @param rowNumber
	 * @param cellNumber
	 * @return
	 */

	public String getDataFromCSV(String csvFilePath, int rowNumber,int cellNumber) {
		CSVReader reader=null;

		String allData=null;
		try {
			reader=new CSVReader(new FileReader(csvFilePath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


		try {
			allData = reader.readAll().get(rowNumber)[cellNumber];
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CsvException e) {
			e.printStackTrace();
		}
		return allData;
	}

}


	
