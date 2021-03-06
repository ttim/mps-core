package jetbrains.mps.core.structure.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;

public class SInterfaceConcept_addExtends {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.INSERT, new SInterfaceConcept_addExtends.SInterfaceConcept_addExtends_INSERT(node));
  }

  public static class SInterfaceConcept_addExtends_INSERT extends EditorCellAction {
    /*package*/ SNode myNode;

    public SInterfaceConcept_addExtends_INSERT(SNode node) {
      this.myNode = node;
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      if (ListSequence.fromList(SLinkOperations.getTargets(node, "extends", true)).isEmpty()) {
        SNodeFactoryOperations.addNewChild(node, "extends", "jetbrains.mps.core.structure.structure.SInterfaceReference");
      }
    }
  }
}
