package util;

import model.FileType;

import model.Diffible;
import model.Soccer;
import model.Birth;
import lombok.val;

public class Helper {

  public static Diffible fromLine(String line, FileType type) {
    val values = line.split(type.getSeparator());
    switch (type) {
    case SOCCER:
      return new Soccer(values[type.getNamePos()], Integer.valueOf(values[type.getVal1Pos()]), Integer.valueOf(values[type.getVal2Pos()]));
    case BIRTH:
      return new Birth(Integer.valueOf(values[type.getNamePos()]), Integer.valueOf(values[type.getVal1Pos()]),
          Integer.valueOf(values[type.getVal2Pos()]));
    default:
      return null;
    }
  }

}
