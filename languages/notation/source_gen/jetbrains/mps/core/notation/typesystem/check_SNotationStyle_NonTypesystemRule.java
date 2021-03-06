package jetbrains.mps.core.notation.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_SNotationStyle_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_SNotationStyle_NonTypesystemRule() {
  }

  public void applyRule(final SNode style, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    if (!(SNodeOperations.isInstanceOf(SNodeOperations.getPrevSibling(style), "jetbrains.mps.core.notation.structure.SNotationPartWithStyle"))) {
      {
        MessageTarget errorTarget = new NodeMessageTarget();
        IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(style, "invalid place for style", "r:a890372e-633e-4844-8377-f7d3b4a35a63(jetbrains.mps.core.notation.typesystem)", "2711998566964092902", null, errorTarget);
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.core.notation.structure.SNotationStyle";
  }

  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    {
      boolean b = SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
      return new IsApplicableStatus(b, null);
    }
  }

  public boolean overrides() {
    return false;
  }
}
