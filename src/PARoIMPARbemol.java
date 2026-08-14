
import java.util.Scanner;

public class PARoIMPARbemol {
    public static void main(String[] args) { //Inicio de codigo
        Scanner sc = new Scanner(System.in);

        System.out.println("poner primer numero: ");

        var PrimerNumero = sc.nextDouble();

        System.out.println("poner segundo numero: ");

        var SegundoNumero = sc.nextDouble();

        var multiplicacion = (PrimerNumero*SegundoNumero);
        System.out.println(multiplicacion);

        if (multiplicacion % 2 == 0) {//Abre el if
            System.out.println("Es PAR");
        } else {//abre el Else
            System.out.println("Es IMPAR");
        }

     }//Fin del codigo




    }

