package dominio;

public class PlacaBase {

    private String marca;
    private String socket;
    private String puertosPCI;
    private String puertosPCIe;
    private String puertosSATA;
    private String memoriaSoportada;
    private String dimensiones;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getPuertosPCI() {
        return puertosPCI;
    }

    public void setPuertosPCI(String puertosPCI) {
        this.puertosPCI = puertosPCI;
    }

    public String getPuertosPCIe() {
        return puertosPCIe;
    }

    public void setPuertosPCIe(String puertosPCIe) {
        this.puertosPCIe = puertosPCIe;
    }

    public String getPuertosSATA() {
        return puertosSATA;
    }

    public void setPuertosSATA(String puertosSATA) {
        this.puertosSATA = puertosSATA;
    }

    public String getMemoriaSoportada() {
        return memoriaSoportada;
    }

    public void setMemoriaSoportada(String memoriaSoportada) {
        this.memoriaSoportada = memoriaSoportada;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }
}
