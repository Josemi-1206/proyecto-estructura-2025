package sistemaVideojuegos;

public class Personaje {
    private String nombre;
    private int maxSalud;
    private String habilidadDefinitiva;

    public Personaje(String nombre, String habilidadDefinitiva, int salud) {
        this.nombre = nombre;
        this.habilidadDefinitiva = habilidadDefinitiva;
        this.maxSalud = salud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabilidadDefinitiva() {
        return habilidadDefinitiva;
    }

    public void setHabilidadDefinitiva(String habilidadDefinitiva) {
        this.habilidadDefinitiva = habilidadDefinitiva;
    }

    public int getMaxSalud() {
        return maxSalud;
    }

    public void setMaxSalud(int salud) {
        this.maxSalud = salud;
    }

    public void detallesPersonaje(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Habilidad Definitiva: " + habilidadDefinitiva);
        System.out.println("Salud máxima: " + maxSalud);
    }
}
