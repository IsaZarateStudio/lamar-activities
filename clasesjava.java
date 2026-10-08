public class Producto {
    // Atributos privados (Encapsulamiento)
    private int idProd;
    private String nombre;
    private double precio;

    // Constructor
    public Producto(int idProd, String nombre, double precio) {
        this.idProd = idProd;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Métodos getter 
    public String getNombre() {
        // Aquí podemos acceder al valor porque estamos dentro de la clase
        return this.nombre;
    }

    public void guardarEnBaseDeDatos() {
        // Acá hay que poner la lógica de cómo guardar en base de datos.
    }

}
