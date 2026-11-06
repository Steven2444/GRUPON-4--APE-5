import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirFichero {

    public static void main(String[] args) {
        // Objeto Scanner para leer del teclado
        Scanner sc = new Scanner(System.in);

        // Solicitar el mensaje al usuario
        System.out.print("Escribe un mensaje: ");
        String mensaje = sc.nextLine();

        try {
            // true = conserva lo anterior y agrega al final
            FileWriter escritor = new FileWriter("estudiantes.txt", true);

            // Guardar el mensaje (con salto de línea)
            escritor.write(mensaje + "\n");

            // Cerrar el archivo
            escritor.close();

            System.out.println("La información se guardó correctamente.");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        }

        sc.close();
    }
}
