    package Entidades;
    
public class Ubicacion {
    
    private String departamento;
    private String distrito;
    private String direccion;
    private String referencia;

    public Ubicacion(String departamento, String distrito, String direccion) {
        this.departamento = departamento;
        this.distrito = distrito;
        this.direccion = direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
    public String getDatosUbicacion(){
        return this.departamento + " | Distrito: "+this.distrito +" "
                + "| Direccion: "+ this.direccion + " | Referencia:"
                + " "+this.referencia;
    }
}
