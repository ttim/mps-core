package jetbrains.mps.query.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;

public class MqlCondition_BehaviorDescriptor extends MqlBinaryExpr_BehaviorDescriptor {
  public MqlCondition_BehaviorDescriptor() {
  }

  public int virtual_getPriority_5322644393894740165(SNode thisNode) {
    return MqlCondition_Behavior.virtual_getPriority_5322644393894740165(thisNode);
  }

  public int virtual_getAssociativity_5322644393894740267(SNode thisNode) {
    return MqlCondition_Behavior.virtual_getAssociativity_5322644393894740267(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.query.structure.MqlCondition";
  }
}
