package jetbrains.mps.query.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MqlClosure extends MqlExpression {
  public static final String concept = "jetbrains.mps.query.structure.MqlClosure";
  public static final String BODY = "body";
  public static final String PARAMETERS = "parameters";

  public MqlClosure(SNode node) {
    super(node);
  }

  public MqlExpression getBody() {
    return (MqlExpression) this.getChild(MqlExpression.class, MqlClosure.BODY);
  }

  public void setBody(MqlExpression node) {
    super.setChild(MqlClosure.BODY, node);
  }

  public int getParametersesCount() {
    return this.getChildCount(MqlClosure.PARAMETERS);
  }

  public Iterator<MqlParameter> parameterses() {
    return this.children(MqlParameter.class, MqlClosure.PARAMETERS);
  }

  public List<MqlParameter> getParameterses() {
    return this.getChildren(MqlParameter.class, MqlClosure.PARAMETERS);
  }

  public void addParameters(MqlParameter node) {
    this.addChild(MqlClosure.PARAMETERS, node);
  }

  public void insertParameters(MqlParameter prev, MqlParameter node) {
    this.insertChild(prev, MqlClosure.PARAMETERS, node);
  }

  public static MqlClosure newInstance(SModel sm, boolean init) {
    return (MqlClosure) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.query.structure.MqlClosure", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MqlClosure newInstance(SModel sm) {
    return MqlClosure.newInstance(sm, false);
  }
}