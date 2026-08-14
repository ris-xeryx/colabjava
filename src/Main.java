import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("quieres sumar? yes/not");
        String respuesta = sc.nextLine();

        if(respuesta.equals("yes")) {

            System.out.println("dime un numero");
            double num = sc.nextDouble();
            System.out.println("dime otro numero");
            double num2 = sc.nextDouble();
            suma(num, num2);
        }else if  (respuesta.equals("not")) {

            System.out.println("fin del programa");
        }else{

            System.err.println("error, responda con si o no");
        }
    }


    public static void suma (double a, double b){
        System.out.println(a+b);
    }

}
