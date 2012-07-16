package jetbrains.mps.core.structure.actions;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.SideTransformPreconditionContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.action.SideTransformActionsBuilderContext;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.action.AbstractSideTransformHintSubstituteAction;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;

public class QueriesGenerated {
  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_SConcept_6195190339581955307(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getSourceNode(), "implements", true)).isEmpty();
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_SConcept_6195190339582016759(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getSourceNode(), "implements", true)).isEmpty();
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_SConcept_6195190339581974211(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return SPropertyOperations.getBoolean(_context.getSourceNode(), "isAbstract") == false;
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_SConcept_6195190339581955401(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return SPropertyOperations.getBoolean(_context.getSourceNode(), "isFinal") == false;
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_SInterfaceConcept_6195190339582036811(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getSourceNode(), "extends", true)).isEmpty();
  }

  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_SInterfaceConcept_6195190339582036833(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getSourceNode(), "extends", true)).isEmpty();
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_SConcept_6195190339581955306(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.core.structure.structure.SConcept");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          SNodeFactoryOperations.addNewChild(_context.getSourceNode(), "implements", "jetbrains.mps.core.structure.structure.SInterfaceReference");
          return _context.getSourceNode();
        }

        public String getMatchingText(String pattern) {
          return "implements";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_SConcept_6195190339582016745(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.core.structure.structure.SConcept");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          SNodeFactoryOperations.addNewChild(_context.getSourceNode(), "implements", "jetbrains.mps.core.structure.structure.SInterfaceReference");
          return _context.getSourceNode();
        }

        public String getMatchingText(String pattern) {
          return "implements";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_SConcept_6195190339581974197(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.core.structure.structure.SConcept");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          SPropertyOperations.set(_context.getSourceNode(), "isAbstract", "" + true);
          return _context.getSourceNode();
        }

        public String getMatchingText(String pattern) {
          return "abstract";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_SConcept_6195190339581955387(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.core.structure.structure.SConcept");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          SPropertyOperations.set(_context.getSourceNode(), "isFinal", "" + true);
          return _context.getSourceNode();
        }

        public String getMatchingText(String pattern) {
          return "final";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_SInterfaceConcept_6195190339582036797(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.core.structure.structure.SConcept");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          SNodeFactoryOperations.addNewChild(_context.getSourceNode(), "extends", "jetbrains.mps.core.structure.structure.SInterfaceReference");
          return _context.getSourceNode();
        }

        public String getMatchingText(String pattern) {
          return "extends";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }
      });
    }
    return result;
  }

  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_SInterfaceConcept_6195190339582036819(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("jetbrains.mps.core.structure.structure.SConcept");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(String pattern) {
          SNodeFactoryOperations.addNewChild(_context.getSourceNode(), "extends", "jetbrains.mps.core.structure.structure.SInterfaceReference");
          return _context.getSourceNode();
        }

        public String getMatchingText(String pattern) {
          return "extends";
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }
      });
    }
    return result;
  }
}