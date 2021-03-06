package jetbrains.mps.core.notation.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.SNodePointer;
import java.util.Map;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseScopeProvider;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.scope.EmptyScope;

public class SStructurePropertyRef_Constraints extends BaseConstraintsDescriptor {
  private static SNodePointer breakingNode_dd2wtm_a0a0a0a0a1a0b0a1a0 = new SNodePointer("r:f55d268e-47a6-49d8-8d89-2139ce9c0cd2(jetbrains.mps.core.notation.constraints)", "146911029171891506");

  public SStructurePropertyRef_Constraints() {
    super("jetbrains.mps.core.notation.structure.SStructurePropertyRef");
  }

  @Override
  protected Map<String, ReferenceConstraintsDescriptor> getNotDefaultReferences() {
    Map<String, ReferenceConstraintsDescriptor> references = new HashMap();
    references.put("property", new BaseReferenceConstraintsDescriptor("property", this) {
      @Override
      public boolean hasOwnScopeProvider() {
        return true;
      }

      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseScopeProvider() {
          @Override
          public SNodePointer getSearchScopeValidatorNode() {
            return breakingNode_dd2wtm_a0a0a0a0a1a0b0a1a0;
          }

          @Override
          public Scope createScope(final IOperationContext operationContext, final ReferenceConstraintsContext _context) {
            {
              Scope scope = Scope.getScope(_context.getContextNode(), _context.getContextRole(), _context.getPosition(), (SNode) SConceptOperations.findConceptDeclaration("jetbrains.mps.core.structure.structure.SProperty"));
              return (scope == null ?
                new EmptyScope() :
                scope
              );
            }
          }
        };
      }
    });
    return references;
  }
}
