package poo;

public class Student extends User{
    String studentType;

    public Student(){}
    public Student(int id, String name, String lastName, int age, String gender, String phone, String email, String password, String studentType){
        super(id, name, lastName, age, gender, phone, email, password);
        this.studentType = studentType;
    }

    @Override
    public void create() {
        super.create();
        String [] student = new String[8];
        System.out.println("Ingrese el tipo de estudiante: ");
        studentType = sc.nextLine();
        student [0] = Integer.toString(id);
        student [1] = name;
        student [2] = lastName;
        student [3] = Integer.toString(age);

        System.out.println("datos del estudiante: ");
        for(String count : student){
            System.out.print(count + ", ");
        }
    }

    @Override
    public void select() {
        super.select();
    }
//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
}
