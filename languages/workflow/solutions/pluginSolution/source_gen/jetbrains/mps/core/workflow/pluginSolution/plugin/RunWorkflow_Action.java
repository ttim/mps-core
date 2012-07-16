package jetbrains.mps.core.workflow.pluginSolution.plugin;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import jetbrains.mps.ide.messages.MessagesViewTool;
import com.intellij.openapi.project.Project;
import jetbrains.mps.messages.IMessageHandler;
import jetbrains.mps.messages.IMessage;
import jetbrains.mps.project.IModule;

public class RunWorkflow_Action extends BaseAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(RunWorkflow_Action.class);

  public RunWorkflow_Action() {
    super("Run Workflow", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @Override
  public boolean isDumbAware() {
    return true;
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "RunWorkflow", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    {
      SNode node = event.getData(MPSCommonDataKeys.NODE);
      if (node != null) {
        if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.core.workflow.structure.WflowExecutable"))) {
          node = null;
        }
      }
      MapSequence.fromMap(_params).put("workflow", node);
    }
    MapSequence.fromMap(_params).put("context", event.getData(MPSCommonDataKeys.OPERATION_CONTEXT));
    MapSequence.fromMap(_params).put("langModule", event.getData(MPSCommonDataKeys.MODULE));
    MapSequence.fromMap(_params).put("project", event.getData(PlatformDataKeys.PROJECT));
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
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "RunWorkflow", t);
      }
    }
  }
}