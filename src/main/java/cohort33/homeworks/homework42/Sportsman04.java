package cohort33.homeworks.homework42;

import static cohort33.examples.colors.colors.ANSI_BLUE;
import static cohort33.examples.colors.colors.ANSI_RED;
import static cohort33.examples.colors.colors.ANSI_RESET;

public class Sportsman04 {

  private String name04;

  private int age04;

  private String sport04;

  private int records04;

  public Sportsman04(String name04, int age04, String sport04, int records04) {
    this.name04 = name04;
    this.age04 = age04;
    this.sport04 = sport04;
    this.records04 = records04;
  }

  public void showSportsman04() {
    System.out.println(name04 + " " + age04 + " " + sport04 + " " + records04);
  }

  public int setNewRecord04(int newRecord04) {
    if (newRecord04 > records04) {
      System.out.println(ANSI_BLUE + "New record for " + name04 + " is set." + ANSI_RESET);
      records04 = newRecord04;
    } else {
      System.out.println(ANSI_RED + "Not new record for " + name04 + "!" + ANSI_RESET);
    }
    return records04;
  }

  public String getName04() {
    return name04;
  }

  public void setName04(String name04) {
    this.name04 = name04;
  }

  public int getAge04() {
    return age04;
  }

  public void setAge04(int age04) {
    this.age04 = age04;
  }

  public String getSport04() {
    return sport04;
  }

  public void setSport04(String sport04) {
    this.sport04 = sport04;
  }

  public int getRecords04() {
    return records04;
  }

  public void setRecords04(int records04) {
    this.records04 = records04;
  }
}
