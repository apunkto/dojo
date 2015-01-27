package suite;

import java.io.IOException;
import model.Birth;
import model.FileType;
import model.Soccer;
import org.junit.Assert;
import org.junit.Test;
import resolver.DojoSolver;
import util.Helper;

public class TestSuite {
  private final Birth birth1 = new Birth(2001, 2, 1);
  private final Birth birth2 = new Birth(2000, 6824, 6243);
  private final Soccer soccer1 = new Soccer("Burnley", 8, 20);
  private final Soccer soccer2 = new Soccer("FC Winners", 100, 1);

  @Test
  public void compareBirths() {
    Assert.assertTrue(birth1.getDiff() > birth2.getDiff());
  }

  @Test
  public void compareSoccers() {
    Assert.assertTrue(soccer1.getDiff() > soccer2.getDiff());
  }

  @Test
  public void readBirth() {
    Assert.assertEquals(birth1, Helper.fromLine("2001;2;1", FileType.BIRTH));
  }

  @Test
  public void readSoccer() {
    Assert.assertEquals(soccer2, Helper.fromLine("2\tFC Winners\t12\t8\t2\t2\t100\t1", FileType.SOCCER));
  }

  @Test
  public void maxFromFile() throws IOException {
    Assert.assertEquals(birth2, DojoSolver.getMaxValue("births.dat", FileType.BIRTH));
    Assert.assertEquals(soccer1, DojoSolver.getMaxValue("soccer.dat", FileType.SOCCER));
  }

}
