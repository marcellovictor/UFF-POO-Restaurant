package entities;

public class Restaurant {

	//Attributes
	
	private Integer tablesNumber;
	private Table[] tableArray;
	
	//Constructors
	
	public Restaurant(Integer tablesNumber) {
		this.tablesNumber = tablesNumber;
		tableArray = new Table[tablesNumber];
		
		for (int i = 0; i < tablesNumber; i++) {
			tableArray[i] = new Table(i+1);
		}
		
	}
	
	//Getters

	public Integer getTablesNumber() {
		return tablesNumber;
	}

	public Table[] getTableArray() {
		return tableArray;
	}
	
	
}
