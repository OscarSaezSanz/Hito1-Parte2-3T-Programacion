package Parte2_Hito1_3T;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        AltaAnimales sistema = new AltaAnimales();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--_--Menú Principal--_--");
            System.out.println("\n1 – Dar de alta animal");
            System.out.println("2 – Lista de animales");
            System.out.println("3 – Buscar animal");
            System.out.println("4 – Realizar una adopción");
            System.out.println("5 – Dar de baja una adopcion");
            System.out.println("6 – Mostrar estadísticas de los gatos");
            System.out.println("7 – Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    sistema.altaAnimal();
                    break;
                case 2:
                    sistema.mostrarAnimales();
                    break;
                case 3:
                    System.out.print("Ingrese chip del animal a buscar: ");
                    int chipBuscar = sc.nextInt();
                    sc.nextLine();
                    sistema.buscarAnimalPorChip(chipBuscar);
                    break;
                case 4:
                    sistema.realizarAdopcion();
                    break;
                case 5:
                    sistema.darDeBajaAnimal();
                    break;
                case 6:
                    sistema.estadisticasDeGatos();
                    break;
                case 7:
                    System.out.println("Ha Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
        
        while (opcion != 7);
    }
}


