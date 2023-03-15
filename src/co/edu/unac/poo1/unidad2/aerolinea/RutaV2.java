package co.edu.unac.poo1.unidad2.aerolinea;

public class RutaV2 {

    private String origen;
    private String destino;
    private String fecha_apertura_de_ruta;

    public RutaV2(){

    }
    public RutaV2(String origen, String destino, String apertura_de_ruta) {
        this.origen = origen;
        this.destino = destino;
        this.fecha_apertura_de_ruta = apertura_de_ruta;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getApertura_de_ruta() {
        return fecha_apertura_de_ruta;
    }

}

