    package Entidades;

public class Persona
{
    private String Nombre;
    private String Codigo;
    public Persona(String nombre, String codigo) 
    {
        this.Nombre = nombre;
        this.Codigo = codigo;}
    public Persona(){}
    
    public String getNombre()
    {   return Nombre;}

    public String getCodigo() {
        return Codigo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    
    public String TEXT(String name)
    {
        return  "Usuario: "+this.Nombre ;
    }
    
    
    
    
}
