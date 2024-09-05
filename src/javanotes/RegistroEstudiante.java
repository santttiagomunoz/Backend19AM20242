package javanotes;

import java.awt.*;
import java.util.Scanner;

public class RegistroEstudiante {
    static Scanner sc = new Scanner(System.in);
    static String name, lastName, number, curse, age;
    static double score, n1, n2;
    static int op;

    public static void main(String[] args){
        Menu();
    }

    public static void Menu(){
    do{
        System.out.println("-----Menu" + "\n" + "1- registro de estudiante" + "\n" + "2- mostrar informacion del estudiante");
        System.out.println("seleccione una opcion: " + "\n");
        op = sc.nextInt();

        switch (op){
            case 1 : StudentRegistration();
            break;
            case 2: if(name == null && lastName == null && age == null && number == null){
                System.out.println("no hay informacion sobre ningun estudiante");
            }else{
                ShowStudentInfo();
            }
            break;
            case 3:
                System.out.println("ingrese nota uno: ");
                n1 = sc.nextDouble();
                System.out.println("ingrese nota dos: ");
                n2 = sc.nextDouble();
                Notes(n1, n2);
                break;
            default:
                System.out.println("no elegiste una opcion valida");
        }
        }while(op != 3);
    }
    public static void StudentRegistration(){
        SubMenu();
    }
    public static void ShowStudentInfo(){
        System.out.println("nombre: " + name);
        System.out.println("apellido: " + lastName);
        System.out.println("edad: " + age);
        System.out.println("numero: " + number);
        System.out.println("curso: " + curse);

    }

    public static double Notes(double n1, double n2){

        double average = (n1 + n2) / 2;
        if(average <= 2.5){
            System.out.println("el estudiante pierde el curso");
        } else if (average > 2.5 && average < 3.0) {
            System.out.println("el estudiante debe habilitar");
        }else{
            System.out.println("el estudiante gana el curso");
        }
        System.out.println("promedio: ");
        return average;
    }
    public static void SubMenu(){
        System.out.println("ingrese nombre del estudiante: ");
        name = sc.next();
        System.out.println("ingrese apellido del estudiante: ");
        lastName = sc.next();
        System.out.println("ingrese edad del estudiante: ");
        age = sc.next();
        System.out.println("ingrese numero del estudiante: ");
        number = sc.next();
        System.out.println("ingrese el curso que va a registrar: ");
        curse = sc.next();
    }
     public void menu(){
         System.out.println("seleccione una opcion: ");
     }
}
