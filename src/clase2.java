import java.util.Scanner;

class Operaciones{

    public void suma(double a, double b){
        System.out.println("\n"+a+" + "+b+" = "+(a+b));
    }// FIN METODO SUMA
    public void rest(double a, double b){
        System.out.println("\n"+a+" - "+b+" = "+(a-b));
    }// FIN METODO REST
    public void mult(double a, double b){
        System.out.println("\n"+a+" * "+b+" = "+(a*b));
    }// FIN METODO MULT
    public void divi(double a, double b){
        if(b==0){
            System.err.println("\nNo se puede dividir por 0");
        }else{
            System.out.println("\n"+a+" / "+b+" = "+(a/b));}//CIERRE ELSE DE DIVI

    }// FIN METODO DIVI
}//FIN DE CLASE OPERACIONES

public class clase2{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Operaciones operc = new Operaciones();
        String repcalc = null;
       do {
           System.out.println("\nBienvenido a la calculadora");
           System.out.println("\nIngresar primer valor: ");
           var a = scanner.nextDouble();
           System.out.println("\nIngresar segundo valor: ");
           var b = scanner.nextDouble();
           System.out.println("\nQue tipo de operación desea?" +
                   "\n------------------------------" +
                   "\nSUMA(1)\nRESTA(2)\nMULTIPLICACION(3)\nDIVISIÓN(4)\nSALIR(0)");
           var selector = scanner.nextInt();
           switch (selector) {
               case 1:
                   operc.suma(a, b);
                   break;
               case 2:
                   operc.rest(a, b);
                   break;
               case 3:
                   operc.mult(a, b);
                   break;
               case 4:
                   operc.divi(a, b);
                   break;
               case 0:
                   System.out.println("\nGRACIAS POR USAR LA CALCULADORA");
           }
           System.out.println("\n Desea volver a usar? yes/not");
           repcalc= scanner.next();

       }while(repcalc.equals("yes"));

    }//FIN DE METODO "main"

}//FIN CLASE "CLASE2"
