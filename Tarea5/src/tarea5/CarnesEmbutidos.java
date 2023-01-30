package tarea5;

public class CarnesEmbutidos {

    private String procedencia, tipo;
    private int cantinventario, precio;

    public CarnesEmbutidos() {
    }

    public CarnesEmbutidos(String procedencia, String tipo, int cantinventario, int precio) {
        this.procedencia = procedencia;
        this.tipo = tipo;
        this.cantinventario = cantinventario;
        this.precio = precio;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantinventario() {
        return cantinventario;
    }

    public void setCantinventario(int cantinventario) {
        this.cantinventario = cantinventario;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return ") "+"\n   Tipo Carne: " + tipo +"\n"+
               "       Procedencia: " + procedencia +"\n"+
               "       Cantidad en inventario: " + cantinventario +"\n"+
               "       Precio: " + precio + "\n";
    }
    
}
