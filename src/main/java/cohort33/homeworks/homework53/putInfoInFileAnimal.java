package cohort33.homeworks.homework53;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class putInfoInFileAnimal {

  private static final Logger LOGGER = LoggerFactory.getLogger(putInfoInFileAnimal.class);

  public static void main(String[] args) {
    try {
      FileOutputStream fileOutputStreamAnimalArray53 = new FileOutputStream(createFileAnimal.createFile());
      ObjectOutputStream objectOutputStream53 = new ObjectOutputStream(fileOutputStreamAnimalArray53);
      objectOutputStream53.writeObject(createInfoAnimal.getAnimalList53());
      objectOutputStream53.flush();
      LOGGER.info("New file {} was created", createFileAnimal.createFile());
      LOGGER.info("Information object was seccefully placed in file {}",  createFileAnimal.createFile());
    } catch (FileNotFoundException exception) {
      throw new RuntimeException(exception);
    } catch (IOException exception) {
      throw new RuntimeException(exception);
    }
  }

}
