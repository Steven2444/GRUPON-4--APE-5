import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
        BufferedWriter bw = null;

        try {
            // 1. Flujo de salida con BufferedWriter enlazado a FileWriter
            bw = new BufferedWriter(new FileWriter("materias.txt"));

            // 2 y 3. Cinco asignaturas, una por línea
            bw.write("Algoritmos y Lógica de Programación");
            bw.newLine();
            bw.write("Cálculo Diferencial");
            bw.newLine();
            bw.write("Programación Orientada a Objetos");
            bw.newLine();
            bw.write("Física");
            bw.newLine();
            bw.write("Matemática Discreta");
            bw.newLine();

            System.out.println("Archivo materias.txt generado correctamente.");
        } catch (IOException e) {
            System.out.println("Error de escritura: " + e.getMessage());
        } finally {
            // 4. Liberar recursos
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el flujo: " + e.getMessage());
            }
        }
    }
}
