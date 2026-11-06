import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroVentas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double acumulado = 0;

        try {
            // true = modo append (conserva las ventas anteriores)
            BufferedWriter bw = new BufferedWriter(new FileWriter("ventas.txt", true));

            while (true) {
                System.out.print("Nombre del producto (o escriba 'fin' para terminar): ");
                String nombre = sc.nextLine();

                if (nombre.equalsIgnoreCase("fin")) {
                    break;
                }

                System.out.print("Precio: ");
                double precio = sc.nextDouble();

                System.out.print("Cantidad vendida: ");
                int cantidad = sc.nextInt();
                sc.nextLine(); // limpia el salto de línea pendiente

                double subtotal = precio * cantidad;
                double totalPagar = subtotal;

                if (subtotal >= 100) {
                    totalPagar = subtotal - (subtotal * 0.10); // descuento del 10%
                    System.out.println("Se aplicó un descuento del 10%.");
                }

                System.out.println("Total a pagar: $" + totalPagar);
                acumulado += totalPagar;

                bw.write("Producto: " + nombre
                        + " | Precio: $" + precio
                        + " | Cantidad: " + cantidad
                        + " | Subtotal: $" + subtotal
                        + " | Total a pagar: $" + totalPagar);
                bw.newLine();
            }

            bw.write("TOTAL ACUMULADO DE VENTAS: $" + acumulado);
            bw.newLine();
            bw.write("--------------------");
            bw.newLine();

            bw.close();
            System.out.println("Ventas guardadas. Total acumulado: $" + acumulado);

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

        sc.close();
    }
}
