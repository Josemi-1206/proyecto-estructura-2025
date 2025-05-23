package main;

import Tipos.Duelista;
import Tipos.Soporte;
import Tipos.Tanque;

public class Main {
    public static void main(String[] args) {
        Duelista duelista1 = new Duelista("Genji","Hoja del dragón", 900, "Katana", "Violento");
        Tanque tanque1 = new Tanque("Malphite", "Fuerza Imparable", 2000, "Escudo de Granito", 500, "Protector");
        Soporte soporte1 = new Soporte("Sage", "Reanimación", 750, "Protectora", "Cura propia o compartida", "Salud", 5);

        System.out.println("Detalles de los personajes: ");
        System.out.println("Información Duelista: ");
        duelista1.detallesPersonaje();
        System.out.println("-----------------------------");
        System.out.println("Información Tanque: ");
        tanque1.detallesPersonaje();
        System.out.println("-----------------------------");
        System.out.println("Información Soporte: ");
        soporte1.detallesPersonaje();

    }
}
