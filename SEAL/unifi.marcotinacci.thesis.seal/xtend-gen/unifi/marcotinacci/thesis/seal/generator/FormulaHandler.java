package unifi.marcotinacci.thesis.seal.generator;

import com.google.common.base.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.internal.xtend.util.Pair;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.InputOutput;
import unifi.marcotinacci.thesis.seal.seal.Environment;
import unifi.marcotinacci.thesis.seal.seal.ModuleDefine;
import unifi.marcotinacci.thesis.seal.seal.Program;
import unifi.marcotinacci.thesis.seal.seal.VariableDeclaration;
import unifi.marcotinacci.thesis.seal.utils.Commons;

@SuppressWarnings("all")
public class FormulaHandler {
  private Resource resource;
  
  private HashMap<List<Integer>,HashMap<List<Integer>,Double>> index;
  
  private Integer subjectParamsNumber;
  
  private Integer totalParamsNumber;
  
  public FormulaHandler(final Resource resource) {
    this.resource = resource;
    EList<EObject> _contents = resource.getContents();
    EObject _get = _contents.get(0);
    Program p = ((Program) _get);
    EList<ModuleDefine> _modules = p.getModules();
    ModuleDefine _get_1 = _modules.get(0);
    EList<VariableDeclaration> _variables = _get_1.getVariables();
    int _size = _variables.size();
    this.subjectParamsNumber = Integer.valueOf(_size);
    boolean _isIsEmptyEnv = p.isIsEmptyEnv();
    if (_isIsEmptyEnv) {
      this.totalParamsNumber = this.subjectParamsNumber;
    } else {
      Environment _environment = p.getEnvironment();
      EList<ModuleDefine> _modules_1 = _environment.getModules();
      Integer _countParams = this.countParams(_modules_1);
      int _plus = ((_countParams).intValue() + (this.subjectParamsNumber).intValue());
      this.totalParamsNumber = Integer.valueOf(_plus);
    }
    HashMap<List<Integer>,HashMap<List<Integer>,Double>> _newHashMap = CollectionLiterals.<List<Integer>, HashMap<List<Integer>,Double>>newHashMap();
    this.index = _newHashMap;
  }
  
  public HashMap<List<Integer>,HashMap<List<Integer>,Double>> getIndex() {
    return this.index;
  }
  
  /**
   * execute the check for the specified formula on the resource,
   * storing all the results on the index table
   */
  public String execModelCheck(final String formula) {
    String _xblockexpression = null;
    {
      String prismResult = "";
      String localURI = Commons.getSrcGenURI(this.resource);
      String _plus = (localURI + "model.pm");
      String _plus_1 = ("filter(print, Pmax=? [G <= 10 !" + formula);
      String _plus_2 = (_plus_1 + "])");
      List<String> args = CollectionLiterals.<String>newArrayList(
        "/Applications/prism-4.0.3-osx64/bin/prism", _plus, 
        "-pctl", _plus_2);
      String _execute = Commons.execute(args);
      prismResult = _execute;
      Pattern patternAllZero = Pattern.compile("\\(all zero\\)");
      Matcher _matcher = patternAllZero.matcher(prismResult);
      boolean _find = _matcher.find();
      if (_find) {
        InputOutput.<String>println("DEBUG : caso tutte le prob a zero!");
      } else {
        String patternParams = "(\\d+)";
        int i = 1;
        boolean _lessThan = (i < (this.totalParamsNumber).intValue());
        boolean _while = _lessThan;
        while (_while) {
          {
            String _plus_3 = (patternParams + ",(\\d+)");
            patternParams = _plus_3;
            int _plus_4 = (i + 1);
            i = _plus_4;
          }
          boolean _lessThan_1 = (i < (this.totalParamsNumber).intValue());
          _while = _lessThan_1;
        }
        String _plus_3 = ("\\d+:\\(" + patternParams);
        String _plus_4 = (_plus_3 + "\\)=(\\d.\\d+)");
        Pattern patternResults = Pattern.compile(_plus_4);
        Matcher m = patternResults.matcher(prismResult);
        boolean _find_1 = m.find();
        boolean _while_1 = _find_1;
        while (_while_1) {
          {
            int j = 1;
            List<Integer> subjectParams = CollectionLiterals.<Integer>newArrayList();
            List<Integer> otherParams = CollectionLiterals.<Integer>newArrayList();
            boolean _lessEqualsThan = (j <= (this.totalParamsNumber).intValue());
            boolean _while_2 = _lessEqualsThan;
            while (_while_2) {
              {
                boolean _lessEqualsThan_1 = (j <= (this.subjectParamsNumber).intValue());
                if (_lessEqualsThan_1) {
                  String _group = m.group(j);
                  int _parseInt = Integer.parseInt(_group);
                  subjectParams.add(Integer.valueOf(_parseInt));
                } else {
                  String _group_1 = m.group(j);
                  int _parseInt_1 = Integer.parseInt(_group_1);
                  otherParams.add(Integer.valueOf(_parseInt_1));
                }
                int _plus_5 = (j + 1);
                j = _plus_5;
              }
              boolean _lessEqualsThan_1 = (j <= (this.totalParamsNumber).intValue());
              _while_2 = _lessEqualsThan_1;
            }
            HashMap<List<Integer>,Double> subindex = this.index.get(subjectParams);
            boolean _equals = Objects.equal(subindex, null);
            if (_equals) {
              HashMap<List<Integer>,Double> _newHashMap = CollectionLiterals.<List<Integer>, Double>newHashMap();
              subindex = _newHashMap;
              this.index.put(subjectParams, subindex);
            }
            String _group = m.group(j);
            double _parseDouble = Double.parseDouble(_group);
            subindex.put(otherParams, Double.valueOf(_parseDouble));
          }
          boolean _find_2 = m.find();
          _while_1 = _find_2;
        }
      }
      String _plus_5 = ("DEBUG - INDEX : " + this.index);
      String _println = InputOutput.<String>println(_plus_5);
      _xblockexpression = (_println);
    }
    return _xblockexpression;
  }
  
