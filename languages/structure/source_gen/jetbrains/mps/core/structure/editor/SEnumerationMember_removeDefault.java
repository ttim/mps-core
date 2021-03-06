package jetbrains.mps.core.structure.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class SEnumerationMember_removeDefault {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new SEnumerationMember_removeDefault.SEnumerationMember_removeDefault_DELETE(node));
  }

  public static class SEnumerationMember_removeDefault_DELETE extends EditorCellAction {
    /*package*/ SNode myNode;

    public SEnumerationMember_removeDefault_DELETE(SNode node) {
      this.myNode = node;
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.core.structure.structure.SEnumeration")) {
        SLinkOperations.setTarget(SNodeOperations.cast(SNodeOperations.getParent(node), "jetbrains.mps.core.structure.structure.SEnumeration"), "default", null, false);
      }
      editorContext.select(node);
    }
  }
}
