package school.management.system;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Teacher satya = new Teacher(1,"satya",500);
        Teacher vipula = new Teacher(2,"vipula",700);
        Teacher varshu = new Teacher(3,"Varshu",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(satya);
        teacherList.add(vipula);
        teacherList.add(varshu);


        Student Rahul = new Student(1,"rahul",4);
        Student chakri = new Student(2,"chakri",12);
        Student manoj = new Student(3,"manoj",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Rahul);
        studentList.add(manoj);
        studentList.add(chakri);




        School Narayana = new School(teacherList,studentList);

        Teacher ravi = new Teacher(6,"ravi", 900);

        Narayana.addTeacher(ravi);


        Rahul.payFees(5000);
        chakri.payFees(6000);
        System.out.println("GHS has earned $"+ Narayana.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        satya.receiveSalary(satya.getSalary());
        System.out.println("Narayana has spent for salary to " + satya.getName()
        +" and now has $" + Narayana.getTotalMoneyEarned());

        varshu.receiveSalary(varshu.getSalary());
        System.out.println("Narayana has spent for salary to " + varshu.getName()
                +" and now has $" + Narayana.getTotalMoneyEarned());


        System.out.println(chakri);

        vipula.receiveSalary(vipula.getSalary());

        System.out.println(vipula);


    }
}
