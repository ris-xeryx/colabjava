import java.util.Scanner;

public class Clase4 {
    public int op = 0;
    public Scanner onn= new Scanner(System.in);
    public double a;
    public double b;
    /**
     * @param args holi
     */
    static void main(String[] args) {
        Clase4 open = new Clase4();

        open.data();
       open.menu();
       open.opscanner();
       open.opciones();
    }// FINAL DEL MAIN :D

    public void data(){
        System.out.println("\ningrese el primer dato de operación");
        this.a=onn.nextDouble();
        System.out.println("\ningrese el segundo dato de operación");
        this.b=onn.nextDouble();
    }

    public void menu(){
        System.out.println(
                        "\nAhora indique que operacion desea realizar:" +
                        "\n----------------------------------" +
                        "\nPARA SUMA INGRESE(1)" +
                        "\nPARA RESTA INGRESE (2)" +
                        "\nPARA MULTIPLICAR INGRESE (3)" +
                        "\nPARA DIVIDIR INGERESE (4)" +
                        "\nPARA VER MODULO INGRESE (5)" +
                        "\nCUALQUIER OTRO NUMERO CIERRA EL SISTEMA" +
                        "\n----------------------------------");}//FIN  DEL PRINT Y EL METODO "menu"
    /**
     *      * <p> usa un scanner para ingresar un input de tipo integer para guardarlo en una variable local llamada
     *      * op para que al momento de que se despliegue el menu y
     *      *el usuario ponga un numero el programa sepa interpretarlo
     */

    public void opscanner(){
        System.out.println("\nSELECCIONE UN VALOR DE LOS VISTOS EN EL MENU");
        this.op= onn.nextInt();

    }//FIN DE SELECTOR DE OPCIONES DEL MENU


    public void opciones(){

        switch (op){
            case 1:
                if(a%1==0 & b%1==0){
                    System.out.println("\nLa suma de "+(int)a+" + "+(int)b+" es = "+((int)a+(int)b));
                }else { System.out.println("\nLa suma de "+a+" + "+b+" es = "+(a+b));}
                break;
            case 2:
                if(a%1==0 & b%1==0){
                    System.out.println("\nLa resta de "+(int)a+" - "+(int)b+" es = "+((int)a-(int)b));
                }else { System.out.println("\nLa resta de "+a+" - "+b+" es = "+(a-b));}
                break;
            case 3:
                if(a%1==0 & b%1==0){
                    System.out.println("\nLa multiplicacion de "+(int)a+" * "+(int)b+" es = "+((int)a*(int)b));
                }else { System.out.println("\nLa multiplicacion de "+a+" * "+b+" es = "+(a*b));}
                break;
            case 4:
                System.out.println("\nLa división de "+a+" / "+b+" es = "+(a/b));
                break;
            case 5:
                System.out.println("\nEl modulo de "+a+" / "+b+" es = "+(a%b));
                break;
            default:
                System.out.println("\nFin del programa");
        }// fin del switch

    }// METODO calculator


}

