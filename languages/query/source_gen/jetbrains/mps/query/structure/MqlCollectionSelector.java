package jetbrains.mps.query.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MqlCollectionSelector extends MqlSelector {
  public static final String concept = "jetbrains.mps.query.structure.MqlCollectionSelector";
  public static final String KIND = "kind";
  public static final String VAR = "var";
  public static final String EXPR = "expr";

  public MqlCollectionSelector(SNode node) {
    super(node);
  }

  public MqlCollectionSelectorKind getKind() {
    String value = super.getProperty(MqlCollectionSelector.KIND);
    return MqlCollectionSelectorKind.parseValue(value);
  }

  public void setKind(MqlCollectionSelectorKind value) {
    super.setProperty(MqlCollectionSelector.KIND, value.getValueAsString());
  }

  public MqlCollectionSelectorVar getVar() {
    return (MqlCollectionSelectorVar) this.getChild(MqlCollectionSelectorVar.class, MqlCollectionSelector.VAR);
  }

  public void setVar(MqlCollectionSelectorVar node) {
    super.setChild(MqlCollectionSelector.VAR, node);
  }

  public MqlExpression getExpr() {
    return (MqlExpression) this.getChild(MqlExpression.class, MqlCollectionSelector.EXPR);
  }

  public void setExpr(MqlExpression node) {
    super.setChild(MqlCollectionSelector.EXPR, node);
  }

  public static MqlCollectionSelector newInstance(SModel sm, boolean init) {
    return (MqlCollectionSelector) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.query.structure.MqlCollectionSelector", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MqlCollectionSelector newInstance(SModel sm) {
    return MqlCollectionSelector.newInstance(sm, false);
  }
}
