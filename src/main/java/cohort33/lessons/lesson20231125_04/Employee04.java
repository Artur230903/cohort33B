package cohort33.lessons.lesson20231125_04;

import java.io.Serializable;

public class Employee04 implements Serializable {

  private static final long serialVersionUID = 1L;

  private int id;

  private String name;

  private int salary;

  public Employee04(int id, String name, int salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }
}
