package jetbrains.mps.core.structure.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.PropertySupport;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class SPrimitiveTypeKind_PropertySupport extends PropertySupport {
  public boolean canSetValue(String value) {
    if (value == null) {
      return true;
    }
    Iterator<SPrimitiveTypeKind> constants = ListSequence.fromList(SPrimitiveTypeKind.getConstants()).iterator();
    while (constants.hasNext()) {
      SPrimitiveTypeKind constant = constants.next();
      if (value.equals(constant.getName())) {
        return true;
      }
    }
    return false;
  }

  public String toInternalValue(String value) {
    if (value == null) {
      return null;
    }
    Iterator<SPrimitiveTypeKind> constants = ListSequence.fromList(SPrimitiveTypeKind.getConstants()).iterator();
    while (constants.hasNext()) {
      SPrimitiveTypeKind constant = constants.next();
      if (value.equals(constant.getName())) {
        return constant.getValueAsString();
      }
    }
    return null;
  }

  public String fromInternalValue(String value) {
    SPrimitiveTypeKind constant = SPrimitiveTypeKind.parseValue(value);
    if (constant != null) {
      return constant.getName();
    }
    return "";
  }
}
