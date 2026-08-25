package incrementos.y.condicionales;

import java.util.Scanner;

/**
 *
 * @author Juan Sebastian Osorio Cstañeda 20261241939
 */
public class Ejercicio1Descuentos {

    public static void main(String[] args) {
        double descuento, compra, valorDes, total;
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto dinero gasto en el supermercado?");
        compra = sc.nextDouble();
        if (compra < 100000) {
            descuento = 0;
            valorDes = compra * descuento;
            total = compra - descuento;

        }
        else if (compra >= 100000 && compra <= 300000) {
            descuento = 0.10;
            valorDes = compra * descuento;
            total = compra - valorDes;

        }
        else if (compra > 300000 && compra <= 500000) {
            descuento = 0.15;
            valorDes = compra * descuento;
            total = compra - valorDes;
        }
        else {
            descuento = 0.20;
            valorDes = compra * descuento;
            total = compra - valorDes;

        }
        // mostrar resultados
        System.out.println("Su compra tiene un valor de: "+compra);
        System.out.println("Su descuento es de " + (descuento*100) + "%");
        System.out.println("El valor que se le descuenta es de: "+ valorDes);
        System.out.println("En total su compra quedaria con un valor de: "+ total);

    }
}
