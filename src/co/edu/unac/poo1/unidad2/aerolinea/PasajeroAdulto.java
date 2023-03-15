package co.edu.unac.poo1.unidad2.aerolinea;

public class PasajeroAdulto {
    private String nombre;
    private String apellidos;
    private String Fecha_de_Nacimiento;
    private Integer telefono;
    private Integer cedula;

    public PasajeroAdulto() {
    }
    public PasajeroAdulto(String nombre,String apellidos,String Fecha_de_Nacimiento,Integer telefono,Integer cedula){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.Fecha_de_Nacimiento = Fecha_de_Nacimiento;
        this.telefono = telefono;
        this.cedula = cedula;
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
        return Fecha_de_Nacimiento;
    }

    public void setFecha_de_Nacimiento(String fecha_de_Nacimiento) {
        this.Fecha_de_Nacimiento = fecha_de_Nacimiento;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }
}






