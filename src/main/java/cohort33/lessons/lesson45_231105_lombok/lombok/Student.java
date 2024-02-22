package cohort33.lessons.lesson45_231105_lombok.lombok;

import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Student {

  private static final Logger LOGGER = LoggerFactory.getLogger(Student.class);


  private String firstName;

  private String secondName;

  public Student(String firstName, String secondName) {
    this.firstName = firstName;
    this.secondName = secondName;
    LOGGER.info("Student was created");
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getSecondName() {
    return secondName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  @Override
  public String toString() {
    return "Student{" +
        "firstName='" + firstName + '\'' +
        ", secondName='" + secondName + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Student student)) {
      return false;
    }
    return Objects.equals(firstName, student.firstName) && Objects.equals(
        secondName, student.secondName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, secondName);
  }
}
