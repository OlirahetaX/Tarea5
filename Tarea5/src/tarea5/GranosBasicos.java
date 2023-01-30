package tarea5;

public class GranosBasicos {

    private int cantquin,precio;
    private String nombre,unimedida,procedencia;

    public GranosBasicos() {
    }

    public GranosBasicos(int cantquin, int precio, String nombre, String unimedida, String procedencia) {
        this.cantquin = cantquin;
        this.precio = precio;
        this.nombre = nombre;
        this.unimedida = unimedida;
        this.procedencia = procedencia;
    }

    public int getCantquin() {
        return cantquin;
    }

    public void setCantquin(int cantquin) {
        this.cantquin = cantquin;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnimedida() {
        return unimedida;
    }

    public void setUnimedida(String unimedida) {
        this.unimedida = unimedida;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    @Override
    public String toString() {
        return ") "+"\n   Nombre del producto: "+this.nombre+"\n"
                + "       Precio: "+this.precio+"\n"
                + "       Cantidad en quintales: "+this.cantquin+"\n"
                + "       Unidad de medida: "+this.unimedida+"\n"
                + "       Procedencia: "+this.procedencia+"\n";    
    }
    
    
}
