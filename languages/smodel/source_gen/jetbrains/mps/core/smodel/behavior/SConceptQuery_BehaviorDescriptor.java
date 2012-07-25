package jetbrains.mps.core.smodel.behavior;

/*Generated by MPS */

import jetbrains.mps.core.structure.behavior.SConceptMember_BehaviorDescriptor;
import jetbrains.mps.lang.core.behavior.INamedConcept_BehaviorDescriptor;
import jetbrains.mps.core.query.behavior.MqlParametersContainer_BehaviorDescriptor;
import jetbrains.mps.core.query.behavior.MqlThisProvider_BehaviorDescriptor;
import jetbrains.mps.lang.core.behavior.ScopeProvider_BehaviorDescriptor;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.core.behavior.ScopeProvider_Behavior;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;

public class SConceptQuery_BehaviorDescriptor extends SConceptMember_BehaviorDescriptor implements INamedConcept_BehaviorDescriptor, MqlParametersContainer_BehaviorDescriptor, MqlThisProvider_BehaviorDescriptor, ScopeProvider_BehaviorDescriptor {
  public SConceptQuery_BehaviorDescriptor() {
  }

  public Scope virtual_getScope_7722139651431880752(SNode thisNode, SNode kind, String role, int index) {
    return ScopeProvider_Behavior.virtual_getScope_7722139651431880752(thisNode, kind, role, index);
  }

  public SNode virtual_getThisType_4125821269968916020(SNode thisNode) {
    return SConceptQuery_Behavior.virtual_getThisType_4125821269968916020(thisNode);
  }

  public String virtual_getFqName_1213877404258(SNode thisNode) {
    return INamedConcept_Behavior.virtual_getFqName_1213877404258(thisNode);
  }

  public Scope virtual_getScope_3734116213129936182(SNode thisNode, SNode kind, SNode child) {
    return SConceptQuery_Behavior.virtual_getScope_3734116213129936182(thisNode, kind, child);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.core.smodel.structure.SConceptQuery";
  }
}