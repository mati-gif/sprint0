package dia_3;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;//sirven para importar las clases necesarias desde la biblioteca de java
import java.util.List;
import java.util.ArrayList;



public class Persona {

    private String nombre;//se le pone private adelante de la variable para seguir el princpio del encapsulamiento.
    //y consiste en en ocultar los detalles internos de un objeto y permitir que se acceda a ellos únicamente a través de métodos públicos (getters y setters)

    private String apellido;
    private int edad;
    private String dni;

    private double altura;
    private Boolean casado;
    private List<Mascota> mascotas = new ArrayList<>();


    public Persona(Boolean casado, double altura, String dni, int edad, String apellido, String nombre) {
        this.casado = casado;
        this.altura = altura;
        this.dni = dni;
        this.edad = edad;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public Persona(String nombre, List<Mascota> mascota, Boolean casado, double altura, String dni, int edad, String apellido) {
        this.nombre = nombre;
        this.mascotas = mascota;
        this.casado = casado;
        this.altura = altura;
        this.dni = dni;
        this.edad = edad;
        this.apellido = apellido;
    }

    public void mostrarPersona() {

        System.out.println("hola soy " + this.nombre + " " + this.apellido);
        System.out.println("tengo " + this.edad + " años." + " y mido " + this.altura + " metros de alutra");
        System.out.println(this.casado ? "Estoy casado/a." : "No estoy casado/a.");
        System.out.println("mi dni es: " + this.dni);
        for (Mascota m : this.mascotas) {
            System.out.println(m.getNombre() + " es un: " + m.getTipo() + " y tiene : " + m.getEdad() + " años");
        }





        }


//------metodos Setter y Getters-----//

    public void setNombre(String nombre) {//setNombre es el nombre del método. Se usa para cambair el valor del atributo nombre del objeto persona.
        this.nombre = nombre;//this.nombre: Se refiere al atributo nombre del objeto actual. this. es una referencia al objeto  que  está llamando al método.
        // Es el objeto que yo cree que va a llamar al set.

        //this . es el objeto que esta llamando al metodo setNombre(), y le va a asignar a this.nombre el valor que esta recibiendo por parametro setNombre() que es nombre
    }


    public String getNombre() {

        return this.nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad; //this. va al contexto ,
        // entonces en este contexto esta haciendo referencia al objeto que llama a este metodo (setEdad() )
        // que yo cree a partir de la clase persona.

        //this es la instancia del objeto creado. this es el objeto instanciado a partir de la clase persona.
        //this esta haciendo referencia al objeto ya creado.
        //dicho tambien: this . esta haciendo referencia a la instancia del objeto creado.
    }

    public int getEdad() {
        return edad;
    }


//    public void setDni(Dni dni) {//Al método setDni(Dni dni), le estás pasando un objeto de tipo Dni como parámetro. Este método se utiliza para asignar un valor al campo (objeto) dni de la clase Persona.
//
//        // this.dni se refiere al campo (objeto) dni de la instancia actual de Persona. [ instancia actual ==> objeto persona creada]
//        this.dni = dni;
//    }
//
//    public Dni getDni() {
//        return dni;
//    }
//
//    public void addDni(Dni dni) {////Esta línea asigna el objeto dni (que fue pasado como argumento en el método) al atributo dni de la instancia (objeto) actual de la clase  Persona.
//
//
//        //this se refiere a la instancia (objeto) actual de Persona en la cual se está ejecutando el método addDni.
//        //Esta línea de código asigna el objeto Dni pasado como parámetro al atributo dni de la instancia actual de la clase Persona. En otras palabras, está diciendo "el DNI de esta persona es el DNI que se pasó como parámetro".
//        this.dni = dni;
//        dni.setPersona(this);//estoy asignando la persona que llama al metodo addDni al dni a traves del setter de dni.
//
//        //significa que estamos llamando al método setPersona del objeto dni y pasándole como argumento la instancia actual de Persona (referneciada con this).
//
//
//        //La línea dni.setPersona(this); dentro del método addDni establece una relación bidireccional.
//        //this se refiere a la instancia (objeto) de Persona que está llamando al método addDni,
//        // y se pasa como argumento al método setPersona del objeto Dni.
//        //Esto permite que tanto la Persona conozca su Dni como que el Dni conozca a la Persona a la que pertenece.
//
//    }


    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setCasado(Boolean casado) {
        this.casado = casado;
    }

    public Boolean getCasado() {
        return casado;
    }


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void addMascota(Mascota mascota) {
        this.mascotas.add(mascota); //Agrego a la lista de mascotas a la mascota que recibe por parametro.
        mascota.setPersona(this); //Asigno la persona a la mascota que recibe por parametro.

    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                ", altura=" + altura +
                ", casado=" + casado +
                ", mascota=" + mascotas +
                '}';
    }
}










