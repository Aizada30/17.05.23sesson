import task1.MethodsImpl;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        MethodsImpl methods = new MethodsImpl();

//      Random random = new Random();
//      int baasy = random.nextInt(50,100);

        Map<String, Integer> studetnGrades = new TreeMap<>();
        studetnGrades.put("Aizada", 25);
        studetnGrades.put("Manas", 36);
        studetnGrades.put("Abubakir", 78);
        studetnGrades.put("Munara", 99);
        studetnGrades.put("Bilal", 21);
        studetnGrades.put("Akylai", 100);
        studetnGrades.put("Nurik", 96);
        studetnGrades.put("Daniel", 48);
        studetnGrades.put("Maksat", 36);
        studetnGrades.put("Abdumomun", 10);
        studetnGrades.put("Adil", 96);

        boolean wish = true;
        while (wish) {
            System.out.println("""
                                        
                    1-get students
                    2-get by grade
                    3-search student by name
                    4-serch by grade 
                    5-sort by grade
                    7-get TOPERS
                    12-exit 
                                        
                    """);

            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            switch (num) {
                case 1 -> methods.getAllStudents(studetnGrades);
                case 2 -> methods.getAllStudentWithGrade(studetnGrades);
                case 3 -> {
                    methods.searchStudentByName(studetnGrades);
                }
                case 4 -> {
                    System.out.println("Enter a grade :");
                    int gra = scanner.nextInt();
                    methods.getStudentsByGrade(studetnGrades, gra);
                }
                case 5 -> sortMethod(studetnGrades);
                case 6 -> methods.sortByGrade(studetnGrades);
                case 7 -> methods.getStudentByTopGrade(studetnGrades);
                case 12 -> wish = false;
            }
        }
    }

    public static void sortMethod(Map<String, Integer> student) {
        Comparator<Integer> sortByGrade = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
    }
}

//        Student student = new Student("Aplle ","Jeck",15,"AppleJack@15",+9996," Piano ");
//        Student student1 = new Student("Floter ","Shy",14,"FloterShy@14",+6669,"Zoo");
//        Student student2 = new Student("Twylight ","Sparkl ", 16 , "TwylightSparkl@16",+3356,"Genius");
//        Student student3 = new Student("Pinky ","Pie",15,"PinkyPie@15",+7458,"Pilot");
//        Student[] students = {student,student1,student2,student3};
//
//
//            Teacher teacher = new Teacher("Music ","Teachlover",34,
//                    "teachLover@34",+963852,students);
//
//
//
//        for (int i = 0; i < students.length; i++) {
//            students[i].parentMethod();
//        }
//        teacher.getEmailfromParametr("AppleJack@15");

//        int[] numbers = {5,1,6,3,4};
//        methos(numbers, 0);
//
//    }
//    public static int[] methos(int[] numbers, int s) {
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i+1; j < numbers.length; j++) {
//                if(numbers[i]> numbers[j]){
//                    s=numbers[j];
//                    numbers[i]=numbers[j];
//                   s= numbers[j];
//                }
//            }
//        }
//        System.out.println(Arrays.toString(numbers));
//    return numbers;}}