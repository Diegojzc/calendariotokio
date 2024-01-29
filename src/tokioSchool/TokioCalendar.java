package tokioSchool;

import java.util.Scanner;

import static tokioSchool.util.Constantes.cantidadInicial;

public class TokioCalendar {

    private Usuario [] usuarios;
    private Usuario actual;
    private Scanner teclado;
    private boolean salir;
    private int contadorUsuarios;
    private Evento [] eventos;
    private int contadoreventos;
    private Tarea []tareas;
    private int contadorTareas;


    public TokioCalendar(){
        usuarios = new Usuario[cantidadInicial];
        teclado = new Scanner(System.in);
        salir=false;
        this.contadorUsuarios = 0;
        eventos = new Evento[cantidadInicial];
        this.contadoreventos =0;
        tareas = new Tarea[cantidadInicial];
        this.contadorTareas = 0;
    }

    private void menu(){
        if(actual != null){
            System.out.println("Sesion iniciada: " + actual.getNombre());
        }

        System.out.println("TOKIO CALENDARIO");
        System.out.println("1. Iniciar sesion: ");
        System.out.println("2. Registrarse usuario: ");
        System.out.println("3. Añadir evento: ");
        System.out.println("4. Añadir tarea: ");
        System.out.println("5. Ver evento: ");
        System.out.println("6. Ver tarea: ");
        System.out.println("7. Eliminar evento: ");
        System.out.println("8. Eliminar tarea:  ");
        System.out.println("9. Salir ");
        System.out.println("Seleccione opcion: ");
        String respuesta= teclado.nextLine();

        switch (respuesta){
            case "1":
                iniciarSesion();
                break;
            case "2":
                registrarse();
                break;
            case"3":
                if (comprobarUsuario())
                anadirEvento();
                break;
            case"4":

                if (comprobarUsuario())
                anadirTareas();
                break;
            case"5":
                if (comprobarUsuario())
                verEventos();
                break;
            case "6":
                if(comprobarUsuario())
                verTareas();
                break;
            case "7":
                if(comprobarUsuario())

                break;
            case"8":
                break;
            case "9":
                salir = true;
                break;
        }

    }
    private boolean comprobarUsuario() {
        if (actual == null) {
            System.out.println("Debes iniciar sesion para continuar");
            System.out.println("Pulsa enter para continuar.....");
            teclado.nextLine();
            return false;
        }
        return true;
    }
    public void lanzar(){
        while (!salir){
            menu();
        }

        }
        public void iniciarSesion(){

        System.out.print("Introduzca nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Introduzca contraseña: ");
        String contraseña = teclado.nextLine();

        Usuario inicioUsuario = new Usuario(nombre,contraseña);

            for (Usuario usuario:usuarios) {
                if(usuario == null)
                    break;
                if (usuario.equals(inicioUsuario)){
                    actual = usuario;
                }
            }
            if(actual == null) {
                System.out.println("Error, el usuario o la contraseña son incorrectos");
            } else{
                System.out.println("Sesion iniciada correctamente" + " " + nombre);
            }
            System.out.println("Pulsa enter para continuar.....");
            teclado.nextLine();
            }

            public void registrarse(){

        String nombre;
        String contraseña;
        String email;
        String tipo;

       do {
             System.out.print("Introduce el nombre del usuario: ");
             nombre = teclado.nextLine();
           if (nombre.equals("")){
               System.out.println("ERROR! Introduzca nombre utilizando letras y numeros ");
           }
        }while (nombre.equals(""));

       do {
           System.out.print("Introduce la contraseña: ");
            contraseña = teclado.nextLine();
            if (contraseña.equals("")){
                System.out.println("ERROR! Introduzca contraseña utilizando letras y numeros ");
            }
       }while (contraseña.equals(""));

       do {
           System.out.print("Introduce el email: ");
           email = teclado.nextLine();

               if (email.equals("")){
               System.out.println("ERROR! Introduce un correo que sea correcto " );
           }

       }while (email.equals(""));

       do {
           System.out.print("Introduce el tipo: ");
            tipo = teclado.nextLine();
            if (tipo.equals("")){
                System.out.println("ERROR! Introduce si seras propietario o invitado");
            }
       }while (tipo.equals(""));


                Usuario usuario = new Usuario(nombre,contraseña, email,tipo);
                usuarios[contadorUsuarios++]= usuario;

                System.out.println("Dado de alto correctamente");
                System.out.println("Pulsa enter para continuar.....");
                teclado.nextLine();
            }
            public void anadirEvento(){
              System.out.print("Intruduzca el nombre del evento: ");
              String nombre = teclado.nextLine();
                System.out.print("Intruduzca la descripcion del evento: ");
                String descripcion = teclado.nextLine();
              System.out.print("Introduzca lugar: ");
              String lugar = teclado.nextLine();


             Evento evento = new Evento(nombre,descripcion,lugar);
                 eventos[contadoreventos++] = evento;
                System.out.println("Evento añadido correctamente");
                System.out.println("Pulsa enter para continuar.....");
                teclado.nextLine();
            }
            public void anadirTareas(){
                System.out.print("Intruduzca el nombre de la tarea: ");
                String nombre = teclado.nextLine();
                System.out.print("Intruduzca la descripcion de la tarea: ");
                String descripcion = teclado.nextLine();

                Tarea tarea =  new Tarea(nombre,descripcion);
                tareas[contadorTareas++] = tarea;
                System.out.println("Tarea añadida correctamente");
                System.out.println("Pulsa enter para continuar.....");
                teclado.nextLine();
            }

            public void verEventos(){

                for (Evento evento:eventos) {
                    if (evento == null)
                        break;

                    System.out.print(evento);
                }

            }
           public void verTareas(){
        for (Tarea tarea : tareas){
            if (tarea == null)
                break;

            System.out.println(tarea);
        }


    }

    }









