package javanotes;

import java.util.Scanner;

public class Variable {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String character = "steve";
        int age;
        System.out.println(character.length());
        System.out.println(character.toLowerCase());
        System.out.println(character.toUpperCase());

        if(character.equals("ste")){
            System.out.println(character);
        }else{
            System.out.println("it is no the same string");
        }

        byte uno = 127;
        //casteo directo
        short data = (short)uno;

        float nota = 4.5f;
        int intnote = (int) nota;

        //dos numero y se requiere el promedio

        int n1 = 58;
        String n2 = "75";
        int nu2 = Integer.parseInt(n2);
        float average = (n1 + nu2) / 2;

        System.out.println("the average is: " + average);

        System.out.println("ingrese su edad: ");
        age = sc.nextInt();

        System.out.println("this is your age: "+ age);
    }
}
