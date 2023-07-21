package task1;

import java.util.Map;

public interface MethodsMap {

    Map<String, Integer> getAllStudents(Map<String,Integer>student);

    Map<String, Integer> getAllStudentWithGrade(Map<String,Integer>student);

    Map<String, Integer> searchStudentByName(Map<String,Integer>student);

    Map<String, Integer> getStudentsByGrade(Map<String,Integer>student,int grade);

    Map<String, Integer> sortByGrade(Map<String,Integer>student);

    Map<String, Integer> sortStudentsByName(Map<String,Integer>student);

    Map<String, Integer> getStudentByTopGrade(Map<String,Integer>student);

    Map<String, Integer> getStudentByLowGrade(Map<String,Integer>student);
}
