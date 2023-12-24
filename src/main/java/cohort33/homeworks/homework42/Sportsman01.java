package cohort33.homeworks.homework42;

public class Sportsman01 {

  private static String name;

  private int age;

  private String sport;

  private static int records;

  public Sportsman01(String name, int age, String sport, int records) {
    this.name = name;
    this.age = age;
    this.sport = sport;
    this.records = records;
  }

  public static void updateRecord(String nameForUpdateRecord, int newRecord) {
    if (nameForUpdateRecord.equals(name)) {
      if (newRecord > records) {
        int records = newRecord;
      } else {
        System.out.println("New record is not bigger");
      }
    }
  }

  public String getName() {
    return name;
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

  public int getRecords() {
    return records;
  }

  public void setRecords(int records) {
    this.records = records;
  }

  @Override
  public String toString() {
    return "Sportsman{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", sport='" + sport + '\'' +
        ", records=" + records +
        '}';
  }

}
