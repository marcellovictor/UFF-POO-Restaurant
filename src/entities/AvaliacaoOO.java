package entities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import entities.exceptions.AvaliacaoOONaoInformadaException;

public class AvaliacaoOO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Attributes
	
	private String nome;
	private String matricula;
	
	private static String fileName = "avaliacaoOO.dat";
	
	//Constructors
	
	public AvaliacaoOO(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	//Getters
	
	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	//Other methods
	
	@Override
	public String toString() {
		return nome + " - " + matricula;
	}
	
	
	public void avalFileWrite() {
		
		try (ObjectOutputStream obos = new ObjectOutputStream(new FileOutputStream("avaliacaoOO.dat"))) {
			
			if (nome != null && matricula != null) {
				obos.writeObject(this);
			}
			else {
				throw new AvaliacaoOONaoInformadaException("Atributo não informado!");
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static AvaliacaoOO avalFileRead() {
		
		try(ObjectInputStream obis = new ObjectInputStream(new FileInputStream("avaliacaoOO.dat"))) {
			
			AvaliacaoOO avaliacaoOO = (AvaliacaoOO) obis.readObject();
			
			if (avaliacaoOO.nome != null && avaliacaoOO.matricula != null) {
				return avaliacaoOO;
			}
			else {
				throw new AvaliacaoOONaoInformadaException("Atributo não informado!");
			}
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
}
