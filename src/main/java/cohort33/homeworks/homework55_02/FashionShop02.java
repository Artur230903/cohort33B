package cohort33.homeworks.homework55_02;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Set;

public class FashionShop02 {

  EnumMap<FashionCategory02, Set<FasionItem02>> prilavok;

  public FashionShop02(){
   prilavok = new EnumMap<>(FashionCategory02.class);
   for (FashionCategory02 category02: FashionCategory02.values()){
     prilavok.put(category02, new HashSet<>());
   }
  }
  public void addFashionItem02(FasionItem02 fasionItem02){
    prilavok.get(fasionItem02.getFashionCategory02()).add(fasionItem02);
  }

  public void showSeasonItems02(Season02 season02){
    for (FashionCategory02 fashionCategory02: FashionCategory02.values()){
      for (FasionItem02 fasionItem02 : prilavok.get(fashionCategory02)){
        if (fasionItem02.getFashionCategory02().equals(fashionCategory02)){
          System.out.println(fasionItem02);
        }
      }
    }
  }

}
