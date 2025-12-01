import java.util.Scanner;

public class Ejercicio7 {
    public static void CalculadoraPromedios() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---✅ Calcular aprobacion 🏛️ ---");
        System.out.println("Cuantas calificaciones va ingresar? ");
        double calificaciones = scanner.nextDouble();
        double totalCalificaciones = 0;

        for (int i = 0; i < calificaciones; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + " de " + calificaciones + " :" );
            totalCalificaciones += scanner.nextDouble();
            scanner.nextLine();
        }
        double promedioCalificaciones = totalCalificaciones/calificaciones;
        System.out.println("El promedio de las calificacioens es: " + promedioCalificaciones);
        if (promedioCalificaciones >7.9 ) {
            System.out.println("El resultado de las calificaciones es:  Excelente");
        } else if (promedioCalificaciones > 5.9) {
            System.out.println("El resultado de las calificaciones es:  Aprobado");
        } else {
            System.out.println("El resultado de las calificaciones es:  Reprobado");
        }
    }
}
