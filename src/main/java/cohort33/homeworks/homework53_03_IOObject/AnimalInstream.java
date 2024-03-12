package cohort33.homeworks.homework53_03_IOObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class AnimalInstream {

  public void readOjectFromFile(){
    AnimalOutstream animalOutstream = new AnimalOutstream();
    try {
      FileInputStream fileInputStream = new FileInputStream(AnimalOutstream.ourFile());
      ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
      List<Animal> animalList03 = (List<Animal>) objectInputStream.readObject();
      System.out.println(animalList03);
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }

}
