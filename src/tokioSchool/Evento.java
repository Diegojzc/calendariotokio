package tokioSchool;

import java.time.LocalDateTime;

import static tokioSchool.util.Constantes.HORAALERTA;
import static tokioSchool.util.Constantes.TIPOALERTA;

public class Evento {

   private String nombre;
   private String descripcion;
   private String lugar;
   private LocalDateTime fecha;
   private boolean tienealerta;
   private String tipoalerta;
   private int horaalerta;

    private Usuario propietario;

    public Evento(String nombre, String descripcion, String lugar, LocalDateTime fecha, Usuario propietario){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.lugar = lugar;
        this.fecha = fecha;
        this.propietario = propietario;
        this.tienealerta = false;

    }

    public Evento(String nombre, String descripcion, String lugar, LocalDateTime fecha, boolean tienealerta, Usuario propietario){
        this(nombre, descripcion,lugar,fecha,propietario);
        this.tienealerta = tienealerta;
        if(tienealerta) {
            this.tipoalerta = TIPOALERTA;
            this.horaalerta = HORAALERTA;
        }

    }
    public Evento(String nombre, String descripcion, String lugar){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.lugar = lugar;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getTipoalerta() {
        return tipoalerta;
    }

    public void setTipoalerta(String tipoalerta) {
        this.tipoalerta = tipoalerta;
    }

    public int getHoraalerta() {
        return horaalerta;
    }

    public void setHoraalerta(int horaalerta) {
        this.horaalerta = horaalerta;
    }
    public boolean isTienealerta(){
        return tienealerta;
    }
    public void borrarAlerta(){
        tienealerta = false;
        tipoalerta = null;
        horaalerta =0;
    }
    public boolean esTiempopAlerta() {
        return  LocalDateTime.now().equals(fecha);

    }

    @Override
    public String toString() {
        return "Evento{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", lugar='" + lugar + '\'' +
                '}';
    }
}

