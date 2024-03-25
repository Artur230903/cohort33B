package cohort33.lessons.lesson56_231202.homework55;

public class CatalogClient {

  public static FashionShop fashionShop = new FashionShop();

  public static void main(String[] args) {

    FashionItem fashionItemWatches =
        new FashionItem("Watches", 2000, FashionCategory.ACCESSORIES,
            Season.ALLSEASONS);
    FashionItem fashionItemCoat =
        new FashionItem("Coat", 250, FashionCategory.CLOTHES, Season.WINTER);
    FashionItem fashionItemBoots = new FashionItem("Boots", 500, FashionCategory.SHOES,
        Season.SPRING);

    fashionShop.addFashionItem(fashionItemWatches);
    fashionShop.addFashionItem(fashionItemCoat);
    fashionShop.addFashionItem(fashionItemBoots);

    int counter = 1;
    System.out.println("-----" + (counter++) + "-----");
    fashionShop.showAboutSeason(Season.SUMMER);
    System.out.println("-----" + (counter++) + "-----");
    fashionShop.showAboutSeason(Season.WINTER);
    System.out.println("-----" + (counter++) + "-----");
    fashionShop.showAboutSeason(Season.SPRING);
    System.out.println("-----" + (counter++) + "-----");
    fashionShop.showAboutSeason(Season.AUTUMN);
    System.out.println("-----" + (counter++) + "-----");
    fashionShop.showAboutSeason(Season.ALLSEASONS);

    System.out.println();

  }
}
