package co.edu.unac.poo1.unidad2;

import co.edu.unac.poo1.unidad2.aerolinea.Ruta;
import co.edu.unac.poo1.unidad2.aerolinea.TipoDePuesto;
import co.edu.unac.poo1.unidad2.aerolinea.Tiquete;

import java.time.LocalTime;
import java.util.UUID;

public class Unidad2 {

    /*Ejemplo: Crear un tiquete usando una de las rutas seleccionadas y retornarlo,
    para luego imprimirlo con el mensaje, "El Tiquete es desde <origen> hacia <destino>,
    a las <fecha vuelo>, en <tipo de vuelo>, en el puesto <puesto> y con un precio
    de COP $<precio>"
     */
    private static Tiquete crearInstanciaTiquete(){
        Ruta rutaMedToBerlin = new Ruta("Medellin", "Berlin");
        Tiquete tiqueteNuevo = new Tiquete();
        tiqueteNuevo.setId(String.valueOf(UUID.randomUUID()));
        tiqueteNuevo.setPrecio(3850000F);
        tiqueteNuevo.setRuta(rutaMedToBerlin);
        tiqueteNuevo.setFechaVuelo(LocalTime.parse("15:30"));
        tiqueteNuevo.setClaseDeVuelo(TipoDePuesto.CLASE_EJECUTIVA);
        tiqueteNuevo.setPuesto("14C");
        return tiqueteNuevo;
    }

    public static void mostrarTiqueteV1(){
        Tiquete tiqueteActual = crearInstanciaTiquete();
        System.out.print("El Tiquete es desde " + tiqueteActual.getRuta().getOrigen());
        System.out.print(" hacia " + tiqueteActual.getRuta().getDestino());
        System.out.print(", a las " + tiqueteActual.getFechaVuelo());
        System.out.print(" en " + tiqueteActual.getClaseDeVuelo());
        System.out.print(", en el puesto " + tiqueteActual.getPuesto());
        System.out.print("\ny con un precio de COP $" + tiqueteActual.getPrecio()+"\n");
        System.out.println("ID: "+tiqueteActual.getId());
        System.out.println("-----------------------------------------------------");
    }




}
