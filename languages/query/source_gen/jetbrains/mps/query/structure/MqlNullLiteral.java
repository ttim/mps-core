package jetbrains.mps.query.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MqlNullLiteral extends MqlExpression {
  public static final String concept = "jetbrains.mps.query.structure.MqlNullLiteral";

  public MqlNullLiteral(SNode node) {
    super(node);
  }

  public static MqlNullLiteral newInstance(SModel sm, boolean init) {
    return (MqlNullLiteral) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.query.structure.MqlNullLiteral", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MqlNullLiteral newInstance(SModel sm) {
    return MqlNullLiteral.newInstance(sm, false);
  }
}
