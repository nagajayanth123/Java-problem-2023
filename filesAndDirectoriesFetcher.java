// This Java program helps in printing the name of files and directories which are available in a given directory.

import java.io.File;

class GetFilesFromDirectory {
  public static void main(String[] args) {
    File dirName = new File("D:/eclipse");
    File[] listFiles = dirName.listFiles();

    for (int i = 0; i < listFiles.length; i++) {
      if (listFiles[i].isFile()) {
        System.out.println("File: " + listFiles[i].getName());
      } else if (listFiles[i].isDirectory()) {
        System.out.println("Directory: " + listFiles[i].getName());
      }
    }
  }
}
