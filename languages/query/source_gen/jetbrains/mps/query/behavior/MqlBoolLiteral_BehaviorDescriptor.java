package jetbrains.mps.query.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.query.runtime.EvaluationEnvironment;
import jetbrains.mps.query.runtime.EvaluationContext;

public class MqlBoolLiteral_BehaviorDescriptor extends MqlExpression_BehaviorDescriptor {
  public MqlBoolLiteral_BehaviorDescriptor() {
  }

  public SNode virtual_getType_228266671027861783(SNode thisNode) {
    return MqlBoolLiteral_Behavior.virtual_getType_228266671027861783(thisNode);
  }

  public Object virtual_evaluate_1671449901154581105(SNode thisNode, EvaluationEnvironment env, EvaluationContext context) {
    return MqlBoolLiteral_Behavior.virtual_evaluate_1671449901154581105(thisNode, env, context);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.query.structure.MqlBoolLiteral";
  }
}
