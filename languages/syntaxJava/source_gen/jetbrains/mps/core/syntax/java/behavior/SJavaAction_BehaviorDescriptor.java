package jetbrains.mps.core.syntax.java.behavior;

/*Generated by MPS */

import jetbrains.mps.core.syntax.behavior.SAction_BehaviorDescriptor;
import jetbrains.mps.baseLanguage.behavior.ILocalVariableElementList_BehaviorDescriptor;
import java.util.List;
import jetbrains.mps.smodel.SNode;

public class SJavaAction_BehaviorDescriptor extends SAction_BehaviorDescriptor implements ILocalVariableElementList_BehaviorDescriptor {
  public SJavaAction_BehaviorDescriptor() {
  }

  public List<SNode> virtual_getLocalVariableElements_1238805763253(SNode thisNode) {
    return SJavaAction_Behavior.virtual_getLocalVariableElements_1238805763253(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.core.syntax.java.structure.SJavaAction";
  }
}
