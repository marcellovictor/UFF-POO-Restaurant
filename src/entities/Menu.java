package entities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Menu {

	private List<Dish> dishes;
	private List<Drink> drinks;
	private List<Dessert> desserts;
	
	public Menu() {
		this.dishes = new ArrayList<>();
		this.drinks = new ArrayList<>();
		this.desserts = new ArrayList<>();
		
		//Dishes
		File dishesFile = new File("Dishes.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(dishesFile))) {
			String line = br.readLine();
			
			while (line != null) {
				
				String splited[] = line.split(" ");
				String name  = splited[0];
				Double price = Double.parseDouble(splited[1]);
				
				dishes.add(new Dish(name, price));
				
				line = br.readLine();
			}
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		//Drinks
		File drinksFile = new File("Drinks.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(drinksFile))) {
			String line = br.readLine();
			
			while (line != null) {
				
				String splited[] = line.split(" ");
				String name  = splited[0];
				Double price = Double.parseDouble(splited[1]);
				
				drinks.add(new Drink(name, price));
				
				line = br.readLine();
			}
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		//Desserts
		File dessertsFile = new File("Desserts.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(dessertsFile))) {
			String line = br.readLine();
			
			while (line != null) {
				
				String splited[] = line.split(" ");
				String name  = splited[0];
				Double price = Double.parseDouble(splited[1]);
				
				desserts.add(new Dessert(name, price));
				
				line = br.readLine();
			}
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public List<Dish> getDishes() {
		return dishes;
	}

	public List<Drink> getDrinks() {
		return drinks;
	}

	public List<Dessert> getDesserts() {
		return desserts;
	}
	
	
	
	
}
