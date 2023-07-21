package task1;

import java.util.*;

public class MethodsImpl implements MethodsMap {
    @Override
    public Map<String, Integer> getAllStudents(Map<String, Integer> student) {
        for (Map.Entry<String, Integer> p : student.entrySet()) {
            System.out.println(p);
        }
        return null;
    }

    @Override
    public Map<String, Integer> getAllStudentWithGrade(Map<String, Integer> student) {
        getAllStudents(student);
        return null;
    }

    @Override
    public Map<String, Integer> searchStudentByName(Map<String, Integer> student) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name of student");
        String nameofStudetn = scan.nextLine();
        for (Map.Entry<String, Integer> o : student.entrySet()) {
            if (o.getKey().equals(nameofStudetn)) {
                System.out.println("Student what you search is " + o);
            }
        }
        return student;
    }

    @Override
    public Map<String, Integer> getStudentsByGrade(Map<String, Integer> student, int grade) {
        for (Map.Entry<String, Integer> g : student.entrySet()) {
            if (g.getValue() == grade) {
                System.out.println("Student what you search by grade " + g);
            }
        }
        return student;
    }

    @Override
    public Map<String, Integer> sortByGrade(Map<String, Integer> student) {
        return null;
    }


    @Override
    public Map<String, Integer> sortStudentsByName(Map<String, Integer> student) {
        System.out.println(student);
        return student;
    }

    @Override
    public Map<String, Integer> getStudentByTopGrade(Map<String, Integer> student) {
        Integer m= 0;
        List<Integer>gradeTop= new ArrayList<>();
        for (Integer a:gradeTop) {
            for (Integer b:gradeTop) {
                if(a>b){
                    m=a;
                    a=b;
                    b=m;
                }
            }
        }

        return student;
    }

    @Override
    public Map<String, Integer> getStudentByLowGrade(Map<String, Integer> student) {
        return null;
    }
}
