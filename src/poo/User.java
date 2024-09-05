package poo;

import java.util.Scanner;

public class User {
    Scanner sc = new Scanner(System.in);
    //atributos
    int id, age;
    String name, lastName, gender, phone, address, email, password;
    public User(){}
    public User(int id, String name, String lastName, int age, String gender, String phone, String email, String password){
    }

    //Metodos
    public void create(){
        System.out.println("ingrese el id: ");
        id = sc.nextInt();
        System.out.println("ingrese le nombre: ");
        name = sc.next();
        System.out.println("Ingrese el apellido: ");
        lastName = sc.next();
        System.out.println("Ingrese la edad: ");
        age = sc.nextInt();
        System.out.println("Ingrese el telefono: ");
        phone = sc.next();
        System.out.println("Ingrese el email: ");
        email = sc.next();
        System.out.println("Ingrese la contraseña: ");
        password = sc.next();
    }
    public void select(){}
    public void select(int id){}
    public void update(){}
    public void delete(int id){}
}
