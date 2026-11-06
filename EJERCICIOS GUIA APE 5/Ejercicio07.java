import java.io.File;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) {
        File archivo = new File("datos/prueba.txt");

        // 1. Comprobación previa
        if (archivo.exists()) {
            System.out.println("El archivo ya existe.");
        } else {
            // 2. Creación controlada
            try {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado correctamente.");
                }
            } catch (IOException e) {
                System.out.println("Error de E/S al crear el archivo: " + e.getMessage());
            }
        }

        // 3. Extracción de información
        System.out.println("Nombre: " + archivo.getName());
        System.out.println("Ruta: " + archivo.getPath());
    }
}
