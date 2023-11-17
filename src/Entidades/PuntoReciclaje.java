    package Entidades;

import java.util.ArrayList;
import java.util.List;

public class PuntoReciclaje {

    public int getId_punto() {
        return id_punto;
    }

    public void setId_punto(int id_punto) {
        this.id_punto = id_punto;
    }
    private int id_punto;
    private String nombrePunto;
    private List<Material> tipo = new ArrayList<>();
    private Ubicacion ubicacion;
    private String horafuncio;

    public PuntoReciclaje() {
    }

    public PuntoReciclaje(String nombrePunto, Ubicacion ubicacion, String horafuncio) {
        this.nombrePunto = nombrePunto;
        this.ubicacion = ubicacion;
        this.horafuncio = horafuncio;      
    }

    public String getNombrePunto() {
        return nombrePunto;
    }

    public void setNombrePunto(String nombrePunto) {
        this.nombrePunto = nombrePunto;
    }

    public List<Material> getTipomaterialreciclar() {
        return tipo;
    }

    public void setTipomaterialreciclar(List<Material> tipomaterialreciclar) {
        this.tipo = tipomaterialreciclar;
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
    
    public void agregarMaterial(Material material) {
        this.tipo.add(material);
    }
    
    public String TEXTO(PuntoReciclaje punto){
        return punto.nombrePunto + " | Ubicacion: "
                + ""+ punto.ubicacion.getDatosUbicacion() + " | Horario Funcionamiento:"
                + ""+punto.horafuncio;
    }
    
    
    
    
}
