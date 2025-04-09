package Parte2_Hito1_3T;

public class Adopcion extends AltaAnimales{
	int chip;
	String nombre;
	String DNI;
	
	public Adopcion(int chip, String nombre, String DNI) {
		this.chip = chip;
		this.nombre = nombre;
		this.DNI = DNI;
	}
	
	public void mostrarAdopcion() {
		System.out.println("El Animal con chip: " +chip+ " a sido adoptado.");
		System.out.println("El nombre del dueño es: " +nombre+ " Y numero de DNI: " +DNI);
	}
}
