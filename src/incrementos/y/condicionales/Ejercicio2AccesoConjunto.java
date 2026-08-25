package incrementos.y.condicionales;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian Osorio Cstañeda 20261241939
 */
public class Ejercicio2AccesoConjunto {

    public static void main(String[] args) {
        String tieneTarjeta, tarjetaActiva, tieneDeudas;
        Scanner sc = new Scanner(System.in);

        System.out.println("Tienes tarjeta? (Si/No): ");
        tieneTarjeta = sc.nextLine();

        System.out.println("Tienes la tarjeta activa? (Si/No): ");
        tarjetaActiva = sc.nextLine();

        System.out.println("Tienes deudas? (Si/No): ");
        tieneDeudas = sc.nextLine();

        if (tieneTarjeta.equalsIgnoreCase("Si")) {
            if (tarjetaActiva.equalsIgnoreCase("Si")) {
                if (tieneDeudas.equalsIgnoreCase("No")) {
                    System.out.println("Acceso permitido");
                } else {
                    System.out.println("Acceso restringido por mora");
                }
            } else {
                System.out.println("Acceso restringido por tarjeta inactiva");
            }

        } else {
            System.out.println("Acceso denegado por ausencia de tarjeta");
        }

    }

}
