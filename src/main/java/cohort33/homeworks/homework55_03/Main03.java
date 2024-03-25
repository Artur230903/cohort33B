package cohort33.homeworks.homework55_03;

public class Main03 {

  public static void main(String[] args) {
    FashionShop03 fashionShop03 = new FashionShop03();

    FashionItem03 item03Sneakers =
        new FashionItem03("Sneakers", 40, FashionCategory03.SHOES, Season03.SPRING);
    FashionItem03 item03Wintercoat =
        new FashionItem03("Wintercoat", 140, FashionCategory03.CLOTHES, Season03.WINTER);
    FashionItem03 item03Comb =
        new FashionItem03("Comb", 2, FashionCategory03.ACCESSORIES, Season03.AUTUMN);
    FashionItem03 item03Tshort =
        new FashionItem03("Tshort", 4, FashionCategory03.CLOTHES, Season03.SUMMER);

    fashionShop03.addFashionItem03(item03Sneakers);
    fashionShop03.addFashionItem03(item03Wintercoat);
    fashionShop03.addFashionItem03(item03Comb);
    fashionShop03.addFashionItem03(item03Tshort);

    fashionShop03.showSeasonItem(Season03.AUTUMN);
    fashionShop03.showSeasonItem(Season03.WINTER);
    fashionShop03.showSeasonItem(Season03.SPRING);
    fashionShop03.showSeasonItem(Season03.SUMMER);

  }

}
