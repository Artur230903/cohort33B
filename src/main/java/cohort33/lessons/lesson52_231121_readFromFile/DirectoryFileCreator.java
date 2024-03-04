package cohort33.lessons.lesson52_231121_readFromFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DirectoryFileCreator {

  private static final Logger LOGGER = LoggerFactory.getLogger(DirectoryFileCreator.class);

  private static String myDirectory = "MyDirectory";

  private static String createText = "Задайте путь для создаваеммой директории";

  public static void main(String[] args) {

    System.out.println(createText);
    Scanner scanner = new Scanner(System.in);

    String pathToCreate = scanner.nextLine();

    File directoryToCreate = new File(pathToCreate + File.separator + myDirectory);
    String path = pathToCreate + File.separator + myDirectory;
    File resultFile = null;
    if (directoryToCreate.exists()) {
      LOGGER.warn("Создание директории {} невозможно. Она уже существует", path);
      System.out.println("Создание директории " + path + " невозможно. Она уже существует");
    } else {
      boolean created = directoryToCreate.mkdir();
      if (created) {
        LOGGER.info("Директория {} успешно создана", path);
        System.out.println("Директория " + path + " успешно создана");
        resultFile = createFileInDirectory(path, "MyFile.txt");
        if (resultFile != null) {
          System.out.println("Файл успешно создан в директории " + path);
        } else {
          System.out.println("Не удалось создать файл в директории " + path);
        }
      } else {
        LOGGER.info("Директория {} не была создана. Проверьте права.", path);
        System.out.println("Директория " + path + " не была создана.Проверьте права. ");
      }
      if (resultFile != null) {
//        deleteFileAndDirectory(resultFile, directoryToCreate);
      }
    }

  }

  private static File createFileInDirectory(String directory, String fileName) {
    File file = new File(directory + File.separator + fileName);
    try {
      boolean resultFileCreated = file.createNewFile();
      if (resultFileCreated) {
        LOGGER.info("Файл {} в директории {} был успешно создан", fileName, directory);
        return file;
      } else {
        LOGGER.warn("Не удалось создать файл {} в директории {} ", fileName, directory);
        return null;
      }
    } catch (IOException exception) {
      LOGGER.error("Исключение при создании файлф {} в директории {}, описание: {} ", fileName,
          directory, exception.getMessage());
      return null;
    }
  }

  private static boolean deleteFileAndDirectory(File fileToDelete, File directoryToCreate) {
    boolean deleteResult = fileToDelete.delete();
    if (deleteResult) {
      LOGGER.info("Файл {} был успешно удален в директории {}",
          fileToDelete.getName(), fileToDelete.getAbsolutePath());
      directoryToCreate.delete();
      LOGGER.info("Директория {} была успешно удалена", directoryToCreate.getAbsolutePath());
      return true;
    } else {
      LOGGER.info("Файл {} не был успешно удален в директории {}",
          fileToDelete.getName(), fileToDelete.getAbsolutePath());
      return false;

    }
  }

}
