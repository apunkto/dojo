package util;

import java.util.Comparator;
import lombok.NoArgsConstructor;
import model.Diffible;

@NoArgsConstructor
public class DiffibleComparator implements Comparator<Diffible> {
  @Override
  public int compare(Diffible s1, Diffible s2) {
    return (int) Math.signum(s1.getDiff() - s2.getDiff());
  }
}