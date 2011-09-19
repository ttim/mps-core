package jetbrains.mps.template.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.core.query.structure.MqlExpression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MtlForeachMacro extends MtlNodeMacro {
  public static final String concept = "jetbrains.mps.template.structure.MtlForeachMacro";
  public static final String MULTILINE = "multiline";
  public static final String VAR = "var";
  public static final String COLLECTION = "collection";

  public MtlForeachMacro(SNode node) {
    super(node);
  }

  public boolean getMultiline() {
    return this.getBooleanProperty(MtlForeachMacro.MULTILINE);
  }

  public void setMultiline(boolean value) {
    this.setBooleanProperty(MtlForeachMacro.MULTILINE, value);
  }

  public MtlForeachVar getVar() {
    return (MtlForeachVar) this.getChild(MtlForeachVar.class, MtlForeachMacro.VAR);
  }

  public void setVar(MtlForeachVar node) {
    super.setChild(MtlForeachMacro.VAR, node);
  }

  public MqlExpression getCollection() {
    return (MqlExpression) this.getChild(MqlExpression.class, MtlForeachMacro.COLLECTION);
  }

  public void setCollection(MqlExpression node) {
    super.setChild(MtlForeachMacro.COLLECTION, node);
  }

  public static MtlForeachMacro newInstance(SModel sm, boolean init) {
    return (MtlForeachMacro) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.template.structure.MtlForeachMacro", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MtlForeachMacro newInstance(SModel sm) {
    return MtlForeachMacro.newInstance(sm, false);
  }
}
