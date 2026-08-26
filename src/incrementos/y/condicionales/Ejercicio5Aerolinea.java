package incrementos.y.condicionales;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian Osorio Cstañeda 20261241939
 */
public class Ejercicio5Aerolinea {

    public static void main(String[] args) {
        int vuelos;
        String membresia;

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos vuelos lleva el pasajero?");
        vuelos = sc.nextInt();
        sc.nextLine();
        System.out.println("Membresia se encuentra activa?(Si/No): ");
        membresia = sc.nextLine();

        if (vuelos > 50 && vuelos <= 70 && membresia.equalsIgnoreCase("Si")) {
            System.out.println("Eres categoria Oro");
            System.out.println("No tienes acceso VIP");
        } if (vuelos <= 50 && vuelos >=20 && membresia.equalsIgnoreCase("Si")) {
            System.out.println("Eres categoria Plata");
            System.out.println("No tienes acceso VIP");
        } if (vuelos < 20 || membresia.equalsIgnoreCase("No")) {
            System.out.println("Eres categoria Basica");
            System.out.println("No tienes acceso VIP");
        } if (vuelos > 70 && membresia.equalsIgnoreCase("Si")) {
            System.out.println("Eres categoria Oro");
            System.out.println("Tienes acceso VIP");
        }
            
    }
}
