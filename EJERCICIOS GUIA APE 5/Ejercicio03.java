import java.io.File;

public class EliminarFichero {

    public static void main(String[] args) {
        // Objeto File con el nombre del archivo a eliminar
        File archivo = new File("estudiantes.txt");

        // Intentar eliminar el archivo
        if (archivo.delete()) {
            System.out.println("El archivo " + archivo.getName() + " se eliminó correctamente.");
        } else {
            System.out.println("No se pudo eliminar el archivo. Puede que no exista o esté en uso.");
        }
    }
}
