package dia_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ejercicio 1: Crea las variables correspondientes para leer tu nombre, apellido y edad e
        // imprímelas en la consola en una oración.

        String myName = "Matias";
        String myLastName = "Soria";
        int myAged = 24;
        System.out.print("mi nombre es " + myName + " ");
        System.out.print("y mi apellido es " + myLastName + " ");
        System.out.println(" y tengo : " + myAged + " años");


//ejercicio 2 : Crea un método que imprima un mensaje de bienvenida en la consola.

//        mensajeBienvenida();

//ejercicio 3: Crea un pequeño programa que te permita ingresar 3 números
        // e imprimir a través de la consola cuál es el mayor.

        //Scanner scanner = new Scanner(System.in);

//        System.out.println("ingrese el primer numero:");
//        int numero1 = scanner.nextInt();
//
//        System.out.println("ingrese el segundo numero:");
//        int numero2 = scanner.nextInt();
//
//        System.out.println("ingrese el tercer numero:");
//        int numero3 = scanner.nextInt();
//
//
//        //System.out.println("el primer numero es: " + numero1 + " ,  el segundo numero es: " + numero2 + " y  el tercer numero es: " + numero3);
//
//        if (numero1 >= numero2 && numero1 >= numero3) {
//            if (numero1 == numero2 && numero1 == numero3) {
//                System.out.println("Los tres números son iguales: " + numero1);
//            } else if (numero1 == numero2) {
//                System.out.println("El " + numero1 + " y el " + numero2 + " son iguales y mayores que " + numero3);
//            } else if (numero1 == numero3) {
//                System.out.println("El " + numero1 + " y el " + numero3 + " son iguales y mayores que " + numero2);
//            } else {
//                System.out.println("El " + numero1 + " es el mayor");
//            }
//        } else if (numero2 >= numero1 && numero2 >= numero3) {
//            if (numero2 == numero3) {
//                System.out.println("El " + numero2 + " y el " + numero3 + " son iguales y mayores que " + numero1);
//            } else {
//                System.out.println("El " + numero2 + " es el mayor");
//            }
//        } else {
//            System.out.println("El " + numero3 + " es el mayor");
//        }


//ejercicio 4: Crea un pequeño programa que te permita ingresar un número e
        // imprimir a través de la consola si es par o impar.

//        System.out.println("ingrese el primer numero para saber si es par o impar:");
//        int numeroA = scanner.nextInt();
//
//        if (numeroA % 2 == 0) {
//            System.out.println("este numero es par");
//
//        } else {
//            System.out.println("este numero es impar");
//
//        }


//ejercicio 5:Crea el código correspondiente que te permita ingresar 2 cadenas de caracteres
// e imprimir vía consola si son iguales o no.


//        System.out.println("ingrese la primer cadena de texto:");
//        String cadena1 = scanner.nextLine();
//
//        System.out.print("Ingrese la segunda cadena de texto: ");
//        String cadena2 = scanner.nextLine();
//
//if(cadena2.equals(cadena1)){
//    System.out.println("las cadenas de texto son iguales");
//
//} else{
//
//    System.out.println("las cadenas no son iguales");
//
//}

//ejercicio 6: Crea un método que recibe un número y devuelve si es primo o no.

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero para saber si es primo");
        int numero = sc.nextInt();
        esPrimo(numero);


//ejercicio 7: Crea un método que recibe una matriz de números y
// devuelve la suma de los números impares.

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int resultado = sumaImpares(array);

        System.out.println("la suma de los numero impares es " + resultado);


//ejercicio 8: Crea un método que recibe una matriz de números e
// imprime los números pares y la suma de los números primos.


        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        procesarArray(arreglo);
//
//
//
//


//ejercicio 9:  Crea un método que imprima un pequeño menú a través de la consola
// con las opciones básicas de una calculadora,
// agregando la opción 0 para salir del mismo.


//        mostrarMenu();

//ejercicio 10: Crea otro método que retome el punto anterior para poder crear una pequeña calculadora
// usando switch. Ten en cuenta el caso de la división por 0.


//        realizarOperaciones();

//ejercicio 11: Crear el algoritmo necesario para poder gestionar el ingreso a una bolera. Deberá contar con un pequeño menú con las siguientes opciones:
//
//Entrada de datos.

//Capacidad disponible.

//Dinero recaudado.

//Cerrar sesión en el sistema.

