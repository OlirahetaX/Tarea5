package tarea5;

public class FrutasVerduras {

    private int precio, cantinventariar,tipo;
    private String categoria;

    public FrutasVerduras() {
    }

    public FrutasVerduras(int precio, int cantinventariar, String categoria,int tipo) {
        this.precio = precio;
        this.cantinventariar = cantinventariar;
        this.categoria = categoria;
        this.tipo=tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getcantinventariar() {
        return cantinventariar;
    }

    public void setcantinventariar(int cantinventariar) {
        this.cantinventariar = cantinventariar;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return ") "+"\n   Categoria Fruta/Verdura: " + categoria + "\n"
              +"       Precio: " + precio + "\n"+
               "       Cantidad en inventario: " + cantinventariar + "\n" ;
    }
    

}
