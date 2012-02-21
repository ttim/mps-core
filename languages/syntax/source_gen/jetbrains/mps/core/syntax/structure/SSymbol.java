package jetbrains.mps.core.syntax.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SSymbol extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.core.syntax.structure.SSymbol";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String TYPE = "type";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public SSymbol(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(SSymbol.NAME);
  }

  public void setName(String value) {
    this.setProperty(SSymbol.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(SSymbol.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(SSymbol.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(SSymbol.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(SSymbol.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(SSymbol.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(SSymbol.VIRTUAL_PACKAGE, value);
  }

  public SType getType() {
    return (SType) this.getChild(SType.class, SSymbol.TYPE);
  }

  public void setType(SType node) {
    super.setChild(SSymbol.TYPE, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(SSymbol.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, SSymbol.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, SSymbol.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(SSymbol.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, SSymbol.SMODEL_ATTRIBUTE, node);
  }

  public static SSymbol newInstance(SModel sm, boolean init) {
    return (SSymbol) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.core.syntax.structure.SSymbol", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SSymbol newInstance(SModel sm) {
    return SSymbol.newInstance(sm, false);
  }
}
