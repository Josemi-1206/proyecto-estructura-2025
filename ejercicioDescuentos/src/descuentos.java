import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


public class descuentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> preciosOriginales = new ArrayList<>();
        ArrayList<Double> preciosDescuentos = new ArrayList<>();
        Stack<Double> historialDescuentos = new Stack<>();
        Queue<Double> colaParaDescuento = new LinkedList<>();

        int opcion;

        do {
            System.out.println("-----Bienvenido al sistema de descuentos-----\n" +
                    "1. Ingreso de precios de productos\n" +
                    "2. Aplicar descuentos\n" +
                    "3. Mostrar total de compra\n" +
                    "4. Mostrar promedio total de la compra\n" +
                    "5. Mostrar historial de descuentos\n" +
                    "6. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad de productos: ");
                    int cantidad = scanner.nextInt();

                    if (cantidad <= 0) {
                        System.out.println("Cantidad inválida.");
                        break;
                    }

                    for (int i = 0; i < cantidad; i++) {
                        System.out.print("Ingrese el precio del producto " + (i + 1) + ": ");
                        double precio = scanner.nextDouble();
                        preciosOriginales.add(precio);
                        colaParaDescuento.add(precio);  // Agregamos a la cola para aplicar descuento después
                    }
                    break;

                case 2:
                    if (colaParaDescuento.isEmpty()) {
                        System.out.println("No hay productos en espera para aplicar descuento.");
                        break;
                    }

                    preciosDescuentos.clear();  // Limpiamos descuentos anteriores
                    historialDescuentos.clear();  // Limpiamos historial

                    int i = 1;
                    while (!colaParaDescuento.isEmpty()) {
                        double precio = colaParaDescuento.poll();
                        double descuento = (precio > 100000) ? 0.15 : 0.10;
                        double precioFinal = precio * (1 - descuento);
                        preciosDescuentos.add(precioFinal);
                        historialDescuentos.push(precioFinal);

                        System.out.println("Producto " + i + ":");
                        System.out.println("  Precio original: $" + precio);
                        System.out.println("  Descuento aplicado: " + (int)(descuento * 100) + "%");
                        System.out.println("  Precio con descuento: $" + precioFinal);
                        i++;
                    }
                    break;

                case 3:
                    if (preciosDescuentos.isEmpty()) {
                        System.out.println("Primero debe ingresar los precios y aplicar los descuentos.");
                        break;
                    }

                    double total = 0;
                    for (double precio : preciosDescuentos) {
                        total += precio;
                    }
                    System.out.println("Total de la compra con descuentos: $" + total);
                    break;

                case 4:
                    if (preciosDescuentos.isEmpty()) {
                        System.out.println("Primero debe ingresar los precios y aplicar los descuentos.");
                        break;
                    }

                    double suma = 0;
                    for (double precio : preciosDescuentos) {
                        suma += precio;
                    }
                    double promedio = suma / preciosDescuentos.size();
                    System.out.println("Promedio total de la compra: $" + promedio);
                    break;

                case 5:
                    if (historialDescuentos.isEmpty()) {
                        System.out.println("No hay historial de descuentos.");
                        break;
                    }

                    System.out.println("Historial de descuentos aplicados (último al primero):");
                    Stack<Double> copia = (Stack<Double>) historialDescuentos.clone();
                    while (!copia.isEmpty()) {
                        System.out.println("$" + copia.pop());
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("La opción ingresada no es válida.");
            }

        } while (opcion != 6);
    }
}

