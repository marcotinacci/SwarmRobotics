package unifi.marcotinacci.thesis.seal.generator;

import com.google.common.base.Objects;
import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import unifi.marcotinacci.thesis.seal.generator.Data;
import unifi.marcotinacci.thesis.seal.seal.Range;
import unifi.marcotinacci.thesis.seal.seal.VariableDeclaration;

@SuppressWarnings("all")
public class DataSet extends HashSet<Data> {
  public DataSet(final EList<Range> ranges) {
    for (final Range r : ranges) {
      String _delta = r.getDelta();
      boolean _equals = Objects.equal(_delta, null);
      if (_equals) {
        VariableDeclaration _variable = r.getVariable();
        String _from = r.getFrom();
        int _parseInt = Integer.parseInt(_from);
        String _to = r.getTo();
        int _parseInt_1 = Integer.parseInt(_to);
        Data _data = new Data(_variable, _parseInt, _parseInt_1);
        this.add(_data);
      } else {
        VariableDeclaration _variable_1 = r.getVariable();
        String _from_1 = r.getFrom();
        double _parseDouble = Double.parseDouble(_from_1);
        String _to_1 = r.getTo();
        double _parseDouble_1 = Double.parseDouble(_to_1);
        String _delta_1 = r.getDelta();
        double _parseDouble_2 = Double.parseDouble(_delta_1);
        Data _data_1 = new Data(_variable_1, _parseDouble, _parseDouble_1, _parseDouble_2);
        this.add(_data_1);
      }
    }
  }
}
