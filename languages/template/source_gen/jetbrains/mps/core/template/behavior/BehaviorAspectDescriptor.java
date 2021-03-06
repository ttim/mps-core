package jetbrains.mps.core.template.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BehaviorDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.interpreted.BehaviorAspectInterpreted;

public class BehaviorAspectDescriptor implements jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor {
  private static String[] stringSwitchCases_846f5o_a0a0a = new String[]{"jetbrains.mps.core.template.structure.MtlBuilder", "jetbrains.mps.core.template.structure.MtlForeachMacro", "jetbrains.mps.core.template.structure.MtlForeachVar", "jetbrains.mps.core.template.structure.MtlIfMacro", "jetbrains.mps.core.template.structure.MtlLabelNodeMacro", "jetbrains.mps.core.template.structure.MtlLibrary", "jetbrains.mps.core.template.structure.MtlNewNodeType", "jetbrains.mps.core.template.structure.MtlNodeQueryMacro", "jetbrains.mps.core.template.structure.MtlPropertyMacro", "jetbrains.mps.core.template.structure.MtlQuery", "jetbrains.mps.core.template.structure.MtlReferenceMacro", "jetbrains.mps.core.template.structure.MtlTemplate", "jetbrains.mps.core.template.structure.MtlTemplateRoot"};

  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0a, fqName)) {
      case 5:
        return new MtlLibrary_BehaviorDescriptor();
      case 0:
        return new MtlBuilder_BehaviorDescriptor();
      case 11:
        return new MtlTemplate_BehaviorDescriptor();
      case 9:
        return new MtlQuery_BehaviorDescriptor();
      case 12:
        return new MtlTemplateRoot_BehaviorDescriptor();
      case 8:
        return new MtlPropertyMacro_BehaviorDescriptor();
      case 10:
        return new MtlReferenceMacro_BehaviorDescriptor();
      case 6:
        return new MtlNewNodeType_BehaviorDescriptor();
      case 3:
        return new MtlIfMacro_BehaviorDescriptor();
      case 1:
        return new MtlForeachMacro_BehaviorDescriptor();
      case 7:
        return new MtlNodeQueryMacro_BehaviorDescriptor();
      case 2:
        return new MtlForeachVar_BehaviorDescriptor();
      case 4:
        return new MtlLabelNodeMacro_BehaviorDescriptor();
      default:
        return BehaviorAspectInterpreted.getInstance().getDescriptor(fqName);
    }
  }
}
