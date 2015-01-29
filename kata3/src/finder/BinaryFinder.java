package finder;

import lombok.Data;

public class BinaryFinder {

  public Object find(int element, int... array) {

    if (array.length == 0 || array[0] > element || array[array.length - 1] < element) {
      return -1;
    }

    int begin = 0;
    int end = array.length - 1;
    ItemFinder calc = new ItemFinder(begin, end, array, element);

    do {
      calc.findElement();
    } while (calc.isNotResolved());

    return calc.getResult();
  }

  @Data
  public class ItemFinder {
    private int begin;
    private int end;
    private int[] array;
    private int element;

    private int result = -1;

    public ItemFinder(int begin, int end, int[] array, int element) {
      this.begin = begin;
      this.end = end;
      this.array = array;
      this.element = element;
    }

    public boolean isNotResolved() {
      return result == -1 && getBegin() <= getEnd();
    }

    public void findElement() {
      int middlePos = begin + (end - begin) / 2;
      int middleElement = array[middlePos];
      
      if (element == middleElement) {
        result = middlePos;
        return;
      }
      
      if (element < middleElement) {
        setEnd(middlePos - 1);
        return;
      }
    
      setBegin(middlePos + 1);

    }
  }

}
