package cohort33.homeworks.homework53;

import java.io.File;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class createFileAnimal {

  private static final Logger LOGGER = LoggerFactory.getLogger(createFileAnimal.class);

  private static String pathToDir = "D:\\IntelliJIDEAcohort33\\Projects\\cohort33B\\src"
      + "\\main\\java\\cohort33\\homeworks\\homework53";

  public static void main(String[] args) {
    createFile();
  }

  public static File createFile(){
    File fileAnimal = new File(pathToDir + File.separator + "fileAnimal.jct");
    try {
      fileAnimal.createNewFile();
//      LOGGER.info("New file {} was created", fileAnimal);
    } catch (IOException exception) {
      LOGGER.error("Error in data processing. Fail: {}, exception: {}", pathToDir,
          exception.getMessage());
    }
    return fileAnimal;
  }

  public static String getPathToFile() {
    return (pathToDir + File.separator + "fileAnimal.jct");
  }
}