//        int opcion = 0;
//        int capacidadTotal = 0;
//        int dineroRecaudado = 0;
//
//        Scanner scanner = new Scanner(System.in);
//
//        do {
//            System.out.println("Ingrese una opción");
//            System.out.println("1. Ingrese sus datos");
//            System.out.println("2. Capacidad disponible");
//            System.out.println("3. Dinero recaudado");
//            System.out.println("0. Salir");
//
//            opcion = scanner.nextInt();
//
//            switch (opcion) {
//                case 1:
//                    if (capacidadTotal < 500) {
//                        scanner.nextLine();  // Limpiar el buffer
//
//                        System.out.println("Ingrese su nombre");
//                        String nombre = scanner.nextLine();
//                        System.out.println("Ingrese su DNI");
//                        int DNI = scanner.nextInt();
//                        System.out.println("Ingrese su edad");
//                        int edad = scanner.nextInt();
//                        scanner.nextLine();  // Limpiar el buffer
//
//                        if (edad >= 21) {
//                            System.out.println("Puedes entrar");
//                            System.out.println("¿Tienes pase? (si/no)");
//                            String tienePase = scanner.nextLine();
//
//                            if (tienePase.equalsIgnoreCase("si")) {
//                                System.out.println("¿Tienes pase VIP o normal?");
//                                String pase = scanner.nextLine();
//
//                                if (pase.equalsIgnoreCase("vip")) {
//                                    System.out.println("Entras gratis");
//                                    capacidadTotal++;
//                                } else {
//                                    System.out.println("Entras con pase normal");
//                                    capacidadTotal++;
//                                    dineroRecaudado += 1500;
//                                }
//                            } else {
//                                System.out.println("¿Quieres comprar un pase? (vip/normal)");
//                                String pase = scanner.nextLine();
//
//                                if (pase.equalsIgnoreCase("vip")) {
//                                    System.out.println("Compraste un pase VIP");
//                                    capacidadTotal++;
//                                    dineroRecaudado += 2000;
//                                } else {
//                                    System.out.println("Compraste un pase normal");
//                                    capacidadTotal++;
//                                    dineroRecaudado += 1500;
//                                }
//                            }
//                        } else {
//                            System.out.println("Adiós");
//                        }
//                    } else {
//                        System.out.println("No pueden entrar más personas");
//                    }
//                    break;
//                case 2:
//                    System.out.println("Capacidad disponible: " + (500 - capacidadTotal));
//                    break;
//                case 3:
//                    System.out.println("Dinero recaudado: " + dineroRecaudado);
//                    break;
//            }
//        } while (opcion != 0);
//
//        System.out.println("Adiós");

    }









    //es parte del ejercicio 2.
//    static void mensajeBienvenida() {
//        System.out.println("Hola a todos y bienvenidos");
//    }


    //es parte del ejercicio 6.
    public static boolean esPrimo(int numero) {

        if (numero <= 1) {
            return false;  //si el numero es menor o igual a 1 la funcion devuelve false porque todos los numeros menores o iguales a 1 no son primos.
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {// El bulce recorre todos los numeros desde 2 hasta la raiz cuadrada del numero.
            if (numero % i == 0) {
                System.out.println("no es primo");
                return false; // No es primo si es divisible por algún número distinto de 1 y él mismo.
//Si numero es divisible por cualquier i en este rango, la función devuelve false porque significa que numero no es primo.
            }
        }
 System.out.println("es primo");
        // Si no se encontró ningún divisor, el número es primo
        return true;


    }




//es parte del ejercicio 7.
//
    public static int sumaImpares(int[] arreglo){

        int suma = 0;

        for (int i = 0; i < arreglo.length; i++){
        int numero = arreglo[i];

            if (numero % 2 != 0) {
                suma += numero; // Sumar el número impar a la suma
            }
        }

        return suma;
    }



//es parte del ejercicio 8.

    public static void procesarArray(int[] arreglo){
//        int sumaPares = 0;
        int sumaNumerosPrimos = 0;

        for (int i = 0; i < arreglo.length;i++){

            int numero = arreglo[i];

            if(numero % 2 == 0 ){
                System.out.print(numero + " , \n");
            }
            if (esNumeroPrimo(numero)) {
                sumaNumerosPrimos += numero; // Sumar el número primo a la suma
            }
        }

        System.out.println("La suma de los números primos es: " + sumaNumerosPrimos);

    }


    public static boolean esNumeroPrimo(int numero){

        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;


    }

//es parte del ejercicio 9.

//    public static void mostrarMenu() {//es void porque no devuelve ningun valor , solamente imprimi el menu en la consola
////        Scanner sc = new Scanner(System.in);
//        System.out.println("Menu de la calculadora \n" +
//                "1. sumar \n" +
//                "2. restar \n" +
//                "3. multiplicar \n" +
//                "4. dividir \n" +
//                "0. salir");
//
////        int opcion = sc.nextInt();
//
//    }

//es parte del ejercicio 10.

//    public static void realizarOperaciones() {
//
//
//        Scanner sc = new Scanner(System.in);
//        boolean salir = false;
//
//        while (!salir) {
//            mostrarMenu();
//            System.out.println("ingrese una opcion para realizar la operacion");
//            int opcion = sc.nextInt();
//            if(opcion == 0){
//                salir = true;
//                System.out.println("aplicacion terminada");
//                continue;
//            }
//            System.out.println("ingrese el 1er numero");
//            double numero1 = sc.nextInt();
//
//            System.out.println("ingrese el 2do numero");
//            double numero2 = sc.nextInt();
//
//            double resultado = 0;
//
//            switch (opcion){
//                case 1 :
//                    resultado = numero1 + numero2;
//                    System.out.println("el resultado de la suma es : " + resultado);
//                    break;
//                case 2 :
//                    resultado = numero1-numero2;
//                    System.out.println("El resultado de la resta es: " + resultado);
//                    break;
//                case 3 :
//
//                    resultado = numero1*numero2;
//                    System.out.println("El resultado de la multiplicacion es: " + resultado);
//                    break;
//                case 4 :
//                    if (numero1 != 0 && numero2 != 0) {
//                        resultado = numero1/numero2;
//                        System.out.println("El resultado de la division es: " + resultado);
//                    } else {
//                        System.out.println("Error: Division por cero no permitida");
//                    }
//                    break;
//                default:
//                    System.out.println("Opcion no valida");
//                    break;
//
//            }
//
//
//
//        }
//
//
//    }

//es parte del ejercicio 11.




    }


