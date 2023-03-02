package co.edu.unac.poo1.unidad2.aerolinea;

public class Ruta {
    private String origen;
    private String destino;

    public Ruta(){
    }

    public Ruta(String origen, String destino){
        this.origen = origen;
        this.destino = destino;
    }

    public String getOrigen(){
        return this.origen;
    }

    public void setOrigen(String origen){
        this.origen = origen;
    }

    public String getDestino(){
        return this.destino;
    }

    public void setDestino(String destino){
        this.destino = destino;
    }
}
