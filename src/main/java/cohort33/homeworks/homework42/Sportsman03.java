package cohort33.homeworks.homework42;

public class Sportsman03 {

  private String name;

  private int age;

  private String sport;

  private int records;

  public Sportsman03(String name, int age, String sport, int records) {
    this.name = name;
    if (age >= 18 && age <=59){
      System.out.println("Age is OK");
      this.age = age;
    }else {
      System.out.println("Age is illegal for competition");
    }
    this.sport = sport;
    this.records = records;
  }

  public int setNewRecord( int newRecord) {
    if (newRecord > records) {
      System.out.println("New record set.");
      records = newRecord;
    } else {
      System.out.println("Not new record!");
    }
    return records;
  }
  public String showSportsman(){
    System.out.println(name + " " + age + " " + sport + " " + records);
    return " ";
  }

  @Override
  public String toString() {
    return "Sportsman03{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", sport='" + sport + '\'' +
        ", records=" + records +
        '}';
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

  public int getRecords() {
    return records;
  }

  public void setRecords(int records) {
    this.records = records;
  }

}
