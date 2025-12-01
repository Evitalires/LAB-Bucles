import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
    public static void GeneradorContraseñas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Generador de Contraseñas ---");
        System.out.print("Ingrese la longitud deseada de la contraseña (ej. 12): ");
        int longitud = scanner.nextInt();
        scanner.nextLine();
        if (longitud < 1) {
            longitud = 12;
        }

        // Definir el Pool de Caracteres (Character Set)
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";
        String simbolos = "!@#$%^&*()_+-=[]{}|;:,.<>/?";

        //Combinar Caracteres
        String poolCaracteres = minusculas + mayusculas + numeros + simbolos;

        Random random = new Random();
        StringBuilder contrasena = new StringBuilder(longitud); // Usamos StringBuilder para eficiencia

        System.out.println("Generando contraseña de " + longitud + " caracteres...");

        for (int i = 0; i < longitud; i++) {
            int indiceAleatorio = random.nextInt(poolCaracteres.length());
            char caracterSeleccionado = poolCaracteres.charAt(indiceAleatorio);
            contrasena.append(caracterSeleccionado);
        }
        System.out.println("\n✅ Contraseña Generada: " + contrasena.toString());
        scanner.close();
    }
}
