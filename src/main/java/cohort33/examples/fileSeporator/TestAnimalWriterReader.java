package cohort33.examples.fileSeporator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TestAnimalWriterReader {

  private static List<Animal> animals = new ArrayList<>();

  private static String path = "D:\\IntelliJIDEAcohort33\\Projects\\cohort33B"
      + "\\src\\main\\java\\cohort33\\examples\\fileSeporator";

  public static void main(String[] args) {
    Animal animalHatiko = new Animal("Hatiko", "Dog", 5);
    Animal animalLion = new Animal("Simba", "Lion", 10);
    animals.add(animalHatiko);
    animals.add(animalLion);

    AnimalFileWriter animalFileWriter = new AnimalFileWriter();
    animalFileWriter.saveAnimalsToFile(animals,path + File.separator + "animalsHeroes.txt");

  }

}
