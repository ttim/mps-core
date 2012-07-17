package jetbrains.mps.core.structure.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.core.structure.behavior.SConstraints_Behavior;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class SConstraints_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_un4bzo_a(editorContext, node);
  }

  private EditorCell createAlternation_un4bzo_a0(EditorContext editorContext, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = SConstraints_Editor.renderingCondition_un4bzo_a0a(node, editorContext, editorContext.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createConstant_un4bzo_a0a(editorContext, node);
    } else {
      editorCell = this.createConstant_un4bzo_a0a_0(editorContext, node);
    }
    return editorCell;
  }

  private EditorCell createAlternation_un4bzo_b0(EditorContext editorContext, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = SConstraints_Editor.renderingCondition_un4bzo_a1a(node, editorContext, editorContext.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createRefNodeList_un4bzo_a1a(editorContext, node);
    } else {
      editorCell = this.createRefNodeList_un4bzo_a1a_0(editorContext, node);
    }
    return editorCell;
  }

  private EditorCell createCollection_un4bzo_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_un4bzo_a");
    editorCell.addEditorCell(this.createAlternation_un4bzo_a0(editorContext, node));
    editorCell.addEditorCell(this.createAlternation_un4bzo_b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_un4bzo_c0(editorContext, node));
    if (renderingCondition_un4bzo_a3a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_un4bzo_d0(editorContext, node));
    }
    return editorCell;
  }

  private EditorCell createConstant_un4bzo_a0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "{");
    editorCell.setCellId("Constant_un4bzo_a0a");
    default_StyleSheet.getPunctuation(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.MATCHING_LABEL, "body-brace");
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
    SConstraints_delete.setCellActions(editorCell, node, editorContext);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_un4bzo_a0a_0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "{");
    editorCell.setCellId("Constant_un4bzo_a0a_0");
    default_StyleSheet.getPunctuation(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.MATCHING_LABEL, "body-brace");
      style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    }
    SConstraints_delete.setCellActions(editorCell, node, editorContext);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_un4bzo_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "}");
    editorCell.setCellId("Constant_un4bzo_c0");
    default_StyleSheet.getPunctuation(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.MATCHING_LABEL, "body-brace");
    }
    SConstraints_delete.setCellActions(editorCell, node, editorContext);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_un4bzo_d0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ";");
    editorCell.setCellId("Constant_un4bzo_d0");
    default_StyleSheet.getPunctuation(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefNodeList_un4bzo_a1a(EditorContext editorContext, SNode node) {
    AbstractCellListHandler handler = new SConstraints_Editor.partsListHandler_un4bzo_a1a(node, "parts", editorContext);
    EditorCell_Collection editorCell = handler.createCells(editorContext, new CellLayout_Indent(), false);
    editorCell.setCellId("refNodeList_parts");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_CHILDREN_NEWLINE, true);
      style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }

  private EditorCell createRefNodeList_un4bzo_a1a_0(EditorContext editorContext, SNode node) {
    AbstractCellListHandler handler = new SConstraints_Editor.partsListHandler_un4bzo_a1a_0(node, "parts", editorContext);
    EditorCell_Collection editorCell = handler.createCells(editorContext, new CellLayout_Indent(), false);
    editorCell.setCellId("refNodeList_parts_1");
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }

  private static boolean renderingCondition_un4bzo_a0a(SNode node, EditorContext editorContext, IScope scope) {
    return SConstraints_Behavior.call_isMultiline_2223786200032678198(node);
  }

  private static boolean renderingCondition_un4bzo_a1a(SNode node, EditorContext editorContext, IScope scope) {
    return SConstraints_Behavior.call_isMultiline_2223786200032678198(node);
  }

  private static boolean renderingCondition_un4bzo_a3a(SNode node, EditorContext editorContext, IScope scope) {
    return !(SConstraints_Behavior.call_isMultiline_2223786200032678198(node));
  }

  private static class partsListHandler_un4bzo_a1a extends RefNodeListHandler {
    public partsListHandler_un4bzo_a1a(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, editorContext, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext editorContext, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(editorContext, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, editorContext);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext editorContext) {
      EditorCell emptyCell = null;
      emptyCell = this.createEmptyCell_internal(editorContext, this.getOwner());
      this.installElementCellActions(super.getOwner(), null, emptyCell, editorContext);
      return emptyCell;
    }

    public EditorCell createEmptyCell_internal(EditorContext editorContext, SNode node) {
      return this.createConstant_un4bzo_a0b0(editorContext, node);
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext editorContext) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        if (elementNode != null) {
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), editorContext));
        }
      }
    }

    private EditorCell createConstant_un4bzo_a0b0(EditorContext editorContext, SNode node) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
      editorCell.setCellId("Constant_un4bzo_a0b0");
      {
        Style style = editorCell.getStyle();
        style.set(StyleAttributes.EDITABLE, true);
      }
      SConstraints_delete.setCellActions(editorCell, node, editorContext);
      editorCell.setDefaultText("");
      return editorCell;
    }
  }

  private static class partsListHandler_un4bzo_a1a_0 extends RefNodeListHandler {
    public partsListHandler_un4bzo_a1a_0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, editorContext, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext editorContext, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(editorContext, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, editorContext);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext editorContext) {
      EditorCell emptyCell = null;
      emptyCell = this.createEmptyCell_internal(editorContext, this.getOwner());
      this.installElementCellActions(super.getOwner(), null, emptyCell, editorContext);
      return emptyCell;
    }

    public EditorCell createEmptyCell_internal(EditorContext editorContext, SNode node) {
      return this.createConstant_un4bzo_a0b0_0(editorContext, node);
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext editorContext) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        if (elementNode != null) {
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), editorContext));
        }
      }
    }

    private EditorCell createConstant_un4bzo_a0b0_0(EditorContext editorContext, SNode node) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
      editorCell.setCellId("Constant_un4bzo_a0b0_0");
      {
        Style style = editorCell.getStyle();
        style.set(StyleAttributes.EDITABLE, true);
      }
      SConstraints_delete.setCellActions(editorCell, node, editorContext);
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
}
