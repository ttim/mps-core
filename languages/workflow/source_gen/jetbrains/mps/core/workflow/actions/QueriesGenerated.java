package jetbrains.mps.core.workflow.actions;

/*Generated by MPS */

import java.util.regex.Pattern;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.NodeSubstituteActionsFactoryContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.action.DefaultSimpleSubstituteAction;
import jetbrains.mps.smodel.SModel;
import java.util.regex.Matcher;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;

public class QueriesGenerated {
  private static Pattern REGEXP_x583g4_a0a0a2a0a0a0a0a2a0a1a0 = Pattern.compile("([a-zA-Z_]\\w*)\\s*=?", 0);
  private static Pattern REGEXP_x583g4_a0a0a2a0a0a0a2a0a1a0 = Pattern.compile("(?:[a-zA-Z_]\\w*)\\s*=", 0);

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_WflowStatement_3373821274546693027(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.core.workflow.structure.WflowExpressionStatement");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        ListSequence.fromList(result).addElement(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            Matcher _matcher_x583g4_a1a0a0a0a0a2a0a1a0;
            SNode result = SNodeFactoryOperations.createNewNode(model, "jetbrains.mps.core.workflow.structure.WflowExpressionStatement", null);
            if ((_matcher_x583g4_a1a0a0a0a0a2a0a1a0 = REGEXP_x583g4_a0a0a2a0a0a0a0a2a0a1a0.matcher(pattern)).find()) {
              SPropertyOperations.set(SLinkOperations.getTarget(result, "var", true), "name", _matcher_x583g4_a1a0a0a0a0a2a0a1a0.group(1));
            }
            return result;
          }

          public boolean hasSubstitute() {
            return true;
          }

          public boolean canSubstitute_internal(String pattern, boolean strictly) {
            return REGEXP_x583g4_a0a0a2a0a0a0a2a0a1a0.matcher(pattern).matches();
          }

          public String getDescriptionText(String pattern) {
            return "create variable";
          }

          public String getMatchingText(String pattern) {
            return pattern;
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.core.workflow.structure.WflowExpressionStatement");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        ListSequence.fromList(result).addElement(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            SNode result = SModelOperations.createNewNode(model, "jetbrains.mps.core.workflow.structure.WflowExpressionStatement", null);
            return result;
          }

          public String getDescriptionText(String pattern) {
            return "create variable";
          }

          public String getMatchingText(String pattern) {
            return "=";
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    return result;
  }
}