package entities;

import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JFrame;

public class Restaurant {

	//Attributes
	
	private Integer tablesNumber;
	private Table[] tableArray;
	
	private AvaliacaoOO avaliacaoOO;
	
	//Constructors
	
	public Restaurant(Integer tablesNumber) {
		this.tablesNumber = tablesNumber;
		tableArray = new Table[tablesNumber];
		
		for (int i = 0; i < tablesNumber; i++) {
			tableArray[i] = new Table(i+1);
		}
		
		avaliacaoOO = AvaliacaoOO.avalFileRead();
		System.out.println(avaliacaoOO.toString());
		
	}
	
	//Getters

	public Integer getTablesNumber() {
		return tablesNumber;
	}

	public Table[] getTableArray() {
		return tableArray;
	}
	
	public AvaliacaoOO getAvaliacaoOO() {
		return avaliacaoOO;
	}
	
	
}
