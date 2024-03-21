package cohort33.homeworks.homework55_EnumMap_EnumSet;

public class FashionItem {

  private String name;

  private int price;

  private FashionCategory category;

  private Season season;

  public FashionItem(String name, int price, FashionCategory category, Season season) {
    this.name = name;
    this.price = price;
    this.category = category;
    this.season = season;
  }
}
