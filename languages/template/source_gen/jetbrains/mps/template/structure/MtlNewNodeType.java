package jetbrains.mps.template.structure;

/*Generated by MPS */

import jetbrains.mps.core.query.structure.MqlType;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MtlNewNodeType extends MqlType {
  public static final String concept = "jetbrains.mps.template.structure.MtlNewNodeType";
  public static final String CONCEPT = "concept";

  public MtlNewNodeType(SNode node) {
    super(node);
  }

  public AbstractConceptDeclaration getConcept() {
    return (AbstractConceptDeclaration) this.getReferent(AbstractConceptDeclaration.class, MtlNewNodeType.CONCEPT);
  }

  public void setConcept(AbstractConceptDeclaration node) {
    super.setReferent(MtlNewNodeType.CONCEPT, node);
  }

  public static MtlNewNodeType newInstance(SModel sm, boolean init) {
    return (MtlNewNodeType) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.template.structure.MtlNewNodeType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MtlNewNodeType newInstance(SModel sm) {
    return MtlNewNodeType.newInstance(sm, false);
  }
}
