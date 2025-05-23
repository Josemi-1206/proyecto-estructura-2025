package Tipos;

import sistemaVideojuegos.Personaje;

public class Duelista extends Personaje {
    private String armaPrincipal;
    private String tipoAtaque;

    public Duelista(String nombre, String habilidadDefinitiva, int salud, String armaPrincipal, String tipoAtaque) {
        super(nombre, habilidadDefinitiva, salud);
        this.armaPrincipal = armaPrincipal;
        this.tipoAtaque = tipoAtaque;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public String getTipoAtaque() {
        return tipoAtaque;
    }

    public void setTipoAtaque(String tipoAtaque) {
        this.tipoAtaque = tipoAtaque;
    }

    @Override
    public void detallesPersonaje(){
        super.detallesPersonaje();
        System.out.println("El arma principal del duelista: " + armaPrincipal);
        System.out.println("Tipo de ataque del duelista: " + tipoAtaque);
    }
}
