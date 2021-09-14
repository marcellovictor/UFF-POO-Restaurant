package entities;

public class Food {

	//Attributes
	private String name;
	private Double price;
	
	//Constructor
	public Food(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	
	//Getters
	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}
	
	//Methods
	
	public String toString() {
		return name + ": $" + String.format("%.2f", price);
	}
	
	
}
