package jetbrains.mps.core.query.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.core.query.behavior.MqlExpression_Behavior;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_MqlExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public typeof_MqlExpression_InferenceRule() {
  }

  public void applyRule(final SNode mqlExpression, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    {
      SNode _nodeToCheck_1029348928467 = mqlExpression;
      EquationInfo _info_12389875345 = new EquationInfo(_nodeToCheck_1029348928467, null, "r:efe0605f-fbe2-49dd-8c71-c87a67c06b2c(jetbrains.mps.core.query.typesystem)", "228266671027905055", 0, null);
      typeCheckingContext.createEquation((SNode) typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:efe0605f-fbe2-49dd-8c71-c87a67c06b2c(jetbrains.mps.core.query.typesystem)", "228266671027905050", true), (SNode) MqlExpression_Behavior.call_getType_228266671027861783(mqlExpression), _info_12389875345);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.core.query.structure.MqlExpression";
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
