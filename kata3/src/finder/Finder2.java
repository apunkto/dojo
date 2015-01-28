package finder;

public class Finder2 {

  public Object find(int element, int... array) {
    
    if (array.length == 0 || array[0] > element || array[array.length - 1] < element) {
      return -1;
    }
    
    int middlePos = array.length / 2;
    int middleElement = array[middlePos];
    if (element == middleElement) {
      return middlePos;
    }
    if (middlePos == 0) {
      return -1;
    }
    if (element < middleElement) {
      return find(element, getSubArray(array, 0, middlePos));
    }

    return find(element, getSubArray(array, middlePos+1, array.length - middlePos));
  }

  public int[] getSubArray(int[] array, int startPos, int length) {
    int[] result = new int[length];
    for (int i = startPos; i < startPos + length; i++) {
      result[i - startPos] = array[i];
    }
    return result;
  }

}
