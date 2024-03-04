package cohort33.lessons.lesson53_231126_01_CopyInformatio_RenameFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyUtil {

  public static void main(String[] args) throws IOException {

    File fileSource = new File("password.txt");
    File fileDestination = new File("passwordCopy.txt");
    File fileDestinationNew = new File("passwordNewCopy.txt");


    // нетолько копирует содержимое, но и создает файл
    Files.copy(fileSource.toPath(), fileDestination.toPath(), StandardCopyOption.REPLACE_EXISTING);

    //rename - старое название заменяет на новое
    fileDestination.renameTo(fileDestinationNew);



  }

}
