package dia_2;

public class Main {



    public static void main(String[] args) {

        System.out.println("Hello World!");
        String[] mascotasPersona1 = {"Rex", "Luna"};
        Persona persona1 = new Persona("Fernando","Perez","22456654",22,1.80,true,mascotasPersona1);

        String[] mascotasPersona2 = {};
        Persona persona2 = new Persona("Juan","Gonzales","23545698",23,1.78,false,mascotasPersona2);





        System.out.println("Presentación de persona1:");
        //son metodos del objeto persona.Asi mismo estos metodos pertenencen al objeto persona
        persona1.mostrarPersona();//lllama al metodo mostrarPersona del objeto persona.

//son metodos del objeto persona.Asi mismo estos metodos pertenencen al objeto persona
        System.out.println("Presentación de persona2:");
        persona2.mostrarPersona();//lllama al metodo mostrarPersona del objeto persona.





//son metodos del objeto persona.Asi mismo estos metodos pertenencen al objeto persona
//persona.saltar();//lllama al metodo saltar del objeto persona.




    }
}
