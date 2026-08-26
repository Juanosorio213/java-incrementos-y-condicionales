package incrementos.y.condicionales;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian Osorio Cstañeda 20261241939
 */
public class Ejercicio3Transporte {

    public static void main(String[] args) {
        double calificacion;
        int viajes;
        String disponible;
        Scanner sc = new Scanner(System.in);

        System.out.println("Cual es la calificacion del conductor?");
        calificacion = sc.nextDouble();
        System.out.println("Cuantos viajes a realizado?");
        viajes = sc.nextInt();
        sc.nextLine();
        System.out.println("Esta disponible el conductor? (Si/No): ");
        disponible = sc.nextLine();

        int contador = 0;

        if (calificacion >= 4.8) {
            contador++;
        }
        if (viajes > 500) {
            contador++;
            if (disponible.equalsIgnoreCase("Si")) {
                contador++;
            }
            if (contador == 3) {
                System.out.println("Es conductor premium");
            }
            if (contador == 2) {
                System.out.println("Es conductor estandar");
            }
        } else {
            System.out.println("No puede ser asignado");
        }
    }
}
