package dia_2;

public class Persona {

    private String nombre;//se le pone private adelante de la variable para seguir el princpio del encapsulamiento.
    //y consiste en en ocultar los detalles internos de un objeto y permitir que se acceda a ellos únicamente a través de métodos públicos (getters y setters)

    private String apellido;
    private int edad;
    private String dni;
    private double altura;
    private Boolean casado;
    private String[] nombreMascotas;

//    public Persona(String nombre,String apellido,int edad){//creando el constructor Persona , el cosntructor es un metodo porque le pertenece a la clase persona.
//        //this. es el contexto del objeto que voy  a crear a partir de esta clase y se usa para acceder a las propiedades que estan definidas en la clase persona.
//        //es decir this es una palabra clave que representa ese objeto específico que acabas de crear.
//        //ya que esa clase la necesito para crear un objeto.
//
//
//        this.nombre = nombre;  // this.nombre se refiere a la variable de instancia 'nombre' mientras que nombre es el parametro.
//        //lo uso para ,dentro del objeto persona , hacer el llamado de la variable de instancia. o dicho de otro modo hacer referncia a la variable que estan en la clase Persona.
//        this.apellido = apellido;
//        this.edad = edad;
//
//
//    }

//    public Persona() {// Esto es un constructor vacio.
//
//    }


    public Persona(String nombre, String apellido, String dni, int edad, double altura, boolean casado,String[] nombreMascotas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad; //this. estas haciendo refencia al objeto que estoy creando o instanciando.
        this.altura = altura;
        this.casado = casado;
        this.nombreMascotas = nombreMascotas;
    }



//Los métodos saltar() y mostrarPersona() son métodos de instancia de la clase Persona.
    // Esto significa que son funciones que pueden ser llamadas en cualquier objeto que sea una instancia de la clase Persona.

    // Ambos metodos hacen referencia al objeto actual de la clase Persona a través de la palabra clave this.
    // Esto significa que cuando llamas a estos métodos en un objeto Persona,
    // ellos usan los valores de las variables de instancia (nombre, apellido, y edad) de ese objeto en particular.
    public void mostrarPersona(){

        System.out.println("hola soy " + this.nombre + " " + this.apellido );
        System.out.println("tengo " + this.edad + " años." + " y mido " + this.altura + " metros de alutra");
        System.out.println("mi dni es : " + this.dni);
        System.out.println(this.casado ? "Estoy casado/a." : "No estoy casado/a.");

        if(this.nombreMascotas != null && this.nombreMascotas.length > 0){
            System.out.println("Mis mascotas son: ");
            for (int i = 0; i < this.nombreMascotas.length; i++) {
                System.out.println(this.nombreMascotas[i]);
            }
        } else{
            System.out.println("No tengo mascotas");
        }

    }




//    public void saltar(){
//        System.out.println(this.nombre + " Esta saltando");
//    }






    //------metodos Setter y Getters-----//

    public void setNombre(String nombre){//setNombre es el nombre del método. Se usa para cambair el valor del atributo nombre del objeto persona.
        this.nombre = nombre;//this.nombre: Se refiere al atributo nombre del objeto actual. this. es una referencia al objeto  que  está llamando al método. Es el objeto que yo cree que va a llamar al set

        //this . es el objeto que esta llamando al metodo setNombre(), y le va a asignar a this.nombre el valor que esta recibiendo por parametro setNombre() que es nombre
    }

    public String getNombre(){

    return this.nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad; //this. va al contexto , entonces en este contexto esta haciendo referencia al objeto que llama a este metodo  que yo cree con esta clase.
    }

    public int getEdad() {
        return edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

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

    public void setNombreMascotas(String[] nombreMascotas) {
        this.nombreMascotas = nombreMascotas;
    }

    public String[] getNombreMascotas() {
        return nombreMascotas;
    }


}
