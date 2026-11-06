import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroProductos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
          
            BufferedWriter bw = new BufferedWriter(new FileWriter("productos.txt", true));

            System.out.print("Nombre del producto: ");
            String nombre = sc.nextLine();

            System.out.print("Precio: ");
            double precio = sc.nextDouble();

            System.out.print("Cantidad disponible: ");
            int cantidad = sc.nextInt();

            double total = precio * cantidad;

            bw.write("Producto: " + nombre);
            bw.newLine();
            bw.write("Precio: $" + precio);
            bw.newLine();
            bw.write("Cantidad: " + cantidad);
            bw.newLine();
            bw.write("Valor total: $" + total);
            bw.newLine();
            bw.write("--------------------");
            bw.newLine();

            bw.close();
            System.out.println("Producto registrado correctamente. Valor total: $" + total);

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

        sc.close();
    }
}
