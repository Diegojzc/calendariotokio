package tokioSchool;

import java.util.Arrays;
import java.util.Objects;

import static tokioSchool.util.Constantes.cantidadInicial;
import static tokioSchool.util.Constantes.cantidadInicial;

public class Usuario {

    private String nombre;
    private String contrasena;
    private String email;
    private String telefono;
    private String direccion;
    private String tipo;

    private  Contacto[]contactos;
    private Evento []eventos;
    private Tarea [] tareas;

    Usuario(String nombre, String contrasena, String email, String tipo){
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.email = email;
        this.tipo = tipo;

        contactos = new Contacto[cantidadInicial];
        eventos = new Evento[cantidadInicial];
        tareas = new Tarea[cantidadInicial];
    }

    public Usuario(String nombre, String contrasena, String email, String telefono, String direccion, String tipo, Contacto[] contactos, Evento[] eventos, Tarea[] tareas) {
        this(nombre,contrasena,email,tipo);
        this.telefono = telefono;
        this.direccion = direccion;
        this.contactos = contactos;
        this.eventos = eventos;
        this.tareas = tareas;
    }
    public Usuario(String nombre, String contrasena){
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public Contacto[] getContactos() {
        return contactos;
    }

    public Evento[] getEventos() {
        return eventos;
    }

    public Tarea[] getTareas() {
        return tareas;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;

    }
    public void anadirContacto(Contacto contacto){

    }
    public void anadirEvento(Evento evento){

    }
    public void anadirTarea(Tarea tarea){

    }
    public void borrarContacto(Contacto contacto){

    }
    public void borrarEvento(Evento evento){

    }
    public void borrarTarea(Tarea tarea){

    }
    public void modificarContrasena(String contrasena){

    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", tipo='" + tipo + '\'' +
                ", contactos=" + Arrays.toString(contactos) +
                ", eventos=" + Arrays.toString(eventos) +
                ", tareas=" + Arrays.toString(tareas) +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null)
            return false;
        if (!(object instanceof Usuario))
            return false;
        Usuario usuario = (Usuario) object;
        return usuario.getNombre().equals(nombre);


    }


    @Override
    public int hashCode() {

        return nombre.hashCode();
    }
}
