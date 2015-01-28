package finder;

public class Finder {

  private int[] array;

  public Finder(int... array) {
    this.array = array;
  }

  public int find(int element) {
    int result = -1;

    if (array.length == 0 || array[0] > element || array[array.length - 1] < element) {
      return -1;
    }

    for (int pos = 0; pos < array.length && result == -1; pos++) {
      result = checkPosition(element, pos);
    }

    return result;
  }

  private int checkPosition(int element, int pos) {
    return (element == array[pos]) ? pos : -1;
  }

}
