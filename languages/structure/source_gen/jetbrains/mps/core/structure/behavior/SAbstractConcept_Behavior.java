package jetbrains.mps.core.structure.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.scope.SimpleRoleScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.runtime.BehaviorDescriptor;
import jetbrains.mps.smodel.language.ConceptRegistry;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class SAbstractConcept_Behavior {
  private static Class[] PARAMETERS_5938997310819191538 = {SNode.class, SNode.class};

  public static void init(SNode thisNode) {
  }

  public static boolean virtual_isSubConceptOf_5938997310819191538(SNode thisNode, SNode concept) {
    return false;
  }

  public static Scope virtual_getScope_3734116213129936182(SNode thisNode, SNode kind, SNode child) {
    if (SConceptOperations.isSubConceptOf(kind, "jetbrains.mps.core.structure.structure.SConceptMember")) {
      return new SimpleRoleScope(thisNode, SLinkOperations.findLinkDeclaration("jetbrains.mps.core.structure.structure.SAbstractConcept", "members"), NameUtil.nodeFQName(kind)) {
        public String getName(SNode child) {
          SNode n = SNodeOperations.as(child, "jetbrains.mps.lang.core.structure.INamedConcept");
          return (n != null ?
            SPropertyOperations.getString(n, "name") :
            null
          );
        }
      };
    }
    return null;
  }

  public static boolean call_isSubConceptOf_5938997310819191538(SNode thisNode, SNode concept) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (Boolean) descriptor.invoke(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.core.structure.structure.SAbstractConcept"), "virtual_isSubConceptOf_5938997310819191538", PARAMETERS_5938997310819191538, concept);
  }

  public static boolean callSuper_isSubConceptOf_5938997310819191538(SNode thisNode, String callerConceptFqName, SNode concept) {
    return (Boolean) BehaviorManager.getInstance().invokeSuper(Boolean.class, SNodeOperations.cast(thisNode, "jetbrains.mps.core.structure.structure.SAbstractConcept"), callerConceptFqName, "virtual_isSubConceptOf_5938997310819191538", PARAMETERS_5938997310819191538, concept);
  }
}
