import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Desafio {
    public static void main(String[] args) {
        String name = "Tony Stark";
        String accountType ="Corriente";
        double balance= 1599.99;
        int option = 0;

        System.out.println("*****************************************************");
        System.out.println("\nNombre del cliente: " + name);
        System.out.println("El tipo de cuenta es: " + accountType);
        System.out.println("Su saldo disponible es "+ "$ " + balance);
        System.out.println("\n******************************************************");
        String menu = """
                *** Ingrese el número de la opción deseada ***
                1 - Consultar saldo 
                2 - Retirar 
                3 - Depositar
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (option != 9){
            System.out.println(menu);
            option = teclado.nextInt();

            switch (option){
                case 1:
                    System.out.println("El saldo actual es: " + "$" + balance );
                    break;
                case 2:
                    System.out.println("¿Cual es el valor que desea retirar?");
                    double subtractValue = teclado.nextDouble();
                    if(subtractValue > balance){
                        System.out.println("Saldo insuficiente");
                    }else {
                        balance += - subtractValue;
                        System.out.println("El saldo actual es: "+ "$ " + balance);
                    }
                    break;
                case 3:
                    System.out.println("¿Cual es el valor que desea depositar?");
                    double sendValue = teclado.nextDouble();
                    balance += sendValue;
                    System.out.println("El saldo actual es: " + balance);
                    break;
                    case  9:
                        System.out.println("Gracias por utiliazr nuestros servicios, Fin de la sesión");
                        break;
                default:
                    System.out.println("Opción incorrecta");




            }
        }
    }
}