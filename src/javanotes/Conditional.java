package javanotes;

import java.lang.reflect.Array;
import java.util.*;

public class Conditional {
    public  static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int [] numeros = new int[6];
        int [] numerosUsuarios = new int[6];

        for(int i = 0 ; i < numeros.length; i++){
            int ran = (int)(Math.random()*100+1);
            numeros[i] = ran;
        }

        for(int i = 0 ; i < numerosUsuarios.length; i++){
            System.out.println("ingrese numero " + (i + 1) + ": " );
            numerosUsuarios[i] = sc.nextInt();
        }

        if(!Arrays.equals(numeros, numerosUsuarios)){
            Map<Integer, Integer> numerosRepetidos = new HashMap<>();

            for(int num : numeros){
                numerosRepetidos.put(num, numerosRepetidos.getOrDefault(num, 0) + 1);
            }

            for(int num : numerosUsuarios){
                numerosRepetidos.put(num, numerosRepetidos.getOrDefault(num, 0) + 1);
            }

            for(int contar : numerosRepetidos.values()){
                if(contar > 1){
                    contador++;
                }
            }

            System.out.println("");
            System.out.print("numeros ganadores: ");
            for(int num : numeros){
                System.out.print(num + ", ");
            }

            System.out.println("");
            System.out.print("numeros ingresados: ");
            for(int num : numerosUsuarios){
                System.out.print(num + ", ");
            }
            System.out.println("");
            System.out.print("coincidencias: " + contador +"\n");

            if(contador < 4){
                System.out.println("lo siento, no has ganado nada");
            }
            else if(contador == 4){
                System.out.print("recuperas el valor del ticket");
            } else if (contador == 5) {
                System.out.print("felicidades has ganado el premio de 100.000");
            }

        }else{
            System.out.print("felicidades has ganado el premio mayor de 1.000.000");
        }

    }
}

