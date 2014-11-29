package resolver;

import static model.FileType.BIRTH;
import static model.FileType.SOCCER;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import model.Diffible;
import model.FileType;
import util.DiffibleComparator;
import util.Helper;

public class DojoSolver {

  private static final String filePath = "c:/work/tartuDojo/data";

  public static Diffible maxFromFile(String fileName, FileType type) throws IOException {
    Path path = Paths.get(filePath, fileName);
    try (Stream<String> lines = Files.lines(path)) {
      return lines.
        skip(1).
        map(line -> Helper.fromLine(line, type)).
        max(new DiffibleComparator()).
        get();
    }
  }

  public static void main(String[] args) {
    try {
      System.out.println("Team with the worst goal diff: " + maxFromFile("soccer.dat", SOCCER));
      System.out.println("The most masculine year: " + maxFromFile("births.dat", BIRTH));
    } catch (IOException e) {
      System.out.println("File read error...");
    }
  }
}
