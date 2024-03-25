package cohort33.homeworks.homework55_01_EnumMap_EnumSet;

import java.util.EnumMap;
import java.util.Set;

public class Main {

  public static void main(String[] args) {

    EnumMap<FashionCategory03, Set<FashionItem03>> fashionCategorySetEnumMap =
        new EnumMap<>(FashionCategory03.class);
//
//    EnumSet<Season>

    FashionItem03 itemSneakers =
        new FashionItem03("Sneakers", 40, FashionCategory03.SHOES, Season03.SPRING);
    FashionItem03 itemWintercoat =
        new FashionItem03("Wintercoat", 140, FashionCategory03.CLOTHES, Season03.WINTER);
    FashionItem03 itemComb =
        new FashionItem03("Comb", 2, FashionCategory03.ACCESSORIES, (Season03.SUMMER.SPRING.AUTUMN.WINTER));
    FashionItem03 itemTshort =
        new FashionItem03("Tshort", 4, FashionCategory03.CLOTHES, Season03.SUMMER);

    fashionCategorySetEnumMap.put(FashionCategory03.ACCESSORIES, (Set<FashionItem03>) itemComb);

    System.out.println(fashionCategorySetEnumMap);

  }

}
