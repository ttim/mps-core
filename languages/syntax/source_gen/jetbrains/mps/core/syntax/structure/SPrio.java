package jetbrains.mps.core.syntax.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SPrio extends SGrammarPart {
  public static final String concept = "jetbrains.mps.core.syntax.structure.SPrio";
  public static final String KIND = "kind";
  public static final String REFERENCES = "references";

  public SPrio(SNode node) {
    super(node);
  }

  public SPrioKind getKind() {
    String value = super.getProperty(SPrio.KIND);
    return SPrioKind.parseValue(value);
  }

  public void setKind(SPrioKind value) {
    super.setProperty(SPrio.KIND, value.getValueAsString());
  }

  public int getReferencesesCount() {
    return this.getChildCount(SPrio.REFERENCES);
  }

  public Iterator<SReference> referenceses() {
    return this.children(SReference.class, SPrio.REFERENCES);
  }

  public List<SReference> getReferenceses() {
    return this.getChildren(SReference.class, SPrio.REFERENCES);
  }

  public void addReferences(SReference node) {
    this.addChild(SPrio.REFERENCES, node);
  }

  public void insertReferences(SReference prev, SReference node) {
    this.insertChild(prev, SPrio.REFERENCES, node);
  }

  public static SPrio newInstance(SModel sm, boolean init) {
    return (SPrio) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.core.syntax.structure.SPrio", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SPrio newInstance(SModel sm) {
    return SPrio.newInstance(sm, false);
  }
}
