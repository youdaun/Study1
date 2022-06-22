package stream.service;

import stream.vo.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <pre>
 * Statemnts
 * </pre>
 *
 * @ClassName   : Test.java
 * @Description  :
 * @author : user
 * @since 2022-06-22
 * @version 1.0
 * @see
 * @Modification Information
 * <pre>
 * since                 author                           description
 * =============== ================= =========================================
 * 2022-06-22 user                 최초생성
 * </pre>
 */
public class Test {

    public static void main(String[] args) {
        /*
        ArrayList<Student> student = new ArrayList<>();
        student.add(new Student(100, "Yang"));
        student.add(new Student(80, "Cho"));
        student.add(new Student(60, "Yan"));

        student.stream()
                        .filter(s->s.getScore() > 70)
                        .forEach(s-> System.out.println(s.getStudentNm()));
        System.out.println("--------------------------------------------------");

        List<String> list = Arrays.asList("Yanghayan", "Thanggu", "bory");

        List<String> newList = list.stream()
                        .filter(p -> p.length() > 5)
                        .map(p -> "[" + p + "]")
                        .collect(Collectors.toList());

        newList.forEach(System.out::println);*/
        System.out.println("--------------------------------------------------");

        ArrayList<Student> student = new ArrayList<>();
        student.add(new Student(100, "Yang"));
        student.add(new Student(100, "Cho"));
        student.add(new Student(80, "Lee"));
        student.add(new Student(60, "ha"));
        student.add(new Student(0, "yan"));

        Map<Integer, List<Student>> map = student.stream()
                        .collect(Collectors.groupingBy(Student::getScore));

        List<Student> perfect = map.get(100);
        perfect.forEach(s-> System.out.println(s.getStudentNm()));

    }
}
