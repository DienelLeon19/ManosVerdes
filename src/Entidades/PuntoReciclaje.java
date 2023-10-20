package Entidades;

import java.util.List;


public class PuntoReciclaje {
    
    private String nombrePunto;
    private List<String> tipomaterialreciclar;
    private Ubicacion ubicacion;
    private String horafuncio;

    public PuntoReciclaje(String nombrePunto, List<String> tipomaterialreciclar,
            Ubicacion ubicacion) {
        this.nombrePunto = nombrePunto;
        this.tipomaterialreciclar = tipomaterialreciclar;
        this.ubicacion = ubicacion;
    }

    public String getNombrePunto() {
        return nombrePunto;
    }

    public void setNombrePunto(String nombrePunto) {
        this.nombrePunto = nombrePunto;
    }

    public List<String> getTipomaterialreciclar() {
        return tipomaterialreciclar;
    }

    public void setTipomaterialreciclar(List<String> tipomaterialreciclar) {
        this.tipomaterialreciclar = tipomaterialreciclar;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getHoraFuncio() {
        return horafuncio;
    }

    public void setHoraFuncio(String horafuncio) {
        this.horafuncio = horafuncio;
    }
    
    
    
    public String getDatosPuntoReciclaje(){
        return this.nombrePunto + " | TipoMaterial: "
                + ""+this.tipomaterialreciclar +" | Ubicacion: "
                + ""+ this.ubicacion + " | Horario Funcionamiento:"
                + ""+this.horafuncio;
    }
}
