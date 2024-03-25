package cohort33.homeworks.homework55_02;

public class PrivezliTovar02 {
  private static FashionShop02 fashionShop02 = new FashionShop02();

  public static void main(String[] args) {

    FasionItem02 fasionItem02ZimnjajaObuv = new FasionItem02("ZimnjajaObuv",
        60, FashionCategory02.SHOES02, Season02.WINTER02);
    fashionShop02.addFashionItem02(fasionItem02ZimnjajaObuv);
    System.out.println(fashionShop02.prilavok);
  }

}
