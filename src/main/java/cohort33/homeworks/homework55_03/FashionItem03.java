package cohort33.homeworks.homework55_03;

public class FashionItem03 {

  private String name03;

  private double price03;

  private FashionCategory03 fashionCategory03;

  private Season03 season03;

  public FashionItem03(String name03, double price03, FashionCategory03 fashionCategory03,
      Season03 season03) {
    this.name03 = name03;
    this.price03 = price03;
    this.fashionCategory03 = fashionCategory03;
    this.season03 = season03;
  }

  public String getName03() {
    return name03;
  }

  public void setName03(String name03) {
    this.name03 = name03;
  }

  public double getPrice03() {
    return price03;
  }

  public void setPrice03(double price03) {
    this.price03 = price03;
  }

  public FashionCategory03 getFashionCategory03() {
    return fashionCategory03;
  }

  public void setFashionCategory03(FashionCategory03 fashionCategory03) {
    this.fashionCategory03 = fashionCategory03;
  }

  public Season03 getSeason03() {
    return season03;
  }

  public void setSeason03(Season03 season03) {
    this.season03 = season03;
  }

  @Override
  public String toString() {
    return "name:" + name03 +
        ", price:" + price03 +
        ", fashionCategory:" + fashionCategory03 +
        ", season03:" + season03;
  }
}
