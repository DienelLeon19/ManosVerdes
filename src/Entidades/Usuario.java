    package Entidades;

import java.util.List;

public class Usuario implements Admin,Persona
{
   private String NombreUsuario;
   private String Contraseña;
   private int CodigoUsuario ;
   private String Correo;
   private List<Comentario> coment;
    public Usuario() {
    }

    public Usuario(String NombreUsuario, String Contraseña) {
        this.NombreUsuario = NombreUsuario;
        this.Contraseña = Contraseña;
        
    }

    public void setComent(List<Comentario> coment) {
        this.coment = coment;
    }

    public List<Comentario> getComent() {
        return coment;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public void setCodigoUsuario(int CodigoUsuario) {
        this.CodigoUsuario = CodigoUsuario;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public int getCodigoUsuario() {
        return CodigoUsuario;
    }

    public String getCorreo() {
        return Correo;
    }
    
    public String ObtenerUsuario(String NombreUsuario , String codigoUsuario )
    {
        return this.NombreUsuario +" | "+this.CodigoUsuario;
    
    }
    
    public String TEXT (String name)
    {
        return name;
    }
    
    
    @Override
    public void ObtenerUser()
    {
        
    
    }
    
    
}
