import java.util.Scanner;

public class Ejercicio4 {
    public static void CajeroAutomatico() {
        double saldo = 0;
        int opcionUsuario;
        int cantidad;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n --- Bienvenido a BancGeneration ---");
        do {
            cantidad = 0;
            opcionUsuario = 0;
            System.out.println("\n -- Menu de Eleccion --");
            System.out.println("\n 1. Consultar Saldo");
            System.out.println("\n 2. Retirar Efectivo");
            System.out.println("\n 3. Depositar Efectivo");
            System.out.println("\n 4. Finalizar sesion.");

            System.out.println("\n -- Escriba el numero de la opcion: --");
            opcionUsuario = scanner.nextInt();
            scanner.nextLine();

            switch (opcionUsuario) {
                case 1:
                    System.out.println("Su saldo actual es: " + saldo);
                    break;
                case 2:
                    if(saldo < 1 ) {
                        System.out.println("Su cuenta esta en: $" + saldo );
                        System.out.println("Por favor deposite a su cuenta");
                    } else {
                        System.out.println("Cuanto efectivo va retirar? ");
                        double valorRetiro = scanner.nextDouble();
                        saldo -= valorRetiro;
                        System.out.println("Su nuevo saldo es: $" + saldo);
                        break;
                    }
                case 3:
                    System.out.println("Cuanto efectivo va a depositar? ");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Su nuevo saldo es: $" + saldo);
                    break;
                default:
                    System.out.println("-- ❌ Opcion no disponible ❌ --");
            }
        } while (opcionUsuario != 4);
        scanner.close();
        System.out.println("Gracias por usar nuestros servicios!");
    }
}
