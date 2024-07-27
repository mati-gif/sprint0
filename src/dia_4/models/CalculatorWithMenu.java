package dia_4.models;

import dia_4.interfaces.CalculatorMenu;
import dia_4.interfaces.CalculatorOperations;
import dia_4.interfaces.implement.Calculadora;

import java.util.Scanner;
//
//Scanner scanner = new Scanner(System.in);
public class CalculatorWithMenu implements CalculatorMenu {

private Scanner scanner;// Esto me sirve para :  crear objetos de esa clase y usar la variable scanner dentro de esos objetos.

    private CalculatorOperations calculatorOperations; // CalculatorOperations es una interfaz. que tiene como nombre calculatorOperations.

//    private CalculatorOperations calculatorOperations2 = new Calculadora();

    public CalculatorWithMenu(Scanner scanner, CalculatorOperations calculatorOperations) {
        this.scanner = scanner;
        this.calculatorOperations = calculatorOperations;
    }


    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public CalculatorOperations getCalculatorOperations() {
        return calculatorOperations;
    }

    public void setCalculatorOperations(CalculatorOperations calculatorOperations) {
        this.calculatorOperations = calculatorOperations;
    }


//    public CalculatorOperations getCalculatorOperations2() {
//        return calculatorOperations2;
//    }
//
//    public void setCalculatorOperations2(CalculatorOperations calculatorOperations2) {
//        this.calculatorOperations2 = calculatorOperations2;
//    }

    @Override
    public void mostrarMenu() {

        System.out.println("Que operacion deseas realizar? \n" +
                "1. Sumar \n" +
                "2. Restar \n" +
                "3. Multiplicar \n" +
                "4. Dividir \n" +
                "0. Salir");

    }

    @Override
    public void calcularResultado() {
        Scanner scanner = new Scanner(System.in);
        boolean bandera = false;
while (!bandera) {
    mostrarMenu();
    System.out.println("ingrese una opcion:");
    int opcion = scanner.nextInt();
    if (opcion == 0) {
        bandera = true;
        System.out.println("aplicacion terminada");
        continue;
    }
    System.out.println("ingrese el primer numero:");
    double numero1 = scanner.nextInt();


    System.out.println("ingrese el segundo numero:");
    double numero2 = scanner.nextInt();

    double resultado = 0;
    boolean operacionValida = true;

    switch (opcion){


        case 1 :
            resultado = calculatorOperations.sumar(numero1,numero2);
            break;
        case 2 :
            resultado = calculatorOperations.restar(numero1,numero2);
            break;
        case 3 :
            resultado = calculatorOperations.multiplicar(numero1,numero2);
            break;
        case 4 :
            if (numero2 != 0) {
                resultado = calculatorOperations.dividir(numero1, numero2);
            } else {
                System.out.println("Error: División por cero no permitida.");
                operacionValida = false;
            }
            break;
        default:
            System.out.println("Opcion no valida");
             operacionValida = false;
            break;
    }
    System.out.println("El resultado es: " + resultado);

    }



}









        }


