package jetbrains.mps.query.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class MqlExpression_Behavior {
  private static Class[] PARAMETERS_228266671027861783 = {SNode.class};
  private static Class[] PARAMETERS_7352592509980890960 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getType_228266671027861783(SNode thisNode) {
    return null;
  }

  public static int virtual_getPriority_7352592509980890960(SNode thisNode) {
    return -1;
  }

  public static SNode call_getType_228266671027861783(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.query.structure.MqlExpression"), "virtual_getType_228266671027861783", PARAMETERS_228266671027861783);
  }

  public static int call_getPriority_7352592509980890960(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (Integer) descriptor.invoke(Integer.class, SNodeOperations.cast(thisNode, "jetbrains.mps.query.structure.MqlExpression"), "virtual_getPriority_7352592509980890960", PARAMETERS_7352592509980890960);
  }

  public static SNode callSuper_getType_228266671027861783(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.query.structure.MqlExpression"), callerConceptFqName, "virtual_getType_228266671027861783", PARAMETERS_228266671027861783);
  }

  public static int callSuper_getPriority_7352592509980890960(SNode thisNode, String callerConceptFqName) {
    return (Integer) BehaviorManager.getInstance().invokeSuper(Integer.class, SNodeOperations.cast(thisNode, "jetbrains.mps.query.structure.MqlExpression"), callerConceptFqName, "virtual_getPriority_7352592509980890960", PARAMETERS_7352592509980890960);
  }
}