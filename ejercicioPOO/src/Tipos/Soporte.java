package Tipos;

import sistemaVideojuegos.Personaje;

public class Soporte extends Personaje {
    private String tipoSoporte;
    private String estiloCura;
    private String tipoCuracion;
    private int duracionCura;

    public Soporte(String nombre, String habilidadDefinitiva, int salud, String tipoSoporte, String estiloCura, String tipoCuracion, int duracionCura) {
        super(nombre, habilidadDefinitiva, salud);
        this.tipoSoporte = tipoSoporte;
        this.estiloCura = estiloCura;
        this.tipoCuracion = tipoCuracion;
        this.duracionCura = duracionCura;
    }

    public String getTipoSoporte() {
        return tipoSoporte;
    }

    public void setTipoSoporte(String tipoSoporte) {
        this.tipoSoporte = tipoSoporte;
    }

    public String getEstiloCura() {
        return estiloCura;
    }

    public void setEstiloCura(String estiloCura) {
        this.estiloCura = estiloCura;
    }

    public String getTipoCuracion() {
        return tipoCuracion;
    }

    public void setTipoCuracion(String tipoCuracion) {
        this.tipoCuracion = tipoCuracion;
    }

    public int getDuracionCura() {
        return duracionCura;
    }

    public void setDuracionCura(int duracionCura) {
        this.duracionCura = duracionCura;
    }

    @Override
    public void detallesPersonaje(){
        super.detallesPersonaje();
        System.out.println("Tipo de soporte (Protector o Agresivo): " +tipoSoporte);
        System.out.println("Estilo de curación del soporte: " +estiloCura);
        System.out.println("Tipo de curación (Escudo o salud): " +tipoCuracion);
        System.out.println("Duración curación en segundos: " +duracionCura);
    }
}
