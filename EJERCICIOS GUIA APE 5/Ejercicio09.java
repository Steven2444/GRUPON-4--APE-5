import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {
    public static void main(String[] args) {
        BufferedWriter bw = null;

        try {
          
            bw = new BufferedWriter(new FileWriter("materias.txt", true));

            
            bw.write("Estadística");
            bw.newLine();
            bw.write("Base de Datos");
            bw.newLine();

            System.out.println("Asignaturas añadidas correctamente.");
        } catch (IOException e) {
            System.out.println("Error de escritura: " + e.getMessage());
        } finally {
           
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
