package cohort33.lessons.lesson41_231024_CollectionMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class kakRazpe4atatCollection {

  public static void main(String[] args) {
    Map<String, String> phones = new HashMap<>();

    phones.put("400", "Iphone 14 Max");
    phones.put("124", "Iphone 12");
    phones.put("125", "Samsung Galaxy S21");

    // pervij sposob
    System.out.println("-----1-------");
    for (Map.Entry<String, String> phoneMap : phones.entrySet()) {
      System.out.println(phoneMap.getKey() + " " + phoneMap.getValue());
    }

    // vtoroi sposob
    System.out.println("-----2-------");
    for (String phoneKey : phones.keySet()) {
      System.out.println(phones.get(phoneKey));
    }
    //tretij sposob
    System.out.println("-----3-------");
    Iterator<Entry<String, String>> iteratorPhone = phones.entrySet().iterator();
    while (iteratorPhone.hasNext()) {
      System.out.println(iteratorPhone.next());
    }
    System.out.println("-----4-------");
    phones.forEach((key, value) ->System.out.println(key + " " + value));
  }
}
