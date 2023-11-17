package Entidades;

public class Comentario
{
    private String Porque;
    private String Comenta;
    private String Recomienda;

    public Comentario() {
    }

    public Comentario(String Porque, String Comenta, String Recomienda) {
        this.Porque = Porque;
        this.Comenta = Comenta;
        this.Recomienda = Recomienda;
    }

    public void setPorque(String Porque) {
        this.Porque = Porque;
    }

    public void setComenta(String Comenta) {
        this.Comenta = Comenta;
    }

    public void setRecomienda(String Recomienda) {
        this.Recomienda = Recomienda;
    }

    public String getPorque() {
        return Porque;
    }

    public String getComenta() {
        return Comenta;
    }

    public String getRecomienda() {
        return Recomienda;
    }
    
    
    
    
    
}
