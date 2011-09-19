package jetbrains.mps.core.syntax.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SLexerPart extends BaseConcept {
  public static final String concept = "jetbrains.mps.core.syntax.structure.SLexerPart";

  public SLexerPart(SNode node) {
    super(node);
  }

  public static SLexerPart newInstance(SModel sm, boolean init) {
    return (SLexerPart) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.core.syntax.structure.SLexerPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SLexerPart newInstance(SModel sm) {
    return SLexerPart.newInstance(sm, false);
  }
}
