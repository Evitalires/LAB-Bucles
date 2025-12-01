import java.util.Scanner;

public class Ejercicio1 {
    public static void Caja() {
        int totalFactura = 0;
        int opcionUsuario;
        int cantidad;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n --- Bienvenido a Comiditas al instante ---");
        do {
            cantidad = 0;
            opcionUsuario = 0;
            System.out.println("\n -- Menu de Eleccion --");
            System.out.println("\n 1. Hamburguesa - $50");
            System.out.println("\n 2. Papas - $30");
            System.out.println("\n 3. Refresco - $20");
            System.out.println("\n 4. Concluir orden.");

            System.out.println("\n -- Escriba el numero de la opcion: --");
            opcionUsuario = scanner.nextInt();
            scanner.nextLine();
            System.out.println("\n Cuantas unidades? ");
            cantidad = scanner.nextInt();
            scanner.nextLine();
            switch (opcionUsuario) {
                case 1:
                    System.out.println("Usted escogio " + cantidad + " Hamburguesa");
                    totalFactura += cantidad * 50;
                    break;
                case 2:
                    System.out.println("Usted escogio " + cantidad + " Papas");
                    totalFactura += cantidad * 30;
                    break;
                case 3:
                    System.out.println("Usted escogio " + cantidad + " Refresco");
                    totalFactura += cantidad * 20;
                    break;
                case 4:
                    System.out.println("El total de su factura es: " + totalFactura);
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcionUsuario != 4);
    }
}
