package jetbrains.mps.core.query.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.core.query.runtime.EvaluationEnvironment;
import jetbrains.mps.core.query.runtime.EvaluationContext;

public class MqlThis_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getType_228266671027861783(SNode thisNode) {
    for (SNode ancestor : SNodeOperations.getAncestorsWhereConceptInList(thisNode, new String[]{"jetbrains.mps.core.query.structure.MqlQuery", "jetbrains.mps.core.query.structure.MqlClosure"}, false)) {
      if (SNodeOperations.isInstanceOf(ancestor, "jetbrains.mps.core.query.structure.MqlQuery")) {
        return SNodeOperations.copyNode(SLinkOperations.getTarget(SNodeOperations.cast(ancestor, "jetbrains.mps.core.query.structure.MqlQuery"), "contextNode", true));
      }
    }
    return null;
  }

  public static Object virtual_evaluate_1671449901154581105(SNode thisNode, EvaluationEnvironment env, EvaluationContext context) {
    return context.getThis();
  }
}