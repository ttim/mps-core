package jetbrains.mps.core.syntax.structure;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;

public enum SPrioKind {
  LEFT("left", 1),
  RIGHT("right", 2),
  NONASSOC("nonassoc", 3);

  private String myName;
  private int myValue;

  SPrioKind(String name, int value) {
    this.myName = name;
    this.myValue = value;
  }

  public String getName() {
    return this.myName;
  }

  public String getValueAsString() {
    return "" + this.myValue;
  }

  public int getValue() {
    return this.myValue;
  }

  public static List<SPrioKind> getConstants() {
    List<SPrioKind> list = ListSequence.fromList(new LinkedList<SPrioKind>());
    ListSequence.fromList(list).addElement(SPrioKind.LEFT);
    ListSequence.fromList(list).addElement(SPrioKind.RIGHT);
    ListSequence.fromList(list).addElement(SPrioKind.NONASSOC);
    return list;
  }

  public static SPrioKind getDefault() {
    return SPrioKind.LEFT;
  }

  public static SPrioKind parseValue(String value) {
    if (value == null) {
      return SPrioKind.getDefault();
    }
    if (value.equals(SPrioKind.LEFT.getValueAsString())) {
      return SPrioKind.LEFT;
    }
    if (value.equals(SPrioKind.RIGHT.getValueAsString())) {
      return SPrioKind.RIGHT;
    }
    if (value.equals(SPrioKind.NONASSOC.getValueAsString())) {
      return SPrioKind.NONASSOC;
    }
    return SPrioKind.getDefault();
  }
}
