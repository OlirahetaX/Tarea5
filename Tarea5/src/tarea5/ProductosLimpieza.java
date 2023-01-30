package tarea5;

public class ProductosLimpieza {

    private String tipo, marca, codigo, proveedor, nombre;
    private int precio, cantinventario;

    public ProductosLimpieza() {
    }

    public ProductosLimpieza(String tipo, String marca, String codigo, String proveedor, String nombre, int precio, int cantinventario) {
        this.tipo = tipo;
        this.marca = marca;
        this.codigo = codigo;
        this.proveedor = proveedor;
        this.nombre = nombre;
        this.precio = precio;
        this.cantinventario = cantinventario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
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

    public int getCantinventario() {
        return cantinventario;
    }

    public void setCantinventario(int cantinventario) {
        this.cantinventario = cantinventario;
    }

    @Override
    public String toString() {
        return ") "+"\n   Nombre del producto: " + nombre + "\n"
                + "       Tipo: " + tipo + "\n"
                + "       Marca: " + marca + "\n"
                + "       Codigo: " + codigo + "\n"
                + "       Proveedor: " + proveedor + "\n"
                + "       Precio: " + precio + "\n"
                + "       Cantidad en inventario: " + cantinventario+"\n";
    }

}
