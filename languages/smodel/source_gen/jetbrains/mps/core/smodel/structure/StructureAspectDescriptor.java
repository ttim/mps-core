package jetbrains.mps.core.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.CompiledConceptDescriptor;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  private static String[] stringSwitchCases_1htk8d_a0a0a = new String[]{"jetbrains.mps.core.smodel.structure.MqlLinkSelector", "jetbrains.mps.core.smodel.structure.MqlNodeType", "jetbrains.mps.core.smodel.structure.MqlPropertySelector"};

  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0a, conceptFqName)) {
      case 0:
        return new CompiledConceptDescriptor("jetbrains.mps.core.smodel.structure.MqlLinkSelector", "jetbrains.mps.core.query.structure.MqlSelector", false, new String[]{"jetbrains.mps.core.query.structure.MqlSelector"}, new String[]{}, new String[]{"link"});
      case 1:
        return new CompiledConceptDescriptor("jetbrains.mps.core.smodel.structure.MqlNodeType", "jetbrains.mps.core.query.structure.MqlType", false, new String[]{"jetbrains.mps.core.query.structure.MqlType"}, new String[]{}, new String[]{"concept"});
      case 2:
        return new CompiledConceptDescriptor("jetbrains.mps.core.smodel.structure.MqlPropertySelector", "jetbrains.mps.core.query.structure.MqlSelector", false, new String[]{"jetbrains.mps.core.query.structure.MqlSelector"}, new String[]{}, new String[]{"property"});
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }
}