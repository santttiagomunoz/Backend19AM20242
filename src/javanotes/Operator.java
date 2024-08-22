package javanotes;

import java.util.Scanner;

public class Operator {


    public static void main(String[] args){
        int n1 = 5, n2 = 7, modulo;

        OperacionesAritmeticas();
    }
    public static void OperacionesAritmeticas(){
        int result = 0, n1 = 0, n2 = 0;
        String op = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese numero 1: ");
        n1 = sc.nextInt();
        System.out.println("ingrese numero 2: ");
        n2 = sc.nextInt();

        System.out.println(" 1 para sumar" + "\n" + "2 para restar" + "3 para multiplicar" + "\n" + " 4 para dividir");
        op = sc.next();
        switch (op){
            case "1" : result = n1 + n2;
                System.out.println(result);
                break;
            case "2" : result = n1 - n2;
                System.out.println(result);
                break;
            case "3" : result = n1 * n2;
                System.out.println(result);
                break;
            case "4" : result = n1 / n2;
                System.out.println(result);
            break;
            default:
                System.out.println("not an option");;
        }

    }

}
