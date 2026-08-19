import java.util.Scanner;

public class clase3 {

    public static class Operaciones{
        double a;
        double b;
        int selector;

        public Operaciones(double a, double b) {
            this.a=a;
            this.b=b;
        }// FIN CONSTRUCTOR

        public void calculator(int selector){
            this.selector=selector;
            switch (selector){
                case 1:
                    if(a%1==0 & b%1==0){
                        System.out.println("\nLa suma de "+(int)a+" + "+(int)b+" es = "+((int)a+(int)b));
                    }else { System.out.println("\nLa suma de "+a+" + "+b+" es = "+(a+b));}
                    break;
                case 2:
                    if(a%1==0 & b%1==0){
                        System.out.println("\nLa resta de "+(int)a+" + "+(int)b+" es = "+((int)a-(int)b));
                    }else { System.out.println("\nLa resta de "+a+" + "+b+" es = "+(a-b));}
                    break;
                case 3:
                    if(a%1==0 & b%1==0){
                        System.out.println("\nLa multiplicacion de "+(int)a+" + "+(int)b+" es = "+((int)a*(int)b));
                    }else { System.out.println("\nLa multiplicacion de "+a+" + "+b+" es = "+(a*b));}
                    break;
                case 4:
                    System.out.println("\nLa división de "+a+" + "+b+" es = "+(a/b));
                    break;
                case 5:
                    System.out.println("\nEl modulo de "+a+" + "+b+" es = "+(a%b));
                    break;
                default:
                    System.out.println("\nFin del programa");
            }// fin del switch

        }// METODO calculator

    }//CLASE OPERACIONES
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nBienvenido a la calculadora");
        System.out.println("\nPrimero ingrese 2 numeros");
        String ciclo=null;
        do {
        System.out.println("\nPrimer numero:");
        var firstNum = scanner.nextDouble();
        System.out.println("\nSegundo numero:");
        var secondNum = scanner.nextDouble();
        Operaciones operaciones = new  Operaciones(firstNum,secondNum);



            System.out.println(
                    "\nAhora indique que operacion desea realizar:" +
                            "\n----------------------------------" +
                            "\nPARA SUMA INGRESE(1)" +
                            "\nPARA RESTA INGRESE (2)" +
                            "\nPARA MULTIPLICAR INGRESE (3)" +
                            "\nPARA DIVIDIR INGERESE (4)" +
                            "\nPARA VER MODULO INGRESE (5)" +
                            "\nCUALQUIER OTRO NUMERO CIERRA EL SISTEMA" +
                            "\n----------------------------------");
            scanner.nextLine();
            var seleccionar = scanner.nextInt();
            operaciones.calculator(seleccionar);
            scanner.nextLine();
            System.out.println("\n Volver a usar la calculadora? Y/N CUALQUIER OTRA OPCION CIERRA EL PROGRAMA");
            ciclo=scanner.nextLine();
        }while (ciclo.equals("Y"));

    }
}
