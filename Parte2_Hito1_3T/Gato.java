package Parte2_Hito1_3T;

public class Gato extends Animal{
	boolean leucemia;
		
	// Constructor para crear un objeto Gato con los atributos comunes y específicos.
	public Gato(int chip, String nombre, int edad, String raza, boolean adoptado, String tamaño, boolean leucemia) {
		super(chip, nombre, edad, raza, adoptado);
		this.leucemia = leucemia;
			
	}
		
	public void mostrar() {
		System.out.println("Animal: Gato");
		System.out.println("Su numero de identificacion es: "+chip);
		System.out.println("Su nombre es: "+nombre);
		System.out.println("Su edad es de: "+edad+" Años");
		System.out.println("El Gato es de raza: ");
		System.out.println("¿El gato tiene leucemia? "+leucemia);
		System.out.println("¿El perro es adoptado?: " + (adoptado ? "Sí" : "No"));

	}

}

