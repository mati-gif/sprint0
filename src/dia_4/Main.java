package dia_4;

import dia_4.interfaces.CalculatorMenu;
import dia_4.interfaces.CalculatorOperations;
import dia_4.interfaces.implement.Calculadora;
import dia_4.models.CalculatorWithMenu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        Scanner scanner = new Scanner(System.in);

        Calculadora calculadora = new Calculadora();

        CalculatorWithMenu menu = new CalculatorWithMenu(scanner, calculadora);
        menu.calcularResultado();

    }
}
