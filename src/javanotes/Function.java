package javanotes;

import java.util.Scanner;

public class Function {

    static Scanner sc = new Scanner(System.in);

    static double salary;
    static float cajaCompensacion;
    public static void main (String[] args){

        salary = 2500000;
        cajaCompensacion = 0.4f;
        double value = CalcularAporte(salary, cajaCompensacion);
        rangeValidator();
    }

    public static void rangeValidator(){
        System.out.println("ingrese el salario del empleado: ");
         salary = sc.nextDouble();

        double legalMinSalary = 1300000;

        if(salary > legalMinSalary && salary <= legalMinSalary * 2){
            System.out.println("categoria A");
        } else if (salary > legalMinSalary * 2 && salary <= legalMinSalary * 4) {
            System.out.println("categoria B");
        }else if(salary > 4 * legalMinSalary){
            System.out.println("categoria C");
        }else{
            System.out.println("no  afiliados");
        }
    }

    //Funcion con retorno
    public static void ListBenefits(){
        System.out.println("Seleccione una opcion: "+ "\n" +"1- Categoria A" + "\n"
                + "2- Categoria B" + "\n" + "3- Categoria C" + "\n" + "4- No afiliados");

        int option = sc.nextInt();

        switch (option){
            case 1 :
                System.out.println("Categoria A");
                break;
            case  2 :
                System.out.println("Categoria B");
                break;
            case 3 :
                System.out.println("Categoria C");
                break;
            case 4 :
                System.out.println("No afiliados");
                break;
            default:
                System.out.println("seleccione opcion valida");
        }
    }

    public static double CalcularAporte(double salary, float cajaSupport){
        return salary * cajaSupport;
    }
}
