package jetbrains.mps.core.syntax.actions;

/*Generated by MPS */

import java.util.regex.Pattern;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.SideTransformPreconditionContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.core.syntax.behavior.STargetLanguage_Behavior;
import jetbrains.mps.smodel.action.NodeSetupContext;
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
import jetbrains.mps.util.Computable;
import jetbrains.mps.smodel.action.DefaultChildNodeSubstituteAction;
import jetbrains.mps.smodel.action.SideTransformActionsBuilderContext;
import jetbrains.mps.smodel.action.AbstractSideTransformHintSubstituteAction;

public class QueriesGenerated {
  private static Pattern REGEXP_x583g4_a0a0a2a0a0a0a0a2a0a1a6 = Pattern.compile("^([a-zA-Z_][\\w\\-]*|'(?:[^'\\n\\\\]|\\\\.)+')\\s*:?$", 0);
  private static Pattern REGEXP_x583g4_a0a0a1a2a0a0a0a2a0a1a6 = Pattern.compile("^(?:[a-zA-Z_][\\w\\-]*|'(?:[^'\\n\\\\]|\\\\.)+')\\s*:?$", 0);
  private static Pattern REGEXP_x583g4_a0a0a2a0a0a0a0a2a0a2a6 = Pattern.compile("^([a-zA-Z_][\\w\\-]*)\\s*=?$", 0);
  private static Pattern REGEXP_x583g4_a0a0a1a2a0a0a0a2a0a2a6 = Pattern.compile("^(?:[a-zA-Z_][\\w\\-]*)\\s*=?$", 0);
  private static Pattern REGEXP_x583g4_a0a0a2a0a0a0a0a2a0a1a7 = Pattern.compile("^([a-zA-Z_][\\w\\-]*|'(?:[^'\\n\\\\]|\\\\.)+')\\s*(?::(?::=?)?)?$", 0);
  private static Pattern REGEXP_x583g4_a0a0a1a2a0a0a0a2a0a1a7 = Pattern.compile("^([a-zA-Z_][\\w\\-]*|'(?:[^'\\n\\\\]|\\\\.)+')\\s*(?::(?::=?)?)?$", 0);
  private static Pattern REGEXP_x583g4_a0a0a1a0a0a0a1a0a1a21 = Pattern.compile("^([\\w]+)=?$", 0);
  private static Pattern REGEXP_x583g4_a0a0a2a1a0a0a1a0a1a21 = Pattern.compile("^([\\w]+)=?$", 0);

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_SInputRef_5073985075243238808(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return !(SPropertyOperations.getBoolean(_context.getSourceNode(), "noEoi"));
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_SLexem_2481283025450212997(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return (SLinkOperations.getTarget(_context.getSourceNode(), "regexp", true) == null);
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_SLexem_2481283025450221800(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return (SLinkOperations.getTarget(_context.getSourceNode(), "regexp", true) != null) && (SLinkOperations.getTarget(_context.getSourceNode(), "action", true) == null);
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_SSymbol_4242261035235370674(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return (SLinkOperations.getTarget(_context.getSourceNode(), "type", true) == null) && (SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getSourceNode(), "jetbrains.mps.core.syntax.structure.SSource", false, false), "targetLanguage", true) != null) && (STargetLanguage_Behavior.call_getTypeConcept_4242261035235367602(SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getSourceNode(), "jetbrains.mps.core.syntax.structure.SSource", false, false), "targetLanguage", true)) != null);
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_SSymbolRef_5989029785192054888(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return !(SNodeOperations.isInstanceOf(SNodeOperations.getNextSibling(_context.getSourceNode()), "jetbrains.mps.core.syntax.structure.SAction")) && (SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getSourceNode(), "jetbrains.mps.core.syntax.structure.SSource", false, false), "targetLanguage", true) != null) && (STargetLanguage_Behavior.call_getActionConcept_4242261035235367595(SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getSourceNode(), "jetbrains.mps.core.syntax.structure.SSource", false, false), "targetLanguage", true)) != null);
  }

  public static void nodeFactory_NodeSetup_SSymbolRef_1030525575875899027(final IOperationContext operationContext, final NodeSetupContext _context) {
    if (SNodeOperations.isInstanceOf(_context.getSampleNode(), "jetbrains.mps.core.syntax.structure.SSymbolRef")) {
      SPropertyOperations.set(_context.getNewNode(), "refalias", SPropertyOperations.getString(SNodeOperations.cast(_context.getSampleNode(), "jetbrains.mps.core.syntax.structure.SSymbolRef"), "refalias"));
    }
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_SLexerPart_2481283025450150292(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.core.syntax.structure.SLexerPart");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        ListSequence.fromList(result).addElement(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            Matcher _matcher_x583g4_a1a0a0a0a0a2a0a1a6;
            SNode result = SNodeFactoryOperations.createNewNode(model, "jetbrains.mps.core.syntax.structure.SLexem", null);
            if ((_matcher_x583g4_a1a0a0a0a0a2a0a1a6 = REGEXP_x583g4_a0a0a2a0a0a0a0a2a0a1a6.matcher(pattern)).find()) {
              SPropertyOperations.set(SLinkOperations.getTarget(result, "sym", true), "name", _matcher_x583g4_a1a0a0a0a0a2a0a1a6.group(1));
            }
            return result;
          }

          public String getDescriptionText(String pattern) {
            return "new lexem definition";
          }

          public String getMatchingText(String pattern) {
            Matcher _matcher_x583g4_a0a2a0a0a0a2a0a1a6;
            if ((_matcher_x583g4_a0a2a0a0a0a2a0a1a6 = REGEXP_x583g4_a0a0a1a2a0a0a0a2a0a1a6.matcher(pattern)).find()) {
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
            Matcher _matcher_x583g4_a1a0a0a0a0a2a0a2a6;
            SNode result = SNodeFactoryOperations.createNewNode(model, "jetbrains.mps.core.syntax.structure.SNamedPattern", null);
            if ((_matcher_x583g4_a1a0a0a0a0a2a0a2a6 = REGEXP_x583g4_a0a0a2a0a0a0a0a2a0a2a6.matcher(pattern)).find()) {
              SPropertyOperations.set(result, "name", _matcher_x583g4_a1a0a0a0a0a2a0a2a6.group(1));
            }
            return result;
          }

          public String getDescriptionText(String pattern) {
            return "new named pattern definition";
          }

          public String getMatchingText(String pattern) {
            Matcher _matcher_x583g4_a0a2a0a0a0a2a0a2a6;
            if ((_matcher_x583g4_a0a2a0a0a0a2a0a2a6 = REGEXP_x583g4_a0a0a1a2a0a0a0a2a0a2a6.matcher(pattern)).find()) {
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

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_SGrammarPart_1030525575875786822(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.core.syntax.structure.SNonTerm");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (outputConcept == null || SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        ListSequence.fromList(result).addElement(new DefaultSimpleSubstituteAction(outputConcept, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
          public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
            Matcher _matcher_x583g4_a1a0a0a0a0a2a0a1a7;
            SNode result = SNodeFactoryOperations.createNewNode(model, "jetbrains.mps.core.syntax.structure.SNonTerm", null);
            if ((_matcher_x583g4_a1a0a0a0a0a2a0a1a7 = REGEXP_x583g4_a0a0a2a0a0a0a0a2a0a1a7.matcher(pattern)).find()) {
              SPropertyOperations.set(SLinkOperations.getTarget(result, "sym", true), "name", _matcher_x583g4_a1a0a0a0a0a2a0a1a7.group(1));
            }
            return result;
          }

          public String getDescriptionText(String pattern) {
            return "new lexem definition";
          }

          public String getMatchingText(String pattern) {
            Matcher _matcher_x583g4_a0a2a0a0a0a2a0a1a7;
            if ((_matcher_x583g4_a0a2a0a0a0a2a0a1a7 = REGEXP_x583g4_a0a0a1a2a0a0a0a2a0a1a7.matcher(pattern)).find()) {
              return (pattern.endsWith("::=") ?
                pattern :
                _matcher_x583g4_a0a2a0a0a0a2a0a1a7.group(1) + " ::="
              );
            }
            return "non-term ::=";
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> nodeSubstituteActionsBuilder_ActionsFactory_SRulePart_1030525575875869607(final IOperationContext operationContext, final NodeSubstituteActionsFactoryContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode outputConcept = SConceptOperations.findConceptDeclaration("jetbrains.mps.core.syntax.structure.SSymbolRef");
      SNode childConcept = (SNode) _context.getChildConcept();
      if (SConceptOperations.isSuperConceptOf(childConcept, NameUtil.nodeFQName(outputConcept))) {
        Computable computable = new Computable() {
          public Object compute() {
            return SNodeOperations.getDescendants(SNodeOperations.getContainingRoot(_context.getParentNode()), "jetbrains.mps.core.syntax.structure.SSymbol", false, new String[]{});
          }
        };
        Iterable<SNode> queryResult = (Iterable) computable.compute();
        if (queryResult != null) {
          for (final SNode item : queryResult) {
            ListSequence.fromList(result).addElement(new DefaultChildNodeSubstituteAction(outputConcept, item, _context.getParentNode(), _context.getCurrentTargetNode(), _context.getChildSetter(), operationContext.getScope()) {
              public SNode createChildNode(Object parameterObject, SModel model, String pattern) {
                SNode p = SNodeFactoryOperations.createNewNode(model, "jetbrains.mps.core.syntax.structure.SSymbolRef", null);
                SLinkOperations.setTarget(p, "ref", (item), false);
                SPropertyOperations.set(p, "isOptional", "" + (SPropertyOperations.getString((item), "name") + "opt").equals(pattern));
                if (SNodeOperations.isInstanceOf(_context.getCurrentTargetNode(), "jetbrains.mps.core.syntax.structure.SSymbolRef")) {
                  SPropertyOperations.set(p, "refalias", SPropertyOperations.getString(SNodeOperations.cast(_context.getCurrentTargetNode(), "jetbrains.mps.core.syntax.structure.SSymbolRef"), "refalias"));
                }
                return p;
              }

              public String getMatchingText(String pattern) {
                if (pattern.startsWith(SPropertyOperations.getString((item), "name") + "o")) {
                  return SPropertyOperations.getString((item), "name") + "opt";
                }
                return SPropertyOperations.getString((item), "name");
              }

              public String getVisibleMatchingText(String pattern) {
                return this.getMatchingText(pattern);
              }
            });
          }
        }
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

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_SSymbolRef_6627258180876560931(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.core.syntax.structure.SSymbolRef");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          Matcher _matcher_x583g4_a0a0a0a0a1a0a1a21;
          if ((_matcher_x583g4_a0a0a0a0a1a0a1a21 = REGEXP_x583g4_a0a0a1a0a0a0a1a0a1a21.matcher(pattern)).find()) {
            SPropertyOperations.set(_context.getSourceNode(), "refalias", _matcher_x583g4_a0a0a0a0a1a0a1a21.group(1));
          } else {
            SPropertyOperations.set(_context.getSourceNode(), "refalias", "");
          }
          return _context.getSourceNode();
        }

        public String getMatchingText(String pattern) {
          Matcher _matcher_x583g4_a1a1a0a0a1a0a1a21;
          if (pattern.equals("=")) {
            return "=";
          }
          if ((_matcher_x583g4_a1a1a0a0a1a0a1a21 = REGEXP_x583g4_a0a0a2a1a0a0a1a0a1a21.matcher(pattern)).find()) {
            return (pattern.endsWith("=") ?
              pattern :
              pattern + "="
            );
          }
          return "alias=";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_SRulePart_6627258180876523205(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      final SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.core.syntax.structure.SSymbolRef");
      Computable computable = new Computable() {
        public Object compute() {
          return SNodeOperations.getDescendants(SNodeOperations.getContainingRoot(_context.getSourceNode()), "jetbrains.mps.core.syntax.structure.SSymbol", false, new String[]{});
        }
      };
      Iterable<SNode> parameterObjects = (Iterable<SNode>) computable.compute();
      assert parameterObjects != null;
      for (final SNode item : parameterObjects) {
        ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, item, _context.getSourceNode()) {
          public SNode doSubstitute(String pattern) {
            SNode p = SNodeFactoryOperations.createNewNode(_context.getModel(), "jetbrains.mps.core.syntax.structure.SSymbolRef", null);
            SLinkOperations.setTarget(p, "ref", (item), false);
            SPropertyOperations.set(p, "isOptional", "" + (SPropertyOperations.getString((item), "name") + "opt").equals(pattern));
            int anchorIndex = SNodeOperations.getParent(_context.getSourceNode()).getIndexOfChild(_context.getSourceNode());
            ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(SNodeOperations.getParent(_context.getSourceNode()), "jetbrains.mps.core.syntax.structure.SRule"), "parts", true)).insertElement(anchorIndex, p);
            return p;
          }

          public String getMatchingText(String pattern) {
            if (pattern.startsWith(SPropertyOperations.getString((item), "name") + "o")) {
              return SPropertyOperations.getString((item), "name") + "opt";
            }
            return SPropertyOperations.getString((item), "name");
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_SRulePart_6627258180876485481(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      final SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.core.syntax.structure.SSymbolRef");
      Computable computable = new Computable() {
        public Object compute() {
          return SNodeOperations.getDescendants(SNodeOperations.getContainingRoot(_context.getSourceNode()), "jetbrains.mps.core.syntax.structure.SSymbol", false, new String[]{});
        }
      };
      Iterable<SNode> parameterObjects = (Iterable<SNode>) computable.compute();
      assert parameterObjects != null;
      for (final SNode item : parameterObjects) {
        ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, item, _context.getSourceNode()) {
          public SNode doSubstitute(String pattern) {
            SNode p = SNodeFactoryOperations.createNewNode(_context.getModel(), "jetbrains.mps.core.syntax.structure.SSymbolRef", null);
            SLinkOperations.setTarget(p, "ref", (item), false);
            SPropertyOperations.set(p, "isOptional", "" + (SPropertyOperations.getString((item), "name") + "opt").equals(pattern));
            int anchorIndex = SNodeOperations.getParent(_context.getSourceNode()).getIndexOfChild(_context.getSourceNode());
            ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(SNodeOperations.getParent(_context.getSourceNode()), "jetbrains.mps.core.syntax.structure.SRule"), "parts", true)).insertElement(anchorIndex + 1, p);
            return p;
          }

          public String getMatchingText(String pattern) {
            if (pattern.startsWith(SPropertyOperations.getString((item), "name") + "o")) {
              return SPropertyOperations.getString((item), "name") + "opt";
            }
            return SPropertyOperations.getString((item), "name");
          }

          public String getVisibleMatchingText(String pattern) {
            return this.getMatchingText(pattern);
          }
        });
      }
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_SSymbol_4242261035235370662(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.core.syntax.structure.SSymbol");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          SNode val = STargetLanguage_Behavior.call_getTypeConcept_4242261035235367602(SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getSourceNode(), "jetbrains.mps.core.syntax.structure.SSource", false, false), "targetLanguage", true));
          SLinkOperations.setTarget(_context.getSourceNode(), "type", SNodeFactoryOperations.createNewNode(NameUtil.nodeFQName(val), null), true);
          return _context.getSourceNode();
        }

        public String getMatchingText(String pattern) {
          return "(";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }

        public String getDescriptionText(String pattern) {
          return "type of associated value";
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_SSymbolRef_5989029785192054881(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.core.syntax.structure.SAction");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          SNode val = STargetLanguage_Behavior.call_getActionConcept_4242261035235367595(SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getSourceNode(), "jetbrains.mps.core.syntax.structure.SSource", false, false), "targetLanguage", true));
          SNode act = SNodeFactoryOperations.createNewNode(NameUtil.nodeFQName(val), null);
          return SNodeOperations.insertNextSiblingChild(_context.getSourceNode(), act);
        }

        public String getMatchingText(String pattern) {
          return "{";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }

        public String getDescriptionText(String pattern) {
          return "semantic action";
        }
      });
    }
    return result;
  }
}
