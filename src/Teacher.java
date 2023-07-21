import java.util.Arrays;

public class Teacher extends Person{

    private Student[] students;

    public Teacher(String firstName, String lastName, int age, String email, int phoneNumber, Student[] students) {
        super(firstName, lastName, age, email, phoneNumber);
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    @Override
    public void parentMethod() {
        getStudents();
        System.out.println(getFirstName()+" is a teacher , and she love her student: "+students[0] );

    }

    @Override
    public void getEmailfromParametr(String email) {
        System.out.println("-----You are looking for a student-----");
        for (int i = 0; i <students.length; i++) {
            if(email.equals(students[i].getEmail())){
                System.out.println(students[i].toString());
            }
        }

    }

    @Override
    public String toString() {
        return "Teacher: \n" +
                "students: " + Arrays.toString(students) + super.toString();
    }
}
