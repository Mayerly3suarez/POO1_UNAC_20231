package co.edu.unac.poo1.unidad2.aerolinea;

import java.time.LocalTime;
import java.util.*;

public class Tiquete {
    private String id;
    private Float precio;
    private Ruta ruta;
    private LocalTime fechaVuelo;
    private TipoDePuesto claseDeVuelo;
    private String puesto;

    public Tiquete() {
    }

    public Tiquete(String id, Float precio, Ruta ruta, LocalTime fechaVuelo, TipoDePuesto claseDeVuelo, String puesto) {
        this.id = id;
        this.precio = precio;
        this.ruta = ruta;
        this.fechaVuelo = fechaVuelo;
        this.claseDeVuelo = claseDeVuelo;
        this.puesto = puesto;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public LocalTime getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(LocalTime fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public TipoDePuesto getClaseDeVuelo() {
        return claseDeVuelo;
    }

    public void setClaseDeVuelo(TipoDePuesto claseDeVuelo) {
        this.claseDeVuelo = claseDeVuelo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
