package jetbrains.mps.template.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.BaseConcept_BehaviorDescriptor;
import jetbrains.mps.lang.core.behavior.INamedConcept_BehaviorDescriptor;
import jetbrains.mps.core.query.behavior.MqlScopeProvider_BehaviorDescriptor;
import jetbrains.mps.core.query.runtime.QueryScope;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;

public class MtlLibrary_BehaviorDescriptor extends BaseConcept_BehaviorDescriptor implements INamedConcept_BehaviorDescriptor, MqlScopeProvider_BehaviorDescriptor {
  public MtlLibrary_BehaviorDescriptor() {
  }

  public QueryScope virtual_getScope_5433095484313879207(SNode thisNode, SNode kind, SNode child) {
    return MtlLibrary_Behavior.virtual_getScope_5433095484313879207(thisNode, kind, child);
  }

  public String virtual_getFqName_1213877404258(SNode thisNode) {
    return INamedConcept_Behavior.virtual_getFqName_1213877404258(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.template.structure.MtlLibrary";
  }
}
