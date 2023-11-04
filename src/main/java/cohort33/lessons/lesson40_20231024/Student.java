package cohort33.lessons.lesson40_20231024;

import java.util.Objects;
import java.util.UUID;

public class Student {

  private int id;

  private String name;

  private int age;

  public Student(int id, String name, int age) {
    this.name = name;
    this.age = age;
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Student student)) {
      return false;
    }
    return id == student.id && age == student.age && Objects.equals(name, student.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, age);
  }
}
