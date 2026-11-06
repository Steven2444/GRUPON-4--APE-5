import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("estudiantes.txt"));

            for (int i = 1; i <= 3; i++) {
                System.out.print("Nombre del estudiante " + i + ": ");
                String nombre = sc.nextLine();

                System.out.print("Calificación de " + nombre + ": ");
                String calificacion = sc.nextLine();

                bw.write(nombre);          // línea 1: nombre
                bw.newLine();
                bw.write(calificacion);    // línea 2: calificación
                bw.newLine();
            }

            bw.close();
            System.out.println("Información guardada correctamente en estudiantes.txt");

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

        sc.close();
    }
}
