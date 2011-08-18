package jetbrains.mps.query.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MqlType extends BaseConcept {
  public static final String concept = "jetbrains.mps.query.structure.MqlType";

  public MqlType(SNode node) {
    super(node);
  }

  public static MqlType newInstance(SModel sm, boolean init) {
    return (MqlType) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.query.structure.MqlType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MqlType newInstance(SModel sm) {
    return MqlType.newInstance(sm, false);
  }
}
