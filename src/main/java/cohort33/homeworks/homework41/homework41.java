package cohort33.homeworks.homework41;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class homework41 {

  public static void main(String[] args) {
    System.out.println("-----ArrayList-----");

    ArrayList<String> countriesList = new ArrayList<>();

    countriesList.add("USA");
    countriesList.add("GB");
    countriesList.add("FR");
    countriesList.add("CZ");
    countriesList.add("DE");
    countriesList.add("FR");

    System.out.println(countriesList.size());
    System.out.println(countriesList);

    countriesList.remove("FR");
    System.out.println(countriesList);

    countriesList.remove(4);
    System.out.println(countriesList);

    System.out.println();
    System.out.println("-----HashSet-----");

    HashSet<String> countriesSet = new HashSet<>();

    countriesSet.add("USA");
    countriesSet.add("GB");
    countriesSet.add("FR");
    countriesSet.add("CZ");
    countriesSet.add("DE");
    countriesSet.add("FR");

    System.out.println(countriesSet);

    countriesSet.remove("FR");

    System.out.println(countriesSet);

    System.out.println();
    System.out.println("-----HashMap-----");

    HashMap<String, String> capitalMap = new HashMap<>();

    capitalMap.put("CZ", "Praha");
    capitalMap.put("USA", "Washington");
    capitalMap.put("GB", "London");
    capitalMap.put("FR", "Pari");
    capitalMap.put("DE", "Berlin");

    System.out.println(capitalMap.size());
    System.out.println(capitalMap);
    System.out.println(capitalMap.get("FR"));
    System.out.println(capitalMap.entrySet());

    for (Map.Entry<String, String> printMap : capitalMap.entrySet()) {
      System.out.println("|| " + printMap.getKey() + " " + printMap.getValue());
    }
    System.out.println();
    capitalMap.replace("USA", "San-Francisco");
    for (Map.Entry<String, String> printMap : capitalMap.entrySet()) {
      System.out.println("|| " + printMap.getKey() + " " + printMap.getValue());
    }
    System.out.println();
    System.out.println("-----4-----");

    System.out.println(countriesSet.contains("Spain"));
    System.out.println(capitalMap.containsKey("Spain"));
    System.out.println(capitalMap.containsValue("Madrid"));

    System.out.println();
    countriesSet.add("Spain");
    System.out.println(countriesSet);

    System.out.println();
    capitalMap.put("Spain", "Madrid");
    for (Map.Entry<String,String> printMap : capitalMap.entrySet()){
      System.out.println("|| " + printMap.getKey() + " " + printMap.getValue());
    }


  }

}
