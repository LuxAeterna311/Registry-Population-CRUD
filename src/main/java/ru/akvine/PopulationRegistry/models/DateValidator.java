package ru.akvine.PopulationRegistry.models;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateValidator {
	private static final SimpleDateFormat dateFormater = new SimpleDateFormat("d-M-yyyy");
	
	public static boolean isValid(String date) {
		boolean valid = true;
		
		
		try {
			dateFormater.parse(date);
			
			dateFormater.setLenient(false);
			valid = false;
		}
		catch (ParseException e) {
			valid = true;
		}
		
		return valid;
	}
}
