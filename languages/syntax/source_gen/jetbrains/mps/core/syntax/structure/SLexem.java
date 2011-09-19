package jetbrains.mps.core.syntax.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SLexem extends SLexerPart {
  public static final String concept = "jetbrains.mps.core.syntax.structure.SLexem";
  public static final String SYM = "sym";
  public static final String REGEXP = "regexp";
  public static final String ACTION = "action";

  public SLexem(SNode node) {
    super(node);
  }

  public SSymbol getSym() {
    return (SSymbol) this.getChild(SSymbol.class, SLexem.SYM);
  }

  public void setSym(SSymbol node) {
    super.setChild(SLexem.SYM, node);
  }

  public SRegex getRegexp() {
    return (SRegex) this.getChild(SRegex.class, SLexem.REGEXP);
  }

  public void setRegexp(SRegex node) {
    super.setChild(SLexem.REGEXP, node);
  }

  public SAction getAction() {
    return (SAction) this.getChild(SAction.class, SLexem.ACTION);
  }

  public void setAction(SAction node) {
    super.setChild(SLexem.ACTION, node);
  }

  public static SLexem newInstance(SModel sm, boolean init) {
    return (SLexem) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.core.syntax.structure.SLexem", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SLexem newInstance(SModel sm) {
    return SLexem.newInstance(sm, false);
  }
}