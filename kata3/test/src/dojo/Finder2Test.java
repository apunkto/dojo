package dojo;

import finder.Finder2;
import org.junit.Assert;
import org.junit.Test;

public class Finder2Test {

  @Test
  public void oneElementTest() {
    Finder2 finder = new Finder2();
    Assert.assertEquals(0, finder.find(1, 1));
  }

  @Test
  public void twoElementTest() {
    Finder2 finder = new Finder2();
    Assert.assertEquals(0, finder.find(1, 1, 4));
    Assert.assertEquals(1, finder.find(4, 1, 4));
  }

  @Test
  public void moreElementTest() {
    Finder2 finder = new Finder2();
    Assert.assertEquals(6, finder.find(11, 1, 4, 5, 6, 7, 9, 11, 12, 14, 16, 19, 21, 22));
  }

  @Test
  public void subArrayTest() {
    Finder2 finder = new Finder2();
    Assert.assertArrayEquals(new int[] { 1, 2 }, finder.getSubArray(new int[] { 1, 2, 3 }, 0, 2));
    Assert.assertArrayEquals(new int[] { 5, 6, 7 }, finder.getSubArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 4, 3));
  }

  @Test
  public void notFoundTest() {
    Finder2 finder = new Finder2();
    Assert.assertEquals(-1, finder.find(4, 1, 2, 7, 8));
    Assert.assertEquals(-1, finder.find(1, 2, 3, 7, 8));
    Assert.assertEquals(-1, finder.find(11, 2, 3, 7, 8));
  }

  @Test
  public void emptyTest() {
    Finder2 finder = new Finder2();
    Assert.assertEquals(-1, finder.find(1));
  }

}
