package dominio;

public class Almacenamiento {

    private String marca;
    private String tipo;
    private String capacidad;
    private String velocidadLectura;
    private String velocidadEscritura;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getVelocidadLectura() {
        return velocidadLectura;
    }

    public void setVelocidadLectura(String velocidadLectura) {
        this.velocidadLectura = velocidadLectura;
    }

    public String getVelocidadEscritura() {
        return velocidadEscritura;
    }

    public void setVelocidadEscritura(String velocidadEscritura) {
        this.velocidadEscritura = velocidadEscritura;
    }

}