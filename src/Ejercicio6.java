import java.util.Scanner;

public class Ejercicio6 {
    public static void ControlAsistenciaClase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---✅ Control Asistencia en clase 🏛️ ---");
        System.out.println("Escribra  cuantos estudiantes hay en total: ");
        int estudiantesTotal = scanner.nextInt();
        StringBuilder estudiantesPresentes = new StringBuilder();
        StringBuilder estudiantesAusuentes = new StringBuilder();

        for (int i = 0; i < estudiantesTotal; i++) {
            String estudiante = "";
            System.out.println("Escriba el nombre del estudiante: ");
            estudiante = scanner.next();
            System.out.println("El estudiante " + estudiante + " esta presente? (si/no)");
            String presente = scanner.next();
            if(presente.equals("si")){
                estudiantesPresentes.append(estudiante + ": presente ✅ \n");
            } else {
                estudiantesAusuentes.append(estudiante + ": ausente ❌ \n");
            }
        }
        System.out.println("Los estudiantes presentes son: ");
        System.out.println(estudiantesPresentes);
        System.out.println("Los estudiantes ausentes son: ");
        System.out.println(estudiantesAusuentes);
    }
}
