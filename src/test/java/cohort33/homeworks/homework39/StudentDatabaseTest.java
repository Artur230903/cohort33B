package cohort33.homeworks.homework39;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentDatabaseTest {

  StudentDatabase studentDatabase;

  @BeforeEach
  public void setUp() {
    studentDatabase = new StudentDatabase();
  }

  @Test
  void addStudent() {
    Student student = new Student(1234, "Marina", 24);
    studentDatabase.addStudent(student);
    int sizeResult = studentDatabase.getAllStudents().size();
    Assertions.assertEquals(1, sizeResult);

  }
//  @Test
//  void addStudentNotDuplicate(){
//    Student student = new Student(1234, "Marina", 24);
//    Student student1 = new Student(1234, "Marina", 24);
//    studentDatabase.addStudent(student);
//    studentDatabase.addStudent(student1);
//    int sizeResult = studentDatabase.getAllStudents().size();
//    Assertions.assertEquals(1,sizeResult);
//  }

  @Test
  void removeStudent() {
    Student student = new Student(1234, "Marina", 24);
    studentDatabase.addStudent(student);
    studentDatabase.removeStudent(student);
    int sizeResult = studentDatabase.getAllStudents().size();
    Assertions.assertEquals(0, sizeResult);

  }

//  @Test
//  void containsStudent() {
//    Student studentMarina = new Student(1234, "Marina", 24);
//    studentDatabase.addStudent(studentMarina);
//    for (Student studentFromList : studentDatabase.getAllStudents()) {
//      Assertions.assertEquals(studentMaria, studentDatabase.getAllStudents());
//    }
//
//  }
}