package cohort33.homeworks.homework42;

import static cohort33.examples.colors.colors.ANSI_GREEN;
import static cohort33.examples.colors.colors.ANSI_RED;
import static cohort33.examples.colors.colors.ANSI_RESET;

public class Sportsman05 {

  private String name05;

  private int age05;

  private String sport05;

  private int records05;

  public Sportsman05(String name05, int age05, String sport05, int records05) {
    this.name05 = name05;
    this.age05 = age05;
    this.sport05 = sport05;
    this.records05 = records05;
  }

  public int updateRecord05(int newRecord05) {
    if (newRecord05 > records05) {
      System.out.println(ANSI_GREEN + "New record set!" + ANSI_RESET);
      records05 = newRecord05;
    } else {
      System.out.println(ANSI_RED + "For " + name05 + " it is not new record!" + ANSI_RESET);
    }
    return records05;
  }
  public void showSportsman05(){
    System.out.println(name05 + " " + age05 + " " + sport05 + " " + records05);
  }

  public String getName05() {
    return name05;
  }

  public void setName05(String name05) {
    this.name05 = name05;
  }

  public int getAge05() {
    return age05;
  }

  public void setAge05(int age05) {
    this.age05 = age05;
  }

  public String getSport05() {
    return sport05;
  }

  public void setSport05(String sport05) {
    this.sport05 = sport05;
  }

  public int getRecords05() {
    return records05;
  }

  public void setRecords05(int records05) {
    this.records05 = records05;
  }
}
