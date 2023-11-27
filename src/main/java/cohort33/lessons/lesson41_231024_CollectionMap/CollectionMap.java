package cohort33.lessons.lesson41_231024_CollectionMap;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class CollectionMap {

  public static void main(String[] args) {
    Map<String, String> phones = new HashMap<>();

    phones.put("123", "Iphone 14 Max");
    phones.put("124", "Iphone 12");
    phones.put("125", "Samsung Galaxy S21");

    System.out.println(phones.get("123"));
    System.out.println(phones.get("124"));
    System.out.println(phones.get("125"));

    phones.put("126", "Samsung Galaxy S21");
    System.out.println(phones.get("126"));

    phones.put(null, "Samsung Galaxy S28");
    System.out.println(phones.get("126"));
    System.out.println(phones.get(null));

    phones.put("123", "Iphone 15 Max");
    System.out.println(phones.get("123"));

    System.out.println(phones.size());

    System.out.println(phones);

  }

}
