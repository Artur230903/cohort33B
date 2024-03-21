package cohort33.homeworks.homework55_EnumMap_EnumSet;

import java.util.EnumMap;
import java.util.Set;

public class Main {

  public static void main(String[] args) {

    EnumMap<FashionCategory, Set<FashionItem>> fashionCategorySetEnumMap =
        new EnumMap<>(FashionCategory.class);
//
//    EnumSet<Season>

    FashionItem itemSneakers =
        new FashionItem("Sneakers", 40, FashionCategory.SHOES, Season.SPRING);
    FashionItem itemWintercoat =
        new FashionItem("Wintercoat", 140, FashionCategory.CLOTHES, Season.WINTER);
    FashionItem itemComb =
        new FashionItem("Comb", 2, FashionCategory.ACCESSORIES, (Season.SUMMER.SPRING.AUTUMN.WINTER));
    FashionItem itemTshort =
        new FashionItem("Tshort", 4, FashionCategory.CLOTHES, Season.SUMMER);

    fashionCategorySetEnumMap.put(FashionCategory.ACCESSORIES, (Set<FashionItem>) itemComb);

    System.out.println(fashionCategorySetEnumMap);

  }

}
