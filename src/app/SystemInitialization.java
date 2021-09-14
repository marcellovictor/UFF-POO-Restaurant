package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import entities.Restaurant;

public class SystemInitialization {
	
	private static final int STANDARD_TABLES_NUMBER = 100;
	
	private static String numTablesFile = "NumberOfTables.txt";
	
	public static Restaurant go() {
		
		int tablesNumber = STANDARD_TABLES_NUMBER;
		String line;
		
		try (BufferedReader br = new BufferedReader(new FileReader(numTablesFile))) {
			line = br.readLine();
			tablesNumber = Integer.parseInt(line);
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			System.out.println("System will be initalized with STANDARD_TABLES_NUMBER");
		}
		
		Restaurant restaurant = new Restaurant(tablesNumber);
		
		return restaurant;
	}
}
