package jetbrains.mps.core.structure.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;

public class SConstraintsPartEmptyLine_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createConstant_rm4iow_a(editorContext, node);
  }

  private EditorCell createConstant_rm4iow_a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_rm4iow_a");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.EDITABLE, true);
    }
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, new BasicCellContext(node), new SubstituteInfoPart[]{new SConstraintsPartEmptyLine_Editor.ReplaceWith_SConstraintsPart_cellMenu_a0a()}));
    return editorCell;
  }

  public static class ReplaceWith_SConstraintsPart_cellMenu_a0a extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {
    public ReplaceWith_SConstraintsPart_cellMenu_a0a() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.core.structure.structure.SConstraintsPart";
    }
  }
}
