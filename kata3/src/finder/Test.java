package finder;

public class Test {
  public static void main(String[] args) {
    for (int i = 1; i < 10; i++) {
      writeRow(i);
    }
  }

  private static void writeRow(int i) {
    //0
    for (int j = 1; j < 10; j++) {
      System.out.print( i * j+"\t");
    }
    System.out.println();
  }
  
  public String getKood() {
    if(isEstonian()){
      return getIsikukood();
    }else{
      return getValismaalaseKood();
    }
  }

  private boolean isEstonian() {
    // TODO Auto-generated method stub
    return false;
  }

  private String getIsikukood() {
    // TODO Auto-generated method stub
    return null;
  }

  private String getValismaalaseKood() {
    // TODO Auto-generated method stub
    return null;
  }
}
