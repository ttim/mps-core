package jetbrains.mps.core.query.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.core.query.runtime.EvaluationEnvironment;
import jetbrains.mps.core.query.runtime.EvaluationContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class MqlAssignment_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getType_228266671027861783(SNode thisNode) {
    return MqlExpression_Behavior.call_getType_228266671027861783(SLinkOperations.getTarget(thisNode, "value", true));
  }

  public static int virtual_getPriority_7352592509980890960(SNode thisNode) {
    return 14;
  }

  public static Object virtual_evaluate_1671449901154581105(SNode thisNode, EvaluationEnvironment env, EvaluationContext context) {
    Object result = env.evaluate(SLinkOperations.getTarget(thisNode, "value", true), context, true);
    context.setValue(SPropertyOperations.getString(SLinkOperations.getTarget(thisNode, "var", true), "name"), result);
    return result;
  }

  public static SNode virtual_getContainedVariableType_3435983127247055569(SNode thisNode, String role) {
    return MqlExpression_Behavior.call_getType_228266671027861783(SLinkOperations.getTarget(thisNode, "value", true));
  }
}
