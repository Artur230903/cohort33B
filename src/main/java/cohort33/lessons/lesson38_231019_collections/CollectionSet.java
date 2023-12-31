package cohort33.lessons.lesson38_231019_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {

  public static void main(String[] args) {

    int initialCapacity = 10;
    float loadFactor = 50;

//    Set<String> stringSet = new HashSet<>(initialCapacity, loadFactor);
    Set<String> stringSet = new HashSet<>();

    stringSet.add("Alex");
    stringSet.add("Anna");
    stringSet.add("Max");
    stringSet.add(null);

    for (String name : stringSet) {
      System.out.println(name);
    }

    System.out.println("----------------------");

    Iterator<String> iterator = stringSet.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    System.out.println(stringSet.size());
    System.out.println(stringSet.isEmpty());

    stringSet.remove("Max");
    System.out.println(stringSet.size());

    stringSet.clear();
    System.out.println(stringSet.size());
    System.out.println(stringSet.isEmpty());

    System.out.println("----------------------");
    System.out.println(stringSet.contains("Max"));

  }

}
