package proyecto;
import java.util.Scanner;


public class CajeroAutomatico {

    static Scanner sc = new Scanner(System.in);
    static int saldo = 10000;
    
    public static void retirardinero (){
        int retiro;
            System.out.println("¿cuanto dinero desea retirar?");

             System.out.println("saldo:" + saldo);
             retiro = sc.nextInt();

            do{

                System.out.println("¡El retiro es excesivo o menor a 0, ingrese otra cifra!");
                retiro = sc.nextInt();
             
            } while(retiro < 0 || retiro > saldo );

            System.out.println("¡dinero retirado con exito!");
            System.out.println("su saldo ahora es: " + (saldo-retiro));
            saldo = saldo-retiro;
             

    }

    public static void depositardinero (){

     int deposito;
     
        System.out.println("¿cuanto dinero desea depositar?");
             deposito = sc.nextInt();

           while (deposito <= 0) {
        
                System.out.println("Error, deposito menor o igual a 0, ingrese un numero mayor a 0");
                deposito = sc.nextInt();

            } 
            
             System.out.println("dinero depositado con exito!");
             System.out.println("su saldo ahora es: " + (saldo + deposito));
             saldo = saldo + deposito;

    }

    public static void verificarsaldo (){

        System.out.println("Su saldo es :" + saldo);
    }


    public static void main(String[] args) {

    int opcion;
    do {
        

        System.out.println("|Bienvenido al caejero  |");
        System.out.println("|¿Que desea hacer?      |");
        System.out.println("|1:retirar dinero       |");
        System.out.println("|2:depositar dinero     |");
        System.out.println("|3:verificar saldo      |");
        System.out.println("|4:salir                |");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
             retirardinero();
            break;

            case 2:
             depositardinero();
             break;

             case 3:
             verificarsaldo();
             break;

             default:
             System.out.println("Opción incorrecta!");
             break;

                   }
                } while (opcion != 4);

                sc.close();
    }
}
