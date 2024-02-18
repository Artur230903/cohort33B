package cohort33.examples.directoryCreation;

import java.io.File;

public class DirCreation {

  public static void main(String[] args) {
    File fileDir = new File("aabbDirTest");

    fileDir.mkdir();

  }

}
