package paroimpar;

import java.util.Scanner;
// que el usuario ingrese dos numeros, multiplicarlos e indicar si es par o impar
public class paroimparRIS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nIngrese primer numero: ");
        var primerNumero = scanner.nextDouble();
        System.out.println("\nIngrese segundo numero: ");
        var segundoNumero = scanner.nextDouble();
        var multiplicacion = (primerNumero*segundoNumero);
        System.out.println("\nLa multiplicación entre "+primerNumero+" y "+segundoNumero+" es = "+multiplicacion);
        if(multiplicacion % 2 == 0){
            System.out.println("\nEl numero es par");
        }else {
            System.out.println("\nEl numero es impar");
        }// CIERRA EL ELSE QUE MIRA SI UN NUMERO ES PAR O IMPAR

    }// CIERRA LA FUNCION MAIN QUE DA INICIO AL PROGRAMA
}// CIERRA LA CLASE Main QUE TIENE EL NOMBRE DEL PROGRAMA

