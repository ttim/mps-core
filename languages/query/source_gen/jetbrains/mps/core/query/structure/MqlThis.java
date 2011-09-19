package jetbrains.mps.core.query.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MqlThis extends MqlExpression {
  public static final String concept = "jetbrains.mps.core.query.structure.MqlThis";

  public MqlThis(SNode node) {
    super(node);
  }

  public static MqlThis newInstance(SModel sm, boolean init) {
    return (MqlThis) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.core.query.structure.MqlThis", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MqlThis newInstance(SModel sm) {
    return MqlThis.newInstance(sm, false);
  }
}