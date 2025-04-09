package Parte2_Hito1_3T;

public abstract class Animal {
	// Atributos comunes para todos los animales
	int chip;
	String nombre;
	int edad;
	String raza;
	boolean adoptado;
	
	// Constructor que inicializa los atributos comunes de un animal
	public Animal (int chip, String nombre, int edad, String raza, boolean adoptado){
	this.chip = chip;
	this.nombre = nombre;
	this.edad = edad;
	this.raza = raza;
	this.adoptado = adoptado;
	}
	
	public abstract void mostrar();

}
