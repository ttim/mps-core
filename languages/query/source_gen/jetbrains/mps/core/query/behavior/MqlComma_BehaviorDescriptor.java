package jetbrains.mps.core.query.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.ScopeProvider_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.lang.core.behavior.ScopeProvider_Behavior;
import jetbrains.mps.core.query.runtime.EvaluationEnvironment;
import jetbrains.mps.core.query.runtime.EvaluationContext;

public class MqlComma_BehaviorDescriptor extends MqlBinaryExpr_BehaviorDescriptor implements ScopeProvider_BehaviorDescriptor {
  public MqlComma_BehaviorDescriptor() {
  }

  public int virtual_getPriority_7352592509980890960(SNode thisNode) {
    return MqlComma_Behavior.virtual_getPriority_7352592509980890960(thisNode);
  }

  public SNode virtual_getType_228266671027861783(SNode thisNode) {
    return MqlComma_Behavior.virtual_getType_228266671027861783(thisNode);
  }

  public Scope virtual_getScope_7722139651431880752(SNode thisNode, SNode kind, String role, int index) {
    return ScopeProvider_Behavior.virtual_getScope_7722139651431880752(thisNode, kind, role, index);
  }

  public Object virtual_evaluate_1671449901154581105(SNode thisNode, EvaluationEnvironment env, EvaluationContext context) {
    return MqlComma_Behavior.virtual_evaluate_1671449901154581105(thisNode, env, context);
  }

  public int virtual_getAssociativity_5322644393894740267(SNode thisNode) {
    return MqlComma_Behavior.virtual_getAssociativity_5322644393894740267(thisNode);
  }

  public Scope virtual_getScope_3734116213129936182(SNode thisNode, SNode kind, SNode child) {
    return MqlComma_Behavior.virtual_getScope_3734116213129936182(thisNode, kind, child);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.core.query.structure.MqlComma";
  }
}
