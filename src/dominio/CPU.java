package dominio;

public class CPU {

    private String marca;
    private String generacion;
    private String nucleos;
    private String socket;
    private String arquitectura;
    private String cache;
    private String velocidad;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getGeneracion() {
        return generacion;
    }

    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

    public String getNucleos() {
        return nucleos;
    }

    public void setNucleos(String nucleos) {
        this.nucleos = nucleos;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getArquitectura() {
        return arquitectura;
    }

    public void setArquitectura(String arquitectura) {
        this.arquitectura = arquitectura;
    }

    public String getCache() {
        return cache;
    }

    public void setCache(String cache) {
        this.cache = cache;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }
}
