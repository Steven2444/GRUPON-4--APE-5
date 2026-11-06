import java.io.File;
import java.io.IOException;

public class Ejercicio4 {
    public static void main(String[] args) {
       
        File archivo = new File("datos/temporal.txt");

       
        if (!archivo.exists()) {
            try {
                boolean creado = archivo.createNewFile();
                System.out.println("¿Archivo creado?: " + creado);
            } catch (IOException e) {
                System.out.println("Error de E/S al crear el archivo: " + e.getMessage());
            }
        } else {
            System.out.println("El archivo ya existe.");
        }

        
        boolean confirmarBorrado = true;

       
        if (confirmarBorrado) {
            boolean eliminado = archivo.delete();
            System.out.println("Resultado de la eliminación: " + eliminado);
        } else {
            System.out.println("Borrado cancelado por el usuario.");
        }
    }
}
