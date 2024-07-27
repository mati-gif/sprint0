package dia_4.interfaces.implement;
import java.util.Scanner;
import dia_4.interfaces.CalculatorOperations;

public class Calculadora implements CalculatorOperations {
    @Override
    public double sumar(double numero1, double numero2) {
        return numero1+numero2;
    }


    @Override
    public double restar(double numero1, double numero2) {
        return numero1-numero2;
    }

    @Override
    public double multiplicar(double numero1, double numero2) {
        return numero1*numero2;
    }

    @Override
    public double dividir(double numero1, double numero2) {
        if (numero2==0){
            System.out.println("Division por 0 no esta permitida");
        }

            return numero1/numero2;


    }
}
