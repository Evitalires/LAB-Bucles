import java.util.Scanner;

public class Ejercicio2 {
    public static  void CalculadoraDescuentos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n --- Calculadora de Descuentos ---");
        System.out.println("Escriba el valor del producto:");
        double valorProducto = scanner.nextDouble();
        double valorDescuento = 0;
        double descuento = 1;
        double descuentoAplicar = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Precio actual: $" + valorProducto);
            descuentoAplicar -= 0.1;
            descuento += descuentoAplicar;
            System.out.println("Descuento: " + descuentoAplicar*100 + "%");
            valorDescuento = valorProducto + (valorProducto*descuentoAplicar);
            System.out.println("Nuevo precio: $" + valorDescuento);
            valorDescuento = 0;
        }
    }
}
