package javanotes;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Conditional {
    public  static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int acumulador = 0;
        int [] numeros = new int[6];
        int [] numerosUsuarios = new int[6];

        for(int i = 0 ; i < numeros.length; i++){
            int ran = (int)(Math.random()*10+1);
            numeros[i] = ran;
        }
       // for (int i = 0 ; i < numeros.length; i++){
         //   System.out.println("numeros ganadores: " + numeros[i] + "\n");
       // }

        for(int i = 0 ; i < numerosUsuarios.length; i++){
            System.out.println("ingrese numero " + (i + 1) + ": " );
            numerosUsuarios[i] = sc.nextInt();
        }
       // for(int i = 0 ; i < numerosUsuarios.length; i++){
         //   System.out.println("numeros ingresados: " + numerosUsuarios[i] + "\n");
       // }

        for(int i = 0 ; i < numerosUsuarios.length; i++){
            if(numerosUsuarios[i] == numeros[1] || numerosUsuarios[i] == numeros[2] || numerosUsuarios[i] == numeros[3]
                    || numerosUsuarios[i] == numeros[4] || numerosUsuarios[i] == numeros[0]){

            }
        for(int j = 0 ; j < numerosUsuarios.length; j++){
                System.out.println(numeros[j]);
        }
    }
}
