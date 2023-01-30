package tarea5;

public class Factura {

    private int precio, cantidad, tot;
    private String name;

    public Factura() {
    }

    public Factura(int precio, int cantidad, String name) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.tot = this.precio * this.cantidad;
        this.name = name;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTot() {
        return tot;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String espacios(){
        int le=this.name.length();
        String x="";
        for (int i = 25; i > le ; i--) {
            x+=" ";
        }
        return x;
    }
    @Override
    public String toString() {
        String x=espacios();
        
        return name + x + precio + "                    " + cantidad + "               " + tot;
    } 

}
