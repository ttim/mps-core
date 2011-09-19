package jetbrains.mps.workflow.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.ide.messages.MessagesViewTool;
import com.intellij.openapi.project.Project;
import jetbrains.mps.messages.IMessageHandler;
import jetbrains.mps.messages.IMessage;
import jetbrains.mps.project.IModule;

public class RunWorkflow_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(RunWorkflow_Action.class);

  public RunWorkflow_Action() {
    super("Run Workflow", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "RunWorkflow", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    {
      SNode node = event.getData(MPSDataKeys.NODE);
      if (node != null) {
        if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.workflow.structure.WflowExecutable"))) {
          node = null;
        }
      }
      MapSequence.fromMap(_params).put("workflow", node);
    }
    if (MapSequence.fromMap(_params).get("workflow") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("context", event.getData(MPSDataKeys.OPERATION_CONTEXT));
    if (MapSequence.fromMap(_params).get("context") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("langModule", event.getData(MPSDataKeys.MODULE));
    if (MapSequence.fromMap(_params).get("langModule") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("project", event.getData(MPSDataKeys.PROJECT));
    if (MapSequence.fromMap(_params).get("project") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      final MessagesViewTool tool = ((Project) MapSequence.fromMap(_params).get("project")).getComponent(MessagesViewTool.class);
      if (tool != null) {
        new WorkflowRunner(new IMessageHandler() {
          public void handle(IMessage p0) {
            tool.add(p0, "Workflow");
          }

          public void clear() {
            tool.clear("Workflow");
          }
        }, ((IModule) MapSequence.fromMap(_params).get("langModule"))).run(((SNode) MapSequence.fromMap(_params).get("workflow")));
      }
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "RunWorkflow", t);
    }
  }
}
