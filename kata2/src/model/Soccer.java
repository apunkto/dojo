package model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Soccer implements Diffible {
  public final String team;
  public final int goalsFor;
  public final int goalsAgainst;

  public double getDiff() {
    return goalsAgainst - goalsFor;
  }

}
