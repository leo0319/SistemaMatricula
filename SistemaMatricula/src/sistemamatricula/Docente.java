public class Docente {
    private String nombre;
    private String codigo;
    private String especialidad;

    // Constructor
    public Docente(String nombre, String codigo, String especialidad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.especialidad = especialidad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Método toString para imprimir el objeto de manera más legible
    @Override
    public String toString() {
        return "Docente [nombre=" + nombre + ", codigo=" + codigo + ", especialidad=" + especialidad + "]";
    }
}
