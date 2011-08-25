package jetbrains.mps.query.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.INodeAdapter;
import java.util.Iterator;
import java.util.List;

public interface MqlParametersContainer extends INodeAdapter {
  public static final String concept = "jetbrains.mps.query.structure.MqlParametersContainer";
  public static final String PARAMETERS = "parameters";

  public int getParametersesCount();
  public Iterator<MqlParameter> parameterses();
  public List<MqlParameter> getParameterses();
  public void addParameters(MqlParameter node);
  public void insertParameters(MqlParameter prev, MqlParameter node);
}