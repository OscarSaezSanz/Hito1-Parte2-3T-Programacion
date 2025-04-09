package Parte2_Hito1_3T;

import java.util.*;

public class AltaAnimales {
    Scanner sc = new Scanner(System.in);
    ArrayList<Animal> animales = new ArrayList<>(); // Lista de objetos Animal (Perro, Gato)
    ArrayList<Adopcion> adopciones = new ArrayList<>(); //Lista de las adopciones (Perros y Gatos)
    
    public void altaAnimal() {
        System.out.println("¿Qué tipo de animal desea registrar? (perro/gato):");
        String tipo = sc.nextLine().trim().toLowerCase();
        
        System.out.println("Ingrese el número de chip del animal:");
        int chip = sc.nextInt();
        sc.nextLine(); // Limpia el buffer después de nextInt()

        // Verifica si el chip ya existe y si ya existe lanza mensaje y te pregunta para añadir otro chip
        for (Animal a : animales) {
            if (a.chip == chip) {
                System.out.println("Ya hay un animal ingresado con ese chip: " + chip + ". Ingrese otro chip.");
                return;
            }
        }

        System.out.println("Ingrese el nombre del animal:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese la edad del animal:");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese la raza del animal:");
        String raza = sc.nextLine();

        System.out.println("¿El animal está adoptado? (si o no):");
        String adoptadoInput = sc.nextLine().trim().toLowerCase();
        boolean adoptado = adoptadoInput.equals("si");

        if (tipo.equals("perro")) {
            System.out.println("Ingrese el tamaño del perro (pequeño/mediano/grande):");
            String tamaño = sc.nextLine();

            Perro p = new Perro(chip, nombre, edad, raza, adoptado, tamaño);
            animales.add(p);
            System.out.println("Perro registrado correctamente.");
            
            
        } else if (tipo.equals("gato")) {
            System.out.println("¿El gato tiene leucemia? (si o no):");
            String leucemiaInput = sc.nextLine().trim().toLowerCase();
            boolean leucemia = leucemiaInput.equals("si");

            Gato g = new Gato(chip, nombre, edad, raza, adoptado, "N/A", leucemia);
            animales.add(g);
            System.out.println("Gato registrado correctamente.");
        } else {
            System.out.println("Tipo de animal no válido. Solo se permite 'perro' o 'gato'.");
        }
    }

    public void mostrarAnimales() {
        System.out.println("Lista de animales registrados:");
        for (Animal a : animales) {
            a.mostrar();
        }
    }

    public static void main(String[] args) {
        AltaAnimales registro = new AltaAnimales();
        while (true) {
            registro.altaAnimal();
            System.out.println("¿Quiere ingresar otro animal? (si/no)");
            String respuesta = registro.sc.nextLine();
            if (!respuesta.equalsIgnoreCase("si")) {
                break;
            }
        }
        registro.mostrarAnimales();
        
    }
 // Busca un animal en la lista utilizando su número de chip
    public void buscarAnimalPorChip(int chip) {
        for (Animal a : animales) {
            if (a.chip == chip) {
                // Si encuentra coincidencia, muestra los datos del animal
                a.mostrar();
                return;
            }
        }
        // Si no se encuentra el animal, muestra mensaje de error
        System.out.println("Animal no encontrado por el chip ingresado.");
    }

    // Permite registrar una adopción, verificando primero si el animal ya fue adoptado
    public void realizarAdopcion() {
        System.out.println("Ingrese el chip del animal que desea adoptar:");
        int chip = sc.nextInt();
        sc.nextLine();

        for (Animal a : animales) {
            if (a.chip == chip) {
                if (a.adoptado) {
                    System.out.println("Este animal ya ha sido adoptado por otra persona.");
                    return;
                }

                // Solicito datos de la persona adoptante
                System.out.println("Ingrese su Nombre:");
                String nombre = sc.nextLine();
                System.out.println("Ingrese su DNI:");
                String DNI = sc.nextLine();

                // Actualizo el estado del animal y registro la adopción
                a.adoptado = true;
                Adopcion adopcion = new Adopcion(chip, nombre, DNI);
                adopciones.add(adopcion);
                adopcion.mostrarAdopcion();
                return;
            }
        }

        // Mensaje si no se encuentra el chip
        System.out.println("No se encontró el animal con el chip ingresado.");
    }

    // Elimina un animal de la lista si su chip coincide con el ingresado
    public void darDeBajaAnimal() {
        System.out.println("Ingrese el chip del animal que eliminar:");
        int chip = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).chip == chip) {
                animales.remove(i);
                System.out.println("Animal eliminado correctamente.");
                return;
            }
        }

        // Mensaje si no se encuentra el chip en la lista
        System.out.println("No se encontró el animal con el chip ingresado.");
    }

    // Muestra estadísticas de gatos: cuántos hay y cuántos tienen leucemia
    public void estadisticasDeGatos() {
        int total = 0;
        int conLeucemia = 0;

        for (Animal a : animales) {
            if (a instanceof Gato) {
                total++;
                Gato gato = (Gato) a;
                if (gato.leucemia) {
                    conLeucemia++;
                }
            }
        }

        // Imprime resultados
        System.out.println("Gatos: ");
        System.out.println("Total de gatos: " + total);
        System.out.println("Gatos con leucemia: " + conLeucemia);
    }
}
