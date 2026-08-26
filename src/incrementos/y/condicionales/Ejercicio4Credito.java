package incrementos.y.condicionales;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian Osorio Cstañeda 20261241939
 */
public class Ejercicio4Credito {

    public static void main(String[] args) {
        int ingresos, puntajeCredi, antiguedad;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cual es su numero de ingresos?");
        ingresos = sc.nextInt();
        System.out.println("Que numero de puntaje crediticio tiene?");
        puntajeCredi = sc.nextInt();
        System.out.println("Cual es su antiguedad laboral indicada en numero de años?");
        antiguedad = sc.nextInt();
        
        int contador = 0;
        if (ingresos > 5000000) {
            contador++;
            }
            if (puntajeCredi > 750) {
                contador++;
            }
            if (antiguedad > 2) {
                contador++;
            }
            if (contador == 3) {
                System.out.println("Credito aprobado");
            } else if (contador == 2) {
                System.out.println("Credito condicionado");
            } else {
                System.out.println("Credito rechazado");

            }
        }
    }

