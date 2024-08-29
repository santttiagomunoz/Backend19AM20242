package javanotes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione una opcion: "+ "\n" +"1- Matricular curso" + "\n"
        + "2- Consultar Horarios" + "\n" + "3- cancelar curso" + "\n" + "4- consultar notas");

        int option = sc.nextInt();

        switch (option){
            case 1 :
                System.out.println("Matriculate");
                break;
            case  2 :
                System.out.println("Contando horarios");
                break;
            case 3 :
                System.out.println("Cancelar curso");
                break;
            case 4 :
                System.out.println("Constultar notas");
                break;
            default:
                System.out.println("ninguna opcion valida");
        }

    }
}
