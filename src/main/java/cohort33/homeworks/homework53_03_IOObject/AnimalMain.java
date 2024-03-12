package cohort33.homeworks.homework53_03_IOObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AnimalMain {

  private static List<Animal> animalList03 = new ArrayList<>();

  public static List<Animal> getAnimalList03() {return List.copyOf(animalList03);}

  public static void main(String[] args) throws IOException {

    Animal animalSlon = new Animal("Katia", "Elephant", 15);
    Animal animalVorobei = new Animal("Kiwi", "Bird", 1);
    Animal animalBulbul = new Animal("Bulbul", "Fish", 3);
    animalList03.add(animalSlon);
    animalList03.add(animalVorobei);
    animalList03.add(animalBulbul);

//    AnimalOutstream animalOutstream = new AnimalOutstream();
//    animalOutstream.writeObjectToFile(animalList03);

    AnimalInstream animalInstream = new AnimalInstream();
    animalInstream.readOjectFromFile();

  }

}
