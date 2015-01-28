package dojo;

import finder.Finder;

import org.junit.Assert;
import org.junit.Test;

public class FinderTest {

  @Test
  public void oneElementTest() {
    Finder finder = new Finder(1);
    Assert.assertEquals(0, finder.find(1));
  }

  @Test
  public void twoElementTest() {
    Finder finder = new Finder(1, 4);
    Assert.assertEquals(0, finder.find(1));
    Assert.assertEquals(1, finder.find(4));
  }

  @Test
  public void notFoundTest() {
    Finder finder = new Finder(2, 3, 6);
    Assert.assertEquals(-1, finder.find(4));
    Assert.assertEquals(-1, finder.find(1));
    Assert.assertEquals(-1, finder.find(7));
  }

  @Test
  public void emptyTest() {
    Finder finder = new Finder();
    Assert.assertEquals(-1, finder.find(1));
  }
}
