package cohort33.lessons.lesson56_231202.homework55;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Set;

public class FashionShop {

  private EnumMap<FashionCategory, Set<FashionItem>> catalog;

  public FashionShop() {
    catalog = new EnumMap<>(FashionCategory.class);
    for (FashionCategory category: FashionCategory.values()){
      catalog.put(category, new HashSet<>());
    }
  }
  public  void addFashionItem(FashionItem fashionItem){
    catalog.get(fashionItem.getFashionCategory()).add(fashionItem);
  }

  public void showAboutSeason(Season season){
    for(FashionCategory fashionCategory: FashionCategory.values()){
      for (FashionItem item: catalog.get(fashionCategory)){
        if (item.getSeason().equals(season)){
          System.out.println("Category --> " + fashionCategory);
          System.out.println(item);
        }
      }
    }
  }
}