  /**
   * precondition: size of 'args' must be equal to totalParamsNumber
   * params: list of integer, the complete state of the sistem
   * returns: probability of the case
   */
  public Double getSingleCaseProbability(final List<Integer> args) {
    List<Integer> _subList = args.subList(0, (this.subjectParamsNumber).intValue());
    HashMap<List<Integer>,Double> subindex = this.index.get(_subList);
    boolean _equals = Objects.equal(subindex, null);
    if (_equals) {
      return Double.valueOf(0.0);
    } else {
      int _plus = ((this.subjectParamsNumber).intValue() + 1);
      List<Integer> _subList_1 = args.subList(_plus, (this.totalParamsNumber).intValue());
      Double prob = subindex.get(_subList_1);
      boolean _equals_1 = Objects.equal(prob, null);
      if (_equals_1) {
        return Double.valueOf(0.0);
      } else {
        return prob;
      }
    }
  }
  
  /**
   * precondition: size of 'args' must be equal to subjectParamsNumber
   * params: list of integer params of the subject
   * returns: list of integer key of the max probability and the corresponding probability.
   * 		If key is null (and prob is -1) there are no entries in the hash table
   */
  public Pair<List<Integer>,Double> getMinProbability(final List<Integer> args) {
    HashMap<List<Integer>,Double> subindex = this.index.get(args);
    List<Integer> minKey = null;
    Double minProb = Double.valueOf(2.0);
    Set<List<Integer>> keys = subindex.keySet();
    for (final List<Integer> k : keys) {
      {
        final Double p = subindex.get(k);
        boolean _lessThan = (p.compareTo(minProb) < 0);
        if (_lessThan) {
          minProb = p;
          minKey = k;
        }
      }
    }
    Pair<List<Integer>,Double> _pair = new Pair<List<Integer>,Double>(minKey, minProb);
    return _pair;
  }
  
  public Integer countParams(final List<ModuleDefine> modules) {
    int _xblockexpression = (int) 0;
    {
      int counter = 0;
      for (final ModuleDefine m : modules) {
        EList<VariableDeclaration> _variables = m.getVariables();
        int _size = _variables.size();
        int _plus = (counter + _size);
        counter = _plus;
      }
      _xblockexpression = (counter);
    }
    return Integer.valueOf(_xblockexpression);
  }
}
