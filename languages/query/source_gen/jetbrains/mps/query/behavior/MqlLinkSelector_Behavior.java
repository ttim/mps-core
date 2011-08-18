package jetbrains.mps.query.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MqlLinkSelector_Behavior {
  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getType_228266671027867010(SNode thisNode) {
    SNode concept = SLinkOperations.getTarget(SLinkOperations.getTarget(thisNode, "link", false), "target", false);
    return ((concept != null) ?
      new MqlLinkSelector_Behavior.QuotationClass_71mfo8_a0a1a1().createNode(concept) :
      null
    );
  }

  public static class QuotationClass_71mfo8_a0a1a1 {
    public QuotationClass_71mfo8_a0a1a1() {
    }

    public SNode createNode(Object parameter_3) {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.query.structure.MqlNodeType", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.setReferent("concept", (SNode) parameter_3);
        result = quotedNode1_2;
      }
      return result;
    }
  }
}
