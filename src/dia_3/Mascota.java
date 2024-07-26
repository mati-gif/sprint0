package dia_3;

public class Mascota {

   private String nombre;
   private int edad;
   private TipoMascota tipo;
   private Persona persona;

   public Mascota(String nombre, int edad, TipoMascota tipo){

      this.nombre = nombre;
      this.edad = edad;
      this.tipo = tipo;

   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public int getEdad() {
      return edad;
   }

   public void setEdad(int edad) {
      this.edad = edad;
   }

   public TipoMascota getTipo() {
      return tipo;
   }

   public void setTipo(TipoMascota tipo) {
      this.tipo = tipo;
   }

   public Persona getPersona() {
      return persona;
   }

   public void setPersona(Persona persona) {
      this.persona = persona;
   }

   @Override
   public String toString() {
      return "Mascota{" +
              "nombre='" + nombre + '\'' +
              ", edad=" + edad +
              ", tipo=" + tipo +
              ", persona=" + persona.getNombre() +
              '}';
   }


}
