package model;

import lombok.Getter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Getter
public enum FileType {

  BIRTH(0, 1, 2, ";"), SOCCER(1, 6, 7, "\t");

  final int namePos;
  final int val1Pos;
  final int val2Pos;
  final String separator;

}
