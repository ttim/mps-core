package jetbrains.mps.template.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.nodeEditor.cellMenu.CellContext;

public class MtlNodeMacro_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_cthfdf_a(editorContext, node);
  }

  private EditorCell createCollection_cthfdf_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_cthfdf_a");
    editorCell.addEditorCell(this.createConstant_cthfdf_a0(editorContext, node));
    editorCell.addEditorCell(this.createAttributedNodeCell_cthfdf_b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_cthfdf_c0(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_cthfdf_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "\u00ab");
    editorCell.setCellId("Constant_cthfdf_a0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.red);
      style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
      style.set(StyleAttributes.EDITABLE, true);
    }
    delete_nodeMacro.setCellActions(editorCell, node, editorContext);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, new BasicCellContext(node), new SubstituteInfoPart[]{new MtlNodeMacro_Editor.MtlNodeMacro_component_cellMenu_a0a0()}));
    return editorCell;
  }

  private EditorCell createConstant_cthfdf_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "\u00bb");
    editorCell.setCellId("Constant_cthfdf_c0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.red);
      style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createAttributedNodeCell_cthfdf_b0(EditorContext editorContext, SNode node) {
    IOperationContext opContext = editorContext.getOperationContext();
    EditorManager manager = EditorManager.getInstanceFromContext(opContext);
    EditorCell editorCell = manager.getCurrentAttributedNodeCell();
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.DRAW_BRACKETS, true);
    }
    return editorCell;
  }

  public static class MtlNodeMacro_component_cellMenu_a0a0 implements SubstituteInfoPart {
    private replace_nodeMacro myComponent;

    public MtlNodeMacro_component_cellMenu_a0a0() {
      this.myComponent = new replace_nodeMacro();
    }

    public List<INodeSubstituteAction> createActions(CellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createActions(cellContext, editorContext);
    }
  }
}
