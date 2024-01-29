package tokioSchool;

public class Tarea {

    private String nombre;
    private String descripcion;
    private Usuario propietario;

    public Tarea(String nombre, String descripcion, Usuario propietario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.propietario = propietario;

    }
    public Tarea(String nombre,String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion  +
                '}';
    }
}
