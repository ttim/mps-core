package jetbrains.mps.core.template.behavior;

/*Generated by MPS */

import jetbrains.mps.core.query.behavior.MqlType_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;

public class MtlNewNodeType_BehaviorDescriptor extends MqlType_BehaviorDescriptor {
  public MtlNewNodeType_BehaviorDescriptor() {
  }

  public boolean virtual_isSubtypeOf_2852142168179579064(SNode thisNode, SNode type) {
    return MtlNewNodeType_Behavior.virtual_isSubtypeOf_2852142168179579064(thisNode, type);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.core.template.structure.MtlNewNodeType";
  }
}
