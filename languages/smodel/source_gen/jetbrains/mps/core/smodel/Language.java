package jetbrains.mps.core.smodel;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor;
import jetbrains.mps.ide.findusages.BaseFindUsagesDescriptor;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateModule;

public class Language extends LanguageRuntime {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("41a590b4-0cca-40d1-9a11-d9ef253734cc(jetbrains.mps.core.smodel)");

  public Language() {

  }

  public String getNamespace() {
    return "jetbrains.mps.core.smodel";
  }

  @Override
  public IHelginsDescriptor getTypesystem() {
    return null;
  }

  @Override
  public BaseFindUsagesDescriptor getFindUsages() {
    return null;
  }

  public Collection<TemplateModule> getGenerators() {
    return null;
  }
}
