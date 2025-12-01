import java.util.Scanner;

public class Ejercicio3 {
    public static void tablaMultiplicarInteractiva() {
        Scanner scanner = new Scanner(System.in);
        int tablaMultiplicar = 0;
        int contador = 1;
        System.out.println("\n --- Tabla de multiplicar interactiva ---");

        while (tablaMultiplicar < 1 || tablaMultiplicar > 10 ) {
            System.out.println("Escribra un numero del 1 al 10\npara imprimir su tabla de multiplicar");
            tablaMultiplicar = scanner.nextInt();
            scanner.nextLine();
        }
        while (contador < 11) {
            System.out.println("La tabla del " + tablaMultiplicar + " al 10: "
                    + tablaMultiplicar + " * " + contador + " = " + tablaMultiplicar*contador
            );
            contador++;
        }
    }
}
