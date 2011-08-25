package jetbrains.mps.query.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class delete_cachedProperty {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new delete_cachedProperty.delete_cachedProperty_DELETE(node));
  }

  public static class delete_cachedProperty_DELETE extends EditorCellAction {
    /*package*/ SNode myNode;

    public delete_cachedProperty_DELETE(SNode node) {
      this.myNode = node;
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      SPropertyOperations.set(node, "isCached", "" + false);
    }
  }
}