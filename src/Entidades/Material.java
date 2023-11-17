    package Entidades;

public class Material 
{
    private String Nombre;
    private String Detalle;

    public Material() {
    }

    public Material(String Nombre, String Detalle) {
        this.Nombre = Nombre;
        this.Detalle = Detalle;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }
    
    
    public String Texto()
    {
        return this.Nombre+" | Detalle: "+this.Detalle;
    }
    
    
    
    
}
