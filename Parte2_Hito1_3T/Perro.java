package Parte2_Hito1_3T;

public class Perro extends Animal {
	String tamaño;
	
	// Constructor para crear un objeto Perro con los atributos comunes y específicos.
	public Perro(int chip, String nombre, int edad, String raza, boolean adoptado, String tamaño) {
		super(chip, nombre, edad, raza, adoptado);
		this.tamaño = tamaño;
		
	}
	
	public void mostrar() {
		System.out.println("Animal: Perro");
		System.out.println("Su numero de identificacion es: "+chip);
		System.out.println("Su nombre es: "+nombre);
		System.out.println("Su edad es de: "+edad+" Años");
		System.out.println("El Perro es de raza: ");
		System.out.println("El perro es de tamaño: "+tamaño);
		System.out.println("¿El perro es adoptado?: " + (adoptado ? "Sí" : "No"));

	}

}
