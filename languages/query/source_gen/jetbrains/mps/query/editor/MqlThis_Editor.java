package jetbrains.mps.query.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;

public class MqlThis_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_5c4ao3_a(editorContext, node);
  }

  private EditorCell createCollection_5c4ao3_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_5c4ao3_a");
    editorCell.addEditorCell(this.createConstant_5c4ao3_a0(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_5c4ao3_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "this");
    editorCell.setCellId("Constant_5c4ao3_a0");
    MqlSS_StyleSheet.getKeyword(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
