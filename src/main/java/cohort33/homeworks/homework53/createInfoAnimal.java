package cohort33.homeworks.homework53;

import java.util.ArrayList;
import java.util.List;

public class createInfoAnimal {


  private static List<Animal> animalList53 = new ArrayList<>();

  public static void main(String[] args) {
    createInfoList();
  }

  public static List<Animal> createInfoList() {
    Animal animalElephant = new Animal("Tom", "Mammals", 38);
    Animal animalSnake = new Animal("Marta", "Reptilia", 17);
    Animal animalBird = new Animal("Kescha", "Aves", 2);
    animalList53.add(animalElephant);
    animalList53.add(animalSnake);
    animalList53.add(animalBird);
    return getAnimalList53();
  }

  public static List<Animal> getAnimalList53() {
    return animalList53;
  }
}
