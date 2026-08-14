import java.util.Scanner;
//PIDE DOS NUMERO LOS MULTIPLICAS Y DICE SI ES PAR O IMPAR
public class paroimparAguaz {
    static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("ingrese primer numero");
        int Numero1 = Sc.nextInt();
        System.out.println("ingrese segundo numero");
        int Numero2 = Sc.nextInt();
        System.out.println("la multiplicacion entre " + Numero1 + " y " + Numero2 + " es: " + Numero1*Numero2);
        int multiplicacion = (Numero1*Numero2);
        if (multiplicacion % 2 == 0) {
            System.out.println("\n  el numero es par: "+ multiplicacion);
        }
        else{
            System.out.println("\n el numero es impar" + multiplicacion);
        }
    }
}
