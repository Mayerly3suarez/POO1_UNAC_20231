package co.edu.unac.poo1.unidad2.aerolinea;

public class PasajeroMenorDeEdad {
    private String nombre;
    private String apellidos;
    private String fecha_de_Nacimiento;
    private Integer telefonoAcudiente;
    private Integer tarjetaIdentidad;

    public PasajeroMenorDeEdad(){
    }
    public PasajeroMenorDeEdad(String nombre, String apellidos, String fecha_de_Nacimiento, Integer telefonoAcudiente, Integer tarjetaIdentidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_de_Nacimiento = fecha_de_Nacimiento;
        this.telefonoAcudiente = telefonoAcudiente;
        this.tarjetaIdentidad = tarjetaIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFecha_de_Nacimiento() {
        return fecha_de_Nacimiento;
    }

    public void setFecha_de_Nacimiento(String fecha_de_Nacimiento) {
        this.fecha_de_Nacimiento = fecha_de_Nacimiento;
    }

    public Integer getTelefonoAcudiente() {
        return telefonoAcudiente;
    }

    public void setTelefonoAcudiente(Integer telefonoAcudiente) {
        this.telefonoAcudiente = telefonoAcudiente;
    }

    public Integer getTarjetaIdentidad() {
        return tarjetaIdentidad;
    }

    public void setTarjetaIdentidad(Integer tarjetaIdentidad) {
        this.tarjetaIdentidad = tarjetaIdentidad;
    }

}
