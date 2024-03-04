package cohort33.homeworks.homework53;

import java.io.Serializable;

public class Animal implements Serializable {

  private static final long serialVersionUID = 1L;

  private String name;

  private String species;

  private int age;

  public Animal(String name, String species, int age) {
    this.name = name;
    this.species = species;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSpecies() {
    return species;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
