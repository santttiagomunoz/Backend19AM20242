package exercises;

import java.util.Scanner;

public class Registro {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String name, lastName, email, password, phone, confirmEmail, confirmPassword;
        int id;

        System.out.println("------> crear usuario");
        System.out.println("ingrese su id: ");
        id = sc.nextInt();
        System.out.println("ingrese su nombre: ");
        name = sc.next();
        System.out.println("ingrese su apellido: ");
        lastName = sc.next();
        System.out.println("ingrese su numero: ");
        phone = sc.next();
        System.out.println("ingrese su email: ");
        email= sc.next();
        System.out.println("ingrese su password");
        password = sc.next();

        System.out.println("nombre: " + name + "\n" + "apellido: " + lastName +"\n" + "numero: " + phone + "\n" + "email: " + email);

        System.out.println("------> inicio de sesion");
        System.out.println("ingrese su email de nuevo: ");
        confirmEmail = sc.next();
        System.out.println("ingrese su password: ");
        confirmPassword = sc.next();
        
        while(!email.equals(confirmEmail) || !password.equals(confirmPassword)){
            System.out.println("email o contraseña incorrecta");
            System.out.println("ingrese su email de nuevo: ");
            confirmEmail = sc.next();
            System.out.println("ingrese su password: ");
            confirmPassword = sc.next();
            if(email.equals(confirmEmail) && password.equals(confirmPassword)){
                System.out.println("sesion iniciada");
                break;
            }
        }

    }
}
