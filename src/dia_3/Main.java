package dia_3;

import java.util.ArrayList;
import java.util.HashSet;//sirven para importar las clases necesarias desde la biblioteca de java
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {



        System.out.println("Hello World!");
Mascota mascota1 = new Mascota("Luna",2,TipoMascota.PEZ);
Mascota mascota2 = new Mascota("Toby",4,TipoMascota.GATO);
Mascota mascota3 = new Mascota("Estrella",10,TipoMascota.PAJARO);
Mascota mascota4 = new Mascota("Natalia",1,TipoMascota.PERRO);
Mascota mascota5 = new Mascota("Luna",2,TipoMascota.TORTUGA);

        Persona persona1 = new Persona(true,1.80,"22456654",22,"Perez","Fernando");
        persona1.addMascota(mascota1);//llama al metodo addMascota del objeto persona, addMAscota recibe una variable de tipo mascota1
        System.out.println(mascota1);

        persona1.addMascota(mascota2);
        System.out.println(mascota2);

//otra forma de hacerlo-----//
        List<Mascota> mascotas = new ArrayList<>();
        mascotas.add(mascota3);
        mascotas.add(mascota4);
        mascotas.add(mascota5);


        Persona persona2 = new Persona("Pedro",mascotas,true,1.80,"12345678",22,"Perez");



        System.out.println("Presentación de persona1:");
        //son metodos del objeto persona.Asi mismo estos metodos pertenencen al objeto persona
        persona1.mostrarPersona();//lllama al metodo mostrarPersona del objeto persona.






//son metodos del objeto persona.Asi mismo estos metodos pertenencen al objeto persona
        System.out.println("Presentación de persona2:");
        persona2.mostrarPersona();//lllama al metodo mostrarPersona del objeto persona.





        System.out.println("Hello World!");
    }
}
