package cohort33.lessons.lesson51_231118;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaIOStreams {

  private static final Logger LOGGER = LoggerFactory.getLogger(JavaIOStreams.class);

  private static final String PATH ="D:\\IntelliJ IDEA Community Edition 2023.1.2\\Projects\\cohort33B\\src\\main\\java\\cohort33\\lessons\\lesson51_231118\\inputStreamFile.txt";

  public static void main(String[] args) {
//    InputStream inputStream = null;

    try {
      InputStream inputStream = new FileInputStream(PATH);
      inputStream.close();
    } catch (FileNotFoundException exception){
    LOGGER.error("File {} not found", PATH, exception.getMessage());
    }
    catch (IOException exception){
      LOGGER.error("Close stream error: {}", exception.getMessage());
    }

  }

}
