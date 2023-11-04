package cohort33.homeworks.homework39;

public class Main {

  public static void main(String[] args) {

    StudentDatabase studentDatabase = new StudentDatabase();
    Student student1 = new Student(1234, "Marina", 24);
    Student student2 = new Student(2345, "Vladislav", 38);
    Student student3 = new Student(3456, "Marina", 24);

    studentDatabase.addStudent(student1);
    studentDatabase.addStudent(student2);
    studentDatabase.addStudent(student3);

    studentDatabase.printAllStudents();
    System.out.println("-----------------");

    studentDatabase.removeStudent(student3);

    studentDatabase.printAllStudents();
    System.out.println("-----------------");

    studentDatabase.containsStudent(student2);

  }

}
