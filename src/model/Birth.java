package model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Birth implements Diffible {
  public final int year;
  public final int boys;
  public final int girls;

  public double getDiff() {
    return (float) boys / (boys + girls);
  }

}
