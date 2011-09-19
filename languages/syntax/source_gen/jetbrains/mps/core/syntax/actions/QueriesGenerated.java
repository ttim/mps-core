package jetbrains.mps.core.syntax.actions;

/*Generated by MPS */

import java.util.regex.Pattern;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.SideTransformPreconditionContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
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
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.smodel.action.SideTransformActionsBuilderContext;
import jetbrains.mps.smodel.action.AbstractSideTransformHintSubstituteAction;

public class QueriesGenerated {
  private static Pattern REGEXP_x583g4_a0a0a2a0a0a0a0a2a0a1a3 = Pattern.compile("^([a-zA-Z_][\\w\\-]*|'(?:[^'\\n\\\\]|\\\\.)+')\\s*:?$", 0);
  private static Pattern REGEXP_x583g4_a0a0a1a2a0a0a0a2a0a1a3 = Pattern.compile("^(?:[a-zA-Z_][\\w\\-]*|'(?:[^'\\n\\\\]|\\\\.)+')\\s*:?$", 0);
  private static Pattern REGEXP_x583g4_a0a0a2a0a0a0a0a2a0a2a3 = Pattern.compile("^([a-zA-Z_][\\w\\-]*)\\s*=?$", 0);
  private static Pattern REGEXP_x583g4_a0a0a1a2a0a0a0a2a0a2a3 = Pattern.compile("^(?:[a-zA-Z_][\\w\\-]*)\\s*=?$", 0);

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_SInputRef_5073985075243238808(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return !(SPropertyOperations.getBoolean(_context.getSourceNode(), "noEoi"));
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_SLexem_2481283025450212997(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return (SLinkOperations.getTarget(_context.getSourceNode(), "regexp", true) == null);
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_SLexem_2481283025450221800(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return (SLinkOperations.getTarget(_context.getSourceNode(), "regexp", true) != null) && (SLinkOperations.getTarget(_context.getSourceNode(), "action", true) == null);
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_SLexerPart_2481283025450150292(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.core.syntax.structure.SLexerPart");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        ListSequence.fromList(result).addElement(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            Matcher _matcher_x583g4_a1a0a0a0a0a2a0a1a3;
            SNode result = SNodeFactoryOperations.createNewNode(model, "jetbrains.mps.core.syntax.structure.SLexem", null);
            if ((_matcher_x583g4_a1a0a0a0a0a2a0a1a3 = REGEXP_x583g4_a0a0a2a0a0a0a0a2a0a1a3.matcher(pattern)).find()) {
              SPropertyOperations.set(SLinkOperations.getTarget(result, "sym", true), "name", _matcher_x583g4_a1a0a0a0a0a2a0a1a3.group(1));
            }
            return result;
          }

          public String getDescriptionText(String pattern) {
            return "new lexem definition";
          }

          public String getMatchingText(String pattern) {
            Matcher _matcher_x583g4_a0a2a0a0a0a2a0a1a3;
            if ((_matcher_x583g4_a0a2a0a0a0a2a0a1a3 = REGEXP_x583g4_a0a0a1a2a0a0a0a2a0a1a3.matcher(pattern)).find()) {
              return (pattern.endsWith(":") ?
                pattern :
                StringUtils.stripEnd(pattern, " \n\r\t") + " :"
              );
            }
            return "lexem:";
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.core.syntax.structure.SLexerPart");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        ListSequence.fromList(result).addElement(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            Matcher _matcher_x583g4_a1a0a0a0a0a2a0a2a3;
            SNode result = SNodeFactoryOperations.createNewNode(model, "jetbrains.mps.core.syntax.structure.SNamedPattern", null);
            if ((_matcher_x583g4_a1a0a0a0a0a2a0a2a3 = REGEXP_x583g4_a0a0a2a0a0a0a0a2a0a2a3.matcher(pattern)).find()) {
              SPropertyOperations.set(result, "name", _matcher_x583g4_a1a0a0a0a0a2a0a2a3.group(1));
            }
            return result;
          }

          public String getDescriptionText(String pattern) {
            return "new named pattern definition";
          }

          public String getMatchingText(String pattern) {
            Matcher _matcher_x583g4_a0a2a0a0a0a2a0a2a3;
            if ((_matcher_x583g4_a0a2a0a0a0a2a0a2a3 = REGEXP_x583g4_a0a0a1a2a0a0a0a2a0a2a3.matcher(pattern)).find()) {
              return (pattern.endsWith("=") ?
                pattern :
                StringUtils.stripEnd(pattern, " \n\r\t") + " ="
              );
            }
            return "pattern = /regexp/";
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_SInputRef_5073985075243225898(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.core.syntax.structure.SInputRef");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          SPropertyOperations.set(_context.getSourceNode(), "noEoi", "" + true);
          return _context.getSourceNode();
        }

        public String getMatchingText(String pattern) {
          return "(no-eoi)";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_SLexem_2481283025450212989(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.core.syntax.structure.SLexem");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          SLinkOperations.setTarget(_context.getSourceNode(), "regexp", SNodeFactoryOperations.createNewNode(_context.getModel(), "jetbrains.mps.core.syntax.structure.SRegex", null), true);
          return SLinkOperations.getTarget(_context.getSourceNode(), "regexp", true);
        }

        public String getMatchingText(String pattern) {
          return "/";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }

        public String getDescriptionText(String pattern) {
          return "add regex";
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_SLexem_2481283025450221799(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.core.syntax.structure.SLexem");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          // TODO 
          return _context.getSourceNode();
        }

        public String getMatchingText(String pattern) {
          return "{";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }

        public String getDescriptionText(String pattern) {
          return "add action";
        }
      });
    }
    return result;
  }
}
