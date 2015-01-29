package dojo;

import finder.BinaryFinder;
import org.junit.Assert;
import org.junit.Test;

public class BinaryFinderTest {

  @Test
  public void oneElementTest() {
    BinaryFinder finder = new BinaryFinder();
    Assert.assertEquals(0, finder.find(1, 1));
  }

  @Test
  public void twoElementTest() {
    BinaryFinder finder = new BinaryFinder();
    Assert.assertEquals(0, finder.find(1, 1, 4));
    Assert.assertEquals(1, finder.find(4, 1, 4));
  }

  @Test
  public void moreElementTest() {
    BinaryFinder finder = new BinaryFinder();
    Assert.assertEquals(11, finder.find(21, 1, 4, 5, 6, 7, 9, 11, 12, 14, 16, 19, 21, 22));
    Assert.assertEquals(1, finder.find(4, 1, 4, 5, 6, 7, 9, 11, 12, 14, 16, 19, 21, 22));
    
  }


  @Test
  public void notFoundTest() {
    BinaryFinder finder = new BinaryFinder();
    Assert.assertEquals(-1, finder.find(4, 1, 2, 7, 8));
    Assert.assertEquals(-1, finder.find(1, 2, 3, 7, 8));
    Assert.assertEquals(-1, finder.find(11, 2, 3, 7, 8));
  }

  @Test
  public void emptyTest() {
    BinaryFinder finder = new BinaryFinder();
    Assert.assertEquals(-1, finder.find(1));
  }

}
