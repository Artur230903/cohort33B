package cohort33.homeworks.homework53_02_IOToString;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {

  private static List<Animal> animalList = new ArrayList<>();

  public static void main(String[] args) {

    Animal animalBird = new Animal("Kiki", "Bird", 1);
    Animal animalCow = new Animal("Ljuba", "Cow", 3);
    Animal animalFish = new Animal("Somik", "Fish", 2);

    animalList.add(animalBird);
    animalList.add(animalCow);
    animalList.add(animalFish);

    WriteToFile writeToFile = new WriteToFile();
    writeToFile.writerToFile(animalList, writeToFile.pathToFile());

    ReadFromFile readFromFile = new ReadFromFile();
    readFromFile.readFromFile(writeToFile.pathToFile());
  }

}
