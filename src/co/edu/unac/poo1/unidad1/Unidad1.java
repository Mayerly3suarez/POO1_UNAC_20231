package co.edu.unac.poo1.unidad1;

import co.edu.unac.poo1.unidad2.Unidad2;

import java.util.Scanner;

public class Unidad1 {

    private static final int MAXIMA_OPCION_MENU = 5;

    public static void menuPrincipal() {
        int opcionMenu;
        Scanner scanner = new Scanner(System.in);
        do {
            Unidad1.saludo();
            System.out.println("\nPor favor digite una opcion:");
            System.out.println("---------------------------UNIDAD 2---------------------------");
            System.out.println("1. Ver Instancia de tiquete");
            System.out.println("2. Modificar un tiquete existente");
            System.out.println("3. Calcular el precio total de 3 tiquetes");
            System.out.println("4. Salir de la aplicacion");
            opcionMenu = scanner.nextInt();
            scanner.nextLine(); //Se agrega para procesar el enter
            // despues de digitar un numero
            switch (opcionMenu) {
                case 1:
                    Unidad2.mostrarTiqueteV1();
                    break;
                case 2:
                    System.out.println("Por definir #2");
                    break;
                case 3:
                    System.out.println("Por definir #3");
                    break;
                case 4:
                    break;
                case MAXIMA_OPCION_MENU:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.err.println("ERROR: Opcion invalida");
                    break;
            }

        } while (opcionMenu != MAXIMA_OPCION_MENU);
    }

    public static void saludo() {
        System.out.print("Bienvenidos al curso de POO1, ");
        System.out.print("Exitos");
        System.out.print(" en el semestre!!");
    }
}
