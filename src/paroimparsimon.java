import java.util.Scanner;
//pide dos numero, los multiplica t dice si es impar o no
public class paroimparsimon {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("\n ingrese primer numero: ");
        var primerNumero = scanner.nextDouble();
        System.out.println("\n ingrese segundo numero: ");
        var segundoNumero = scanner.nextDouble();
        var multiplicacion = (primerNumero*segundoNumero);
        System.out.println("\n la multiplicacion entre "+primerNumero+" y "+segundoNumero+" es = "+multiplicacion);

        if (multiplicacion % 2== 0) {
            System.out.println("\n el numero es par ");

        }else {
            System.out.println("\n el numero es impar ");
        }
        //cierra el if de par o impar
    }

}


