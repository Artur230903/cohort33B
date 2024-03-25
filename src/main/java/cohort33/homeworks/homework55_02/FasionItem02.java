package cohort33.homeworks.homework55_02;

public class FasionItem02 {

  private String name02;

  private double price02;

  private FashionCategory02 fashionCategory02;

  private Season02 season02;

  public FasionItem02(String name02, double price02, FashionCategory02 fashionCategory02,
      Season02 season02) {
    this.name02 = name02;
    this.price02 = price02;
    this.fashionCategory02 = fashionCategory02;
    this.season02 = season02;
  }

  public String getName02() {
    return name02;
  }

  public void setName02(String name02) {
    this.name02 = name02;
  }

  public double getPrice02() {
    return price02;
  }

  public void setPrice02(double price02) {
    this.price02 = price02;
  }

  public FashionCategory02 getFashionCategory02() {
    return fashionCategory02;
  }

  public void setFashionCategory02(FashionCategory02 fashionCategory02) {
    this.fashionCategory02 = fashionCategory02;
  }

  public Season02 getSeason02() {
    return season02;
  }

  public void setSeason02(Season02 season02) {
    this.season02 = season02;
  }

  @Override
  public String toString() {
    return "name02:" + name02 +
        ", price02:" + price02 +
        ", fashionCategory02:" + fashionCategory02 +
        ", season02:" + season02;
  }

}
