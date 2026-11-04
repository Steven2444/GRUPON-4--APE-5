import java.io.File;
import java.io.IOException;

public class CrearFichero {

    public static void main(String[] args) {
        // Crear un objeto de tipo File
        File archivo = new File("curso.txt");

        try {
            // Crear el archivo y comprobar si se creó o ya existía
            if (archivo.createNewFile()) {
                System.out.println("El archivo se creó correctamente.");
            } else {
                System.out.println("El archivo ya existe.");
            }

            // Mostrar el nombre del archivo
            System.out.println("Nombre del archivo: " + archivo.getName());

        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo.");
            e.printStackTrace();
        }
    }
}
