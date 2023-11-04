package cohort33.homeworks.homework39;

import java.util.HashSet;
import java.util.Set;

public class StudentDatabase {

  Set<Student> studentsDatabase = new HashSet<>();

  public void addStudent(Student student) {
    studentsDatabase.add(student);
  }

  public void removeStudent(Student student) {
    studentsDatabase.remove(student);
  }

  public void containsStudent(Student student) {
    System.out.println(studentsDatabase.contains(student));
  }

  public void printAllStudents() {
    for (Student student : studentsDatabase) {
      System.out.println(student.getId() + " " + student.getName() + " " + student.getAge());
    }

  }

  public Set<Student> getAllStudents() {
    return studentsDatabase;

  }

}
