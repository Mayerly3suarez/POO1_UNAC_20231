package co.edu.unac.poo1.unidad2.aerolinea;

public class Pasajero {
    private float presupuesto_$;
    private String nombre;
    private String id;
    private String correo;
    private Integer edad;

    public Pasajero(){
    }

    public Pasajero(float presupuesto_$, String nombre, String id, String correo, Integer edad) {
        this.presupuesto_$ = presupuesto_$;
        this.nombre = nombre;
        this.id = id;
        this.correo = correo;
        this.edad = edad;
    }

    public float getPresupuesto_$() {
        return presupuesto_$;
    }
    public void SetPresupuesto_$(float presupuesto_$) {
        this.presupuesto_$ = presupuesto_$;
    }

    public String getNombre() {
        return nombre;

    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}


