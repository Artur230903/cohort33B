package cohort33.lessons.lesson60_231216_01_homework59;

public class Student {

  String firstName;

  String lastName;

  int age;

  double averageGrade;

  public Student(String firstName, String lastName, int age, double averageGrade) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.averageGrade = averageGrade;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getAverageGrade() {
    return averageGrade;
  }

  public void setAverageGrade(double averageGrade) {
    this.averageGrade = averageGrade;
  }

  @Override
  public String toString() {
    return "Student --> " +
        "firstName:" + firstName +
        ", lastName:" + lastName +
        ", age:" + age +
        ", averageGrade:" + averageGrade;
  }
}
