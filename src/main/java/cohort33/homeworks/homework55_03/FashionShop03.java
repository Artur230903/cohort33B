package cohort33.homeworks.homework55_03;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Set;

public class FashionShop03 {

  private EnumMap<FashionCategory03, Set<FashionItem03>> prilavok;

  public FashionShop03(){
    prilavok = new EnumMap<>(FashionCategory03.class);
    for (FashionCategory03 fashionCategory03: FashionCategory03.values()){
      prilavok.put(fashionCategory03, new HashSet<>());
    }
  }
  public void addFashionItem03(FashionItem03 fashionItem03){
    prilavok.get(fashionItem03.getFashionCategory03()).add(fashionItem03);
  }
  public void showSeasonItem(Season03 season03){
    for (FashionCategory03 fashionCategory03: FashionCategory03.values()){
      for (FashionItem03 fashionItem03: prilavok.get(fashionCategory03)){
        if (fashionItem03.getSeason03().equals(season03)){
          System.out.println("Category --> " + fashionCategory03);
          System.out.println(fashionItem03);
        }
      }
    }
  }

}
