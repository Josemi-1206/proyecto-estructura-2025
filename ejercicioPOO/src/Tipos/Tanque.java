package Tipos;

import sistemaVideojuegos.Personaje;

public class Tanque extends Personaje {
    private String escudoPrincipal;
    private int vidaEscudo;
    private String estiloTanque;

    public Tanque(String nombre, String habilidadDefinitiva, int salud, String escudoPrincipal, int vidaEscudo, String estiloTanque) {
        super(nombre, habilidadDefinitiva, salud);
        this.escudoPrincipal = escudoPrincipal;
        this.vidaEscudo = vidaEscudo;
        this.estiloTanque = estiloTanque;
    }

    public String getEscudoPrincipal() {
        return escudoPrincipal;
    }

    public void setEscudoPrincipal(String escudoPrincipal) {
        this.escudoPrincipal = escudoPrincipal;
    }

    public int getVidaEscudo() {
        return vidaEscudo;
    }

    public void setVidaEscudo(int vidaEscudo) {
        this.vidaEscudo = vidaEscudo;
    }

    public String getEstiloTanque() {
        return estiloTanque;
    }

    public void setEstiloTanque(String estiloTanque) {
        this.estiloTanque = estiloTanque;
    }

    @Override
    public void detallesPersonaje(){
        super.detallesPersonaje();
        System.out.println("Forma del escudo usado por el tanque: " +escudoPrincipal);
        System.out.println("Protección total del escudo: " +vidaEscudo);
        System.out.println("Determine el estilo de juego del tanque (Protección o Ataque): " + estiloTanque);
    }
}
