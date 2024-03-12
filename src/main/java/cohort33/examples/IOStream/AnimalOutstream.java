package cohort33.examples.IOStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class AnimalOutstream {

  private static String path =
      "D:\\IntelliJIDEAcohort33\\Projects\\cohort33B\\src\\main\\java\\cohort33"
          + "\\homeworks\\homework53_03_IOObject";

  public static String ourFile() {
    String filePath = (path + File.separator + "Animals.jct");
    return filePath;
  }

  public void writeObjectToFile(List<Animal> animals) throws IOException {
    try {
      FileOutputStream fileOutputStream = new FileOutputStream(ourFile());
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
      objectOutputStream.writeObject(animals);
      objectOutputStream.flush();
    }
       catch(FileNotFoundException e){
        throw new RuntimeException(e);
      }
    catch(IOException exception){
      throw new IOException(exception);
    }


    }

  }
