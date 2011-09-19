package jetbrains.mps.core.syntax.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import org.textway.lapg.lex.RegexMatcher;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.textway.lapg.lex.RegexpParseException;

public class SRegex_Constraints extends BaseConstraintsDescriptor {
  public SRegex_Constraints() {
    super("jetbrains.mps.core.syntax.structure.SRegex");
  }

  @Override
  protected Map<String, PropertyConstraintsDescriptor> getNotDefaultProperties() {
    Map<String, PropertyConstraintsDescriptor> properties = new HashMap();
    properties.put("regexp", new BasePropertyConstraintsDescriptor("regexp", this) {
      @Override
      public boolean hasOwnValidator() {
        return true;
      }

      @Override
      public boolean validateValue(SNode node, String propertyValue, IScope scope) {
        String propertyName = "regexp";
        try {
          RegexMatcher.parse("input", (SPropertyOperations.getString(propertyValue)));
          return true;
        } catch (RegexpParseException ex) {
          return false;
        }
      }
    });
    return properties;
  }
}