package dojo;

import finder.Finder3;
import org.junit.Assert;
import org.junit.Test;

public class Finder3Test {

  @Test
  public void oneElementTest() {
    Finder3 finder = new Finder3();
    Assert.assertEquals(0, finder.find(1, 1));
  }

  @Test
  public void twoElementTest() {
    Finder3 finder = new Finder3();
    Assert.assertEquals(0, finder.find(1, 1, 4));
    Assert.assertEquals(1, finder.find(4, 1, 4));
  }

  @Test
  public void moreElementTest() {
    Finder3 finder = new Finder3();
    Assert.assertEquals(6, finder.find(11, 1, 4, 5, 6, 7, 9, 11, 12, 14, 16, 19, 21, 22));
  }


  @Test
  public void notFoundTest() {
    Finder3 finder = new Finder3();
    Assert.assertEquals(-1, finder.find(4, 1, 2, 7, 8));
    Assert.assertEquals(-1, finder.find(1, 2, 3, 7, 8));
    Assert.assertEquals(-1, finder.find(11, 2, 3, 7, 8));
  }

  @Test
  public void emptyTest() {
    Finder3 finder = new Finder3();
    Assert.assertEquals(-1, finder.find(1));
  }

}
