package jetbrains.mps.workflow;

/*Generated by MPS */

import jetbrains.mps.smodel.language.LanguageRuntime;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.lang.typesystem.runtime.IHelginsDescriptor;
import jetbrains.mps.ide.findusages.BaseFindUsagesDescriptor;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateModule;

public class Language extends LanguageRuntime {
  public static ModuleReference MODULE_REFERENCE = ModuleReference.fromString("78c70cc5-3e2a-478b-9524-f2d47690ac85(jetbrains.mps.core.workflow)");

  public Language() {

  }

  public String getNamespace() {
    return "jetbrains.mps.core.workflow";
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
