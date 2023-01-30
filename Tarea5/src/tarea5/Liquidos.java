
package tarea5;

import java.util.Date;


public class Liquidos {
    private String categoria,empaque,tamanio,nombre;
    private int precio;
    private Date fechavencimiento;

    public Liquidos() {
    }

    public Liquidos(String categoria, String empaque, String tamanio, String nombre, int precio, Date fechavencimiento) {
        this.categoria = categoria;
        this.empaque = empaque;
        this.tamanio = tamanio;
        this.nombre = nombre;
        this.precio = precio;
        this.fechavencimiento = fechavencimiento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEmapque() {
        return empaque;
    }

    public void setEmapque(String emapque) {
        this.empaque = emapque;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Date getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(Date fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    @Override
    public String toString() {
        return ") "+"\n   Nombre del producto: " + nombre +"\n"+
                "       Categoria: " + categoria +"\n"+
                "       Empaque: "  + empaque +"\n"+
                "       Tamanio: " + tamanio +"\n"+
                "       Precio: " + precio +"\n"+
                "       Fechavencimiento: " + fechavencimiento +"\n";
    }
    
    
}
