package co.edu.unac.poo1.unidad2.aerolinea;

public class Escala {
    private String ciudad;
    private String aeropuerto;
    private Long duracion;

    public Escala() {
    }

    public Escala(String ciudad, String aeropuerto, Long duracion) {
        this.ciudad = ciudad;
        this.aeropuerto = aeropuerto;
        this.duracion = duracion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(String aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public Long getDuracion() {
        return duracion;
    }

    public void setDuracion(Long duracion) {
        this.duracion = duracion;
    }
}