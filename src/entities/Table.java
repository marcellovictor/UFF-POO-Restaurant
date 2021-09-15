package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.TableState;

public class Table {

	//Atributes
	
	private Integer id;
	private boolean empty;
	private TableState state;
	
	private List<Food> order = new ArrayList<>();
	
	//Constructors
	
	public Table(Integer id) {
		this.id = id;
		empty = true;
		state = null;
	}

	//Getters
	
	public Integer getId() {
		return id;
	}

	public boolean isEmpty() {
		return empty;
	}
	
	public void makeEmpty() {
		empty = true;
	}
	
	public void makeOccupied() {
		empty = false;
	}

	public TableState getState() {
		return state;
	}

	public List<Food> getOrder() {
		return order;
	}
	
	//Methods
	
	@Override
	public String toString() {
		return "Table " + id;
	}
	
	public void makeOrderEmpty() {
		this.order = new ArrayList<>();
	}
	
	
	
	
	
	
	//conta o tempo de espera da porra do pedido
	
}
