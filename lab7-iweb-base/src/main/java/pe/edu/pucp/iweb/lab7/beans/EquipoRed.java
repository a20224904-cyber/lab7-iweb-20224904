package pe.edu.pucp.iweb.lab7.beans;

/**
 * Equipo de red de la tabla equipo.
 *
 * Ejercicio 2b:
 *  - Esta clase debe ser ABSTRACTA.
 *  - Debe declarar el método abstracto calcularSoporteMensual(), que retorna un double.
 *
 * Los atributos, getters y setters ya están hechos.
 */
public abstract class EquipoRed<T> { // TODO 2b: convertir en clase abstracta

    private int idEquipo;
    private String modelo;
    private String tipo;      // 'SWITCH' o 'AP' (solo para mostrarlo en la tabla)
    private double precio;
    private int cantidad;
    private Sede sede;

    // TODO 2b: declarar aquí el método abstracto calcularSoporteMensual()
    public abstract double calcularSoporteMensual(double precio, double cantidad);

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
}
