package cohort33.examples.IOString;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TestAnimalWriterReader {

  private static List<Animal> animals = new ArrayList<>();

  public static void main(String[] args) {
    String pathToFile = "D:\\IntelliJIDEAcohort33\\Projects\\cohort33B\\src"
        + "\\main\\java\\cohort33\\examples\\IOString";

    Animal animalHatiko = new Animal("Hatiko", "Dog", 5);
    Animal animalLion = new Animal("Simba", "Lion", 10);
    animals.add(animalHatiko);
    animals.add(animalLion);

    AnimalFileWriter animalFileWriter = new AnimalFileWriter();
    animalFileWriter.saveAnimalsToFile(animals,pathToFile + File.separator + "animalsHeroes.txt");

    AnimalFileReader animalFileReader = new AnimalFileReader();
    animalFileReader.readAnimalsFromFile(pathToFile + File.separator + "animalsHeroes.txt");

  }

}
