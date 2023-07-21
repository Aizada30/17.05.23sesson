import java.util.Scanner;

public class Student extends Person{

    private String group;

    public Student(String firstName, String lastName, int age, String email, int phoneNumber, String group) {
        super(firstName, lastName, age, email, phoneNumber);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public void parentMethod() {
        System.out.println(toString());
    }

    @Override
    public void getEmailfromParametr(String email) {

    }

    @Override
    public String toString() {
        return "Student: \n" +
                "group:  " + group + '\''+ super.toString();
    }


    }
