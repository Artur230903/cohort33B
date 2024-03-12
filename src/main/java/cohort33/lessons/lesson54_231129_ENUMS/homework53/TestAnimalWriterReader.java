package cohort33.lessons.lesson54_231129_ENUMS.homework53;

import java.util.ArrayList;
import java.util.List;

public class TestAnimalWriterReader {

  private static List<Animal> animals = new ArrayList<>();

  public static void main(String[] args) {
    Animal animalHatiko = new Animal("Hatiko", "Dog", 5);
    Animal animalLion = new Animal("Simba", "Lion", 10);
    animals.add(animalHatiko);
    animals.add(animalLion);

    AnimalFileWriter animalFileWriter = new AnimalFileWriter();
    animalFileWriter.saveAnimalsToFile(animals,"animalsHeroes.txt");

//    AnimalFileReader animalFileReader = new AnimalFileReader();
//    animalFileReader.readAnimalsFromFile("animalsHeroes.txt");

  }

}
