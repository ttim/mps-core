package jetbrains.mps.core.query.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.core.query.runtime.EvaluationEnvironment;
import jetbrains.mps.core.query.runtime.EvaluationContext;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MqlNullLiteral_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getType_228266671027861783(SNode thisNode) {
    return new MqlNullLiteral_Behavior.QuotationClass_3dw22g_a0a0b().createNode();
  }

  public static Object virtual_evaluate_1671449901154581105(SNode thisNode, EvaluationEnvironment env, EvaluationContext context) {
    return null;
  }

  public static class QuotationClass_3dw22g_a0a0b {
    public QuotationClass_3dw22g_a0a0b() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.core.query.structure.MqlNullType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
