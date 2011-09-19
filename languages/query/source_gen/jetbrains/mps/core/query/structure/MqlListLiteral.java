package jetbrains.mps.core.query.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MqlListLiteral extends MqlExpression {
  public static final String concept = "jetbrains.mps.core.query.structure.MqlListLiteral";
  public static final String ELEMENTS = "elements";

  public MqlListLiteral(SNode node) {
    super(node);
  }

  public int getElementsesCount() {
    return this.getChildCount(MqlListLiteral.ELEMENTS);
  }

  public Iterator<MqlExpression> elementses() {
    return this.children(MqlExpression.class, MqlListLiteral.ELEMENTS);
  }

  public List<MqlExpression> getElementses() {
    return this.getChildren(MqlExpression.class, MqlListLiteral.ELEMENTS);
  }

  public void addElements(MqlExpression node) {
    this.addChild(MqlListLiteral.ELEMENTS, node);
  }

  public void insertElements(MqlExpression prev, MqlExpression node) {
    this.insertChild(prev, MqlListLiteral.ELEMENTS, node);
  }

  public static MqlListLiteral newInstance(SModel sm, boolean init) {
    return (MqlListLiteral) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.core.query.structure.MqlListLiteral", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MqlListLiteral newInstance(SModel sm) {
    return MqlListLiteral.newInstance(sm, false);
  }
}