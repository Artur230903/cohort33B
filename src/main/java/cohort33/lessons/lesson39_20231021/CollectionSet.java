package cohort33.lessons.lesson39_20231021;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionSet {

  public static void main(String[] args) {

    int initialCapacity = 10;
    float loadFactor = 50;

    List<String> stringList = new ArrayList<>();
    stringList.add("Audi");
    stringList.add("VW");
    stringList.add("Audi");


//    Set<String> stringSet = new HashSet<>(initialCapacity, loadFactor);
    Set<String> stringSet = new HashSet<>();
    Set<String> stringSetInitialCapacity = new HashSet<>(30);
    Set<String> stringSetInitialCapacityLoadFactor = new HashSet<>(20, 0.9f);
    Set<String> stringSetCollectionList = new HashSet<>(stringList);

    stringSet.add("Alex");
    stringSet.add("Anna");
    stringSet.add("Max");
    stringSet.add("Maxim");
    stringSet.add("O");
    stringSet.add("A");

    for (String name : stringSet) {
      System.out.println(name);
      System.out.println(name.hashCode());
    }
    System.out.println(stringSet.toString());

    System.out.println("----------------------");

    stringSet.remove("Maxim");

    stringSet.clear();

    System.out.println("------ ----------------");
    stringSet.add("Alex");


    for (String name : stringSet) {
      System.out.println(name);
      System.out.println(name.hashCode());
    }
    System.out.println(stringSet.toString());

//    System.out.println("----------------------");
//
//    Iterator<String> iterator = stringSet.iterator();
//    while (iterator.hasNext()) {
//      System.out.println(iterator.next());
//    }
//
//    System.out.println(stringSet.size());
//    System.out.println(stringSet.isEmpty());
//
//    stringSet.remove("Max");
//    System.out.println(stringSet.size());
//
//    stringSet.clear();
//    System.out.println(stringSet.size());
//    System.out.println(stringSet.isEmpty());
//
//    System.out.println("----------------------");
//    System.out.println(stringSet.contains("Max"));
//
  }

}
