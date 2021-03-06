package jetbrains.mps.core.structure.pluginSolution.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.ide.actions.CommonModuleActions_ActionGroup;

public class PluginSolution_ApplicationPlugin extends BaseApplicationPlugin {
  private PluginId myId = PluginId.getId("jetbrains.mps.core.structure.pluginSolution");

  public PluginSolution_ApplicationPlugin() {
  }

  public PluginId getId() {
    return myId;
  }

  public void createGroups() {
    // actions w/o parameters 
    addAction(new MigrateStructure_Action());
    // groups 
    addGroup(new MigrateStructureGroup_ActionGroup());
  }

  public void adjustRegularGroups() {
    insertGroupIntoAnother(MigrateStructureGroup_ActionGroup.ID, CommonModuleActions_ActionGroup.ID, CommonModuleActions_ActionGroup.LABEL_ID_refactoring);
  }
}
