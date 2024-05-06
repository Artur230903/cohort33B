package cohort33.lessons.lesson60_231216_01_homework59;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentUtil {

  private static Student studentBatman = new Student("John", "Batman", 45, 1.7);
  private static Student studentRobin = new Student("Robin", "Hill", 35, 1.2);
  private static Student studentTerminator = new Student("Arnold", "A-1000", 15, 1.0);

  private static List<Student> studentList;

  public static void main(String[] args) {

    studentList = Arrays.asList(studentBatman, studentRobin, studentTerminator);

    int counterForSeparate = 1;
//    Максимальный и минимальный средний балл: Используйте лямбда-выражения для
//    нахождения студента с максимальным и минимальным средним баллом в группе.
    System.out.println("-----" + (counterForSeparate++) + "-----");
    Student bestStudent = studentList.stream().reduce((studentOne, studentTwo) ->
            studentOne.getAverageGrade() < studentTwo.averageGrade ? studentOne:studentTwo)
        .orElse(null);
    System.out.println("Best student --> " + bestStudent);

    Student worstStudent = studentList.stream().reduce((studentOne, studentTwo) ->
            studentOne.getAverageGrade() > studentTwo.averageGrade ? studentOne:studentTwo)
        .orElse(null);
    System.out.println("Worst student --> " + worstStudent);


    System.out.println("-----" + (counterForSeparate++) + "-----");
//    Сортировка студентов: Используйте лямбда-выражение для сортировки
//    списка студентов по их фамилии.

//    studentList.sort((studentOne, studentTwo)
//        -> studentOne.getLastName().compareTo(studentTwo.getLastName()));

    Collections.sort(studentList, Comparator.comparing(Student::getLastName));
    System.out.println(studentList);

    System.out.println("-----" + (counterForSeparate++) + "-----");
//    Фильтрация списка студентов: Напишите лямбда-выражение, которое фильтрует список студентов,
//    оставляя только тех, у кого средний балл выше определённого значения.
    double averageGradeToCheck = 1.2;
    studentList.stream().filter(student ->
        student.getAverageGrade() >= averageGradeToCheck).toList().forEach(System.out::println);

    System.out.println("-----" + (counterForSeparate++) + "-----");
//    Преобразование списка студентов: Напишите лямбда-выражение для преобразования
//    списка студентов в список их имен.
    List<String> result = studentList.stream().map(Student::getFirstName).toList();
    System.out.println(result);

    System.out.println("-----" + (counterForSeparate++) + "-----");
//    Подсчёт студентов: Создайте лямбда-выражение, которое подсчитывает количество студентов,
//    чей возраст больше заданного.
    int ageToCheck = 20;
    long resultAgeCheck = studentList.stream().filter(student -> student.getAge() > ageToCheck).count();
    System.out.println(resultAgeCheck);

  }

}
