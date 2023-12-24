package cohort33.homeworks.homework42;

public class Sportsman02 {

  private static String name;

  private static int age;

  private static String sport;

  private static int record;

  public Sportsman02(String name, int age, String sport, int record) {
    this.name = name;
    this.age = age;
    this.sport = sport;
    this.record = record;
  }

  public static int updateRecord(String nameForUpdateRecord, int newRecord) {
    if (nameForUpdateRecord.equals(name)) {
      if (newRecord > record) {
        System.out.println("New Record set.");
        record = newRecord;
      } else {
        System.err.println("It is not new Record!");
      }
    }
    return record;
  }

  public static String showThisSportsman() {
    System.out.println("Name = " + name + "; " + "Age = " + age + "; "
        + "Sport = " + sport + "; " + "Record = " + record + ";");
    return " ";
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

  public String getSport() {
    return sport;
  }

  public void setSport(String sport) {
    this.sport = sport;
  }

  public int getRecord() {
    return record;
  }

  public void setRecord(int record) {
    this.record = record;
  }

  @Override
  public String toString() {
    return "Sportsman02{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", sport='" + sport + '\'' +
        ", records=" + record +
        '}';
  }
}
