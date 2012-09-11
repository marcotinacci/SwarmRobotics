package unifi.marcotinacci.thesis.seal.generator;

import com.google.common.base.Objects;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import unifi.marcotinacci.thesis.seal.generator.FormulaHandler;
import unifi.marcotinacci.thesis.seal.seal.Action;
import unifi.marcotinacci.thesis.seal.seal.And;
import unifi.marcotinacci.thesis.seal.seal.Assign;
import unifi.marcotinacci.thesis.seal.seal.Case;
import unifi.marcotinacci.thesis.seal.seal.Div;
import unifi.marcotinacci.thesis.seal.seal.Environment;
import unifi.marcotinacci.thesis.seal.seal.Eq;
import unifi.marcotinacci.thesis.seal.seal.Expression;
import unifi.marcotinacci.thesis.seal.seal.ExternalReference;
import unifi.marcotinacci.thesis.seal.seal.Geq;
import unifi.marcotinacci.thesis.seal.seal.Gtr;
import unifi.marcotinacci.thesis.seal.seal.Leq;
import unifi.marcotinacci.thesis.seal.seal.Less;
import unifi.marcotinacci.thesis.seal.seal.Literal;
import unifi.marcotinacci.thesis.seal.seal.LocalReference;
import unifi.marcotinacci.thesis.seal.seal.Minus;
import unifi.marcotinacci.thesis.seal.seal.ModuleDefine;
import unifi.marcotinacci.thesis.seal.seal.Multi;
import unifi.marcotinacci.thesis.seal.seal.NDCase;
import unifi.marcotinacci.thesis.seal.seal.Neq;
import unifi.marcotinacci.thesis.seal.seal.NoAction;
import unifi.marcotinacci.thesis.seal.seal.Not;
import unifi.marcotinacci.thesis.seal.seal.Or;
import unifi.marcotinacci.thesis.seal.seal.Plus;
import unifi.marcotinacci.thesis.seal.seal.Program;
import unifi.marcotinacci.thesis.seal.seal.Quantifier;
import unifi.marcotinacci.thesis.seal.seal.Range;
import unifi.marcotinacci.thesis.seal.seal.Rule;
import unifi.marcotinacci.thesis.seal.seal.Type;
import unifi.marcotinacci.thesis.seal.seal.Update;
import unifi.marcotinacci.thesis.seal.seal.VariableDeclaration;
import unifi.marcotinacci.thesis.seal.utils.Commons;

@SuppressWarnings("all")
public class SealGenerator implements IGenerator {
  private List<ModuleDefine> modules;
  
  private int moduleCounter;
  
  private Hashtable<String,Integer> renaming;
  
  private Environment env;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    try {
      LinkedList<ModuleDefine> _linkedList = new LinkedList<ModuleDefine>();
      this.modules = _linkedList;
      Hashtable<String,Integer> _hashtable = new Hashtable<String,Integer>();
      this.renaming = _hashtable;
      int _minus = (-1);
      this.moduleCounter = _minus;
      EList<EObject> _contents = resource.getContents();
      EObject _get = _contents.get(0);
      Program p = ((Program) _get);
      boolean _isIsEmptyEnv = p.isIsEmptyEnv();
      if (_isIsEmptyEnv) {
        this.env = null;
      } else {
        Environment _environment = p.getEnvironment();
        this.env = _environment;
      }
      CharSequence _prismCompile = this.prismCompile(p);
      fsa.generateFile("model.pm", _prismCompile);
      FormulaHandler _formulaHandler = new FormulaHandler(resource);
      FormulaHandler fh = _formulaHandler;
      this.moduleCounter = 0;
      EList<ModuleDefine> _modules = p.getModules();
      ModuleDefine _get_1 = _modules.get(0);
      EList<Expression> _never = _get_1.getNever();
      Expression _get_2 = _never.get(0);
      CharSequence _prismCompileExpression = this.prismCompileExpression(_get_2);
      String _string = _prismCompileExpression.toString();
      fh.execModelCheck(_string);
      String _srcGenURI = Commons.getSrcGenURI(resource);
      String _plus = (_srcGenURI + "hashmap.ser");
      FileOutputStream _fileOutputStream = new FileOutputStream(_plus);
      ObjectOutputStream _objectOutputStream = new ObjectOutputStream(_fileOutputStream);
      ObjectOutputStream objOut = _objectOutputStream;
      HashMap<List<Integer>,HashMap<List<Integer>,Double>> _index = fh.getIndex();
      objOut.writeObject(_index);
      objOut.close();
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public CharSequence prismCompile(final Program p) {
    CharSequence _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("mdp");
      _builder.newLine();
      _builder.newLine();
      _builder.append("// === MODULES ===");
      _builder.newLine();
      EList<ModuleDefine> _modules = p.getModules();
      ModuleDefine _get = _modules.get(0);
      CharSequence _prismCompile = this.prismCompile(_get);
      _builder.append(_prismCompile, "");
      _builder.newLineIfNotEmpty();
      CharSequence tpl = _builder;
      boolean _isIsEmptyEnv = p.isIsEmptyEnv();
      boolean _not = (!_isIsEmptyEnv);
      if (_not) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(tpl, "");
        _builder_1.newLineIfNotEmpty();
        {
          Environment _environment = p.getEnvironment();
          EList<ModuleDefine> _modules_1 = _environment.getModules();
          for(final ModuleDefine m : _modules_1) {
            CharSequence _prismCompile_1 = this.prismCompile(m);
            _builder_1.append(_prismCompile_1, "");
            _builder_1.newLineIfNotEmpty();
          }
        }
        tpl = _builder_1;
      }
      _xblockexpression = (tpl);
    }
    return _xblockexpression;
  }
  
  public CharSequence prismCompile(final ModuleDefine m) {
    CharSequence _xblockexpression = null;
    {
      int _plus = (this.moduleCounter + 1);
      this.moduleCounter = _plus;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module module_");
      _builder.append(this.moduleCounter, "");
      _builder.newLineIfNotEmpty();
      _builder.append("// variables");
      _builder.newLine();
      {
        EList<VariableDeclaration> _variables = m.getVariables();
        for(final VariableDeclaration v : _variables) {
          CharSequence _prismCompile = this.prismCompile(v);
          _builder.append(_prismCompile, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("// rules");
      _builder.newLine();
      {
        EList<Rule> _rules = m.getRules();
        for(final Rule r : _rules) {
          CharSequence _prismCompile_1 = this.prismCompile(r);
          _builder.append(_prismCompile_1, "");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("endmodule");
      _builder.newLine();
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public CharSequence prismCompile(final VariableDeclaration v) {
    CharSequence _xblockexpression = null;
    {
      int from = 0;
      int to = 1;
      int delta = 1;
      EObject _eContainer = v.eContainer();
      EObject _eContainer_1 = _eContainer.eContainer();
      EList<Range> _ranges = ((Program) _eContainer_1).getRanges();
      for (final Range r : _ranges) {
        VariableDeclaration _variable = r.getVariable();
        boolean _equals = Objects.equal(_variable, v);
        if (_equals) {
          String _to = r.getTo();
          int _parseInt = Integer.parseInt(_to);
          to = _parseInt;
          String _from = r.getFrom();
          int _parseInt_1 = Integer.parseInt(_from);
          from = _parseInt_1;
          String _delta = r.getDelta();
          boolean _notEquals = (!Objects.equal(_delta, null));
          if (_notEquals) {
            String _delta_1 = r.getDelta();
            int _parseInt_2 = Integer.parseInt(_delta_1);
            delta = _parseInt_2;
          }
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _localName = this.localName(v);
      _builder.append(_localName, "");
      _builder.append(" : ");
      {
        Type _type = v.getType();
        String _name = _type.getName();
        boolean _equals_1 = _name.equals("bool");
        if (_equals_1) {
          _builder.append("bool init ");
          Expression _expr = v.getExpr();
          CharSequence _prismCompileExpression = this.prismCompileExpression(_expr);
          _builder.append(_prismCompileExpression, "");
          _builder.append(";");
        }
      }
      {
        Type _type_1 = v.getType();
        String _name_1 = _type_1.getName();
        boolean _equals_2 = _name_1.equals("int");
        if (_equals_2) {
          _builder.append("[");
          _builder.append(from, "");
          _builder.append("..");
          _builder.append(to, "");
          _builder.append("] init ");
          Expression _expr_1 = v.getExpr();
          CharSequence _prismCompileExpression_1 = this.prismCompileExpression(_expr_1);
          _builder.append(_prismCompileExpression_1, "");
          _builder.append(";");
        }
      }
      {
        Type _type_2 = v.getType();
        String _name_2 = _type_2.getName();
        boolean _equals_3 = _name_2.equals("float");
        if (_equals_3) {
          _builder.append("[0..floor((");
          _builder.append(to, "");
          _builder.append("-");
          _builder.append(from, "");
          _builder.append(")/");
          _builder.append(delta, "");
          _builder.append(")] init ceil((");
          Expression _expr_2 = v.getExpr();
          CharSequence _prismCompileExpression_2 = this.prismCompileExpression(_expr_2);
          _builder.append(_prismCompileExpression_2, "");
          _builder.append("-");
          _builder.append(from, "");
          _builder.append(")/");
          _builder.append(delta, "");
          _builder.append(");");
        }
      }
      _xblockexpression = (_builder);
    }
    return _xblockexpression;
  }
  
  public CharSequence prismCompile(final Rule r) {
    CharSequence _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("[");
      Action _action = r.getAction();
      String _name = _action.getName();
      _builder.append(_name, "");
      _builder.append("] ");
      Expression _cond = r.getCond();
      CharSequence _prismCompileExpression = this.prismCompileExpression(_cond);
      _builder.append(_prismCompileExpression, "");
      final CharSequence baseCondition = _builder;
      StringConcatenation _builder_1 = new StringConcatenation();
      {
        EList<NDCase> _ndCases = r.getNdCases();
        for(final NDCase ndcase : _ndCases) {
          {
            EList<Case> _cases = ndcase.getCases();
            List<Case> _reduced = this.getReduced(_cases);
            List<List<Case>> _allCombinations = this.getAllCombinations(_reduced);
            boolean _hasElements = false;
            for(final List<Case> comb : _allCombinations) {
              if (!_hasElements) {
                _hasElements = true;
              } else {
                _builder_1.appendImmediate(";", "");
              }
              _builder_1.append(baseCondition, "");
              _builder_1.newLineIfNotEmpty();
              {
                EList<Case> _cases_1 = ndcase.getCases();
                final Function1<Case,Boolean> _function = new Function1<Case,Boolean>() {
                    public Boolean apply(final Case c) {
                      boolean _isHasCondition = c.isHasCondition();
                      return Boolean.valueOf(_isHasCondition);
                    }
                  };
                Iterable<Case> _filter = IterableExtensions.<Case>filter(_cases_1, _function);
                boolean _hasElements_1 = false;
                for(final Case c : _filter) {
                  if (!_hasElements_1) {
                    _hasElements_1 = true;
                    _builder_1.append("&", "");
                  } else {
                    _builder_1.appendImmediate("&", "");
                  }
                  {
                    boolean _contains = comb.contains(c);
                    boolean _not = (!_contains);
                    if (_not) {
                      _builder_1.append("!");
                    }
                  }
                  _builder_1.append("(");
                  Expression _cond_1 = c.getCond();
                  CharSequence _prismCompileExpression_1 = this.prismCompileExpression(_cond_1);
                  _builder_1.append(_prismCompileExpression_1, "");
                  _builder_1.append(")");
                  _builder_1.newLineIfNotEmpty();
                  _builder_1.append("\t\t\t\t");
                }
              }
              _builder_1.append(" -> ");
              _builder_1.newLineIfNotEmpty();
              {
                boolean _and = false;
                int _size = comb.size();
                boolean _equals = (_size == 0);
                if (!_equals) {
                  _and = false;
                } else {
                  EList<Case> _cases_2 = ndcase.getCases();
                  final Function1<Case,Boolean> _function_1 = new Function1<Case,Boolean>() {
                      public Boolean apply(final Case c) {
                        boolean _isHasCondition = c.isHasCondition();
                        boolean _not = (!_isHasCondition);
                        return Boolean.valueOf(_not);
                      }
                    };
                  Iterable<Case> _filter_1 = IterableExtensions.<Case>filter(_cases_2, _function_1);
                  int _size_1 = IterableExtensions.size(_filter_1);
                  boolean _equals_1 = (_size_1 == 0);
                  _and = (_equals && _equals_1);
                }
                if (_and) {
                  _builder_1.append(" 1 : true");
                  _builder_1.newLineIfNotEmpty();
                } else {
                  {
                    EList<Case> _cases_3 = ndcase.getCases();
                    final Function1<Case,Boolean> _function_2 = new Function1<Case,Boolean>() {
                        public Boolean apply(final Case c) {
                          boolean _or = false;
                          boolean _isHasCondition = c.isHasCondition();
                          boolean _not = (!_isHasCondition);
                          if (_not) {
                            _or = true;
                          } else {
                            boolean _contains = comb.contains(c);
                            _or = (_not || _contains);
                          }
                          return Boolean.valueOf(_or);
                        }
                      };
                    Iterable<Case> _filter_2 = IterableExtensions.<Case>filter(_cases_3, _function_2);
                    boolean _hasElements_2 = false;
                    for(final Case c_1 : _filter_2) {
                      if (!_hasElements_2) {
                        _hasElements_2 = true;
                      } else {
                        _builder_1.appendImmediate("+", "");
                      }
                      _builder_1.append("(");
                      Expression _weight = c_1.getWeight();
                      CharSequence _prismCompileExpression_2 = this.prismCompileExpression(_weight);
                      _builder_1.append(_prismCompileExpression_2, "");
                      _builder_1.append(")/(");
                      CharSequence _talWeight = this.totalWeight(ndcase, comb);
                      _builder_1.append(_talWeight, "");
                      _builder_1.append(") : ");
                      _builder_1.newLineIfNotEmpty();
                      {
                        EList<Update> _update = c_1.getUpdate();
                        boolean _hasElements_3 = false;
                        for(final Update u : _update) {
                          if (!_hasElements_3) {
                            _hasElements_3 = true;
                          } else {
                            _builder_1.appendImmediate("&", "");
                          }
                          CharSequence _prismCompileUpdate = this.prismCompileUpdate(u);
                          _builder_1.append(_prismCompileUpdate, "");
                          _builder_1.newLineIfNotEmpty();
                        }
                      }
                    }
                  }
                }
              }
            }
            if (_hasElements) {
              _builder_1.append(";", "");
            }
          }
        }
      }
      _xblockexpression = (_builder_1);
    }
    return _xblockexpression;
  }
  
  /**
   * precondition: list 'cases' contains only cases with condition
   */
  public List<List<Case>> getAllCombinations(final List<Case> cases) {
    List<List<Case>> combList = CollectionLiterals.<List<Case>>newArrayList();
    boolean _isEmpty = cases.isEmpty();
    if (_isEmpty) {
      ArrayList<Case> _newArrayList = CollectionLiterals.<Case>newArrayList();
      combList.add(_newArrayList);
      return combList;
    }
    Case head = cases.get(0);
    int _size = cases.size();
    List<Case> tail = cases.subList(1, _size);
    List<List<Case>> _allCombinations = this.getAllCombinations(tail);
    for (final List<Case> comb : _allCombinations) {
      {
        List<Case> newComb = CollectionLiterals.<Case>newArrayList();
        newComb.add(head);
        newComb.addAll(comb);
        combList.add(comb);
        combList.add(newComb);
      }
    }
    return combList;
  }
  
  public List<Case> getReduced(final List<Case> cases) {
    List<Case> reduced = CollectionLiterals.<Case>newArrayList();
    for (final Case c : cases) {
      boolean _isHasCondition = c.isHasCondition();
      if (_isHasCondition) {
        reduced.add(c);
      }
    }
    return reduced;
  }
  
  public CharSequence totalWeight(final NDCase ndcase, final List<Case> comb) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Case> _cases = ndcase.getCases();
      final Function1<Case,Boolean> _function = new Function1<Case,Boolean>() {
          public Boolean apply(final Case c) {
            boolean _or = false;
            boolean _isHasCondition = c.isHasCondition();
            boolean _not = (!_isHasCondition);
            if (_not) {
              _or = true;
            } else {
              boolean _contains = comb.contains(c);
              _or = (_not || _contains);
            }
            return Boolean.valueOf(_or);
          }
        };
      Iterable<Case> _filter = IterableExtensions.<Case>filter(_cases, _function);
      boolean _hasElements = false;
      for(final Case c : _filter) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("+", "");
        }
        _builder.append("(");
        Expression _weight = c.getWeight();
        CharSequence _prismCompileExpression = this.prismCompileExpression(_weight);
        _builder.append(_prismCompileExpression, "");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _prismCompileUpdate(final NoAction n) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("true");
    return _builder;
  }
  
  protected CharSequence _prismCompileUpdate(final Assign a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    VariableDeclaration _variable = a.getVariable();
    CharSequence _localName = this.localName(_variable);
    _builder.append(_localName, "");
    _builder.append("\'=");
    Expression _expr = a.getExpr();
    CharSequence _prismCompileExpression = this.prismCompileExpression(_expr);
    _builder.append(_prismCompileExpression, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _prismCompileExpression(final And e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Expression _left = e.getLeft();
    CharSequence _prismCompileExpression = this.prismCompileExpression(_left);
    _builder.append(_prismCompileExpression, "");
    _builder.append(" & ");
    Expression _right = e.getRight();
    CharSequence _prismCompileExpression_1 = this.prismCompileExpression(_right);
    _builder.append(_prismCompileExpression_1, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _prismCompileExpression(final Or e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Expression _left = e.getLeft();
    CharSequence _prismCompileExpression = this.prismCompileExpression(_left);
    _builder.append(_prismCompileExpression, "");
    _builder.append(" | ");
    Expression _right = e.getRight();
    CharSequence _prismCompileExpression_1 = this.prismCompileExpression(_right);
    _builder.append(_prismCompileExpression_1, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _prismCompileExpression(final Not e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("!(");
    Expression _cond = e.getCond();
    CharSequence _prismCompileExpression = this.prismCompileExpression(_cond);
    _builder.append(_prismCompileExpression, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _prismCompileExpression(final Leq e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Expression _left = e.getLeft();
    CharSequence _prismCompileExpression = this.prismCompileExpression(_left);
    _builder.append(_prismCompileExpression, "");
    _builder.append(" <= ");
    Expression _right = e.getRight();
    CharSequence _prismCompileExpression_1 = this.prismCompileExpression(_right);
    _builder.append(_prismCompileExpression_1, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _prismCompileExpression(final Less e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Expression _left = e.getLeft();
    CharSequence _prismCompileExpression = this.prismCompileExpression(_left);
    _builder.append(_prismCompileExpression, "");
    _builder.append(" < ");
    Expression _right = e.getRight();
    CharSequence _prismCompileExpression_1 = this.prismCompileExpression(_right);
    _builder.append(_prismCompileExpression_1, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _prismCompileExpression(final Geq e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Expression _left = e.getLeft();
    CharSequence _prismCompileExpression = this.prismCompileExpression(_left);
    _builder.append(_prismCompileExpression, "");
    _builder.append(" >= ");
    Expression _right = e.getRight();
    CharSequence _prismCompileExpression_1 = this.prismCompileExpression(_right);
    _builder.append(_prismCompileExpression_1, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _prismCompileExpression(final Gtr e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Expression _left = e.getLeft();
    CharSequence _prismCompileExpression = this.prismCompileExpression(_left);
    _builder.append(_prismCompileExpression, "");
    _builder.append(" > ");
    Expression _right = e.getRight();
    CharSequence _prismCompileExpression_1 = this.prismCompileExpression(_right);
    _builder.append(_prismCompileExpression_1, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _prismCompileExpression(final Eq e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Expression _left = e.getLeft();
    CharSequence _prismCompileExpression = this.prismCompileExpression(_left);
    _builder.append(_prismCompileExpression, "");
    _builder.append(" = ");
    Expression _right = e.getRight();
    CharSequence _prismCompileExpression_1 = this.prismCompileExpression(_right);
    _builder.append(_prismCompileExpression_1, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _prismCompileExpression(final Neq e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("!(");
    Expression _left = e.getLeft();
    CharSequence _prismCompileExpression = this.prismCompileExpression(_left);
    _builder.append(_prismCompileExpression, "");
    _builder.append(" = ");
    Expression _right = e.getRight();
    CharSequence _prismCompileExpression_1 = this.prismCompileExpression(_right);
    _builder.append(_prismCompileExpression_1, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _prismCompileExpression(final Plus e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Expression _left = e.getLeft();
    CharSequence _prismCompileExpression = this.prismCompileExpression(_left);
    _builder.append(_prismCompileExpression, "");
    _builder.append(" + ");
    Expression _right = e.getRight();
    CharSequence _prismCompileExpression_1 = this.prismCompileExpression(_right);
    _builder.append(_prismCompileExpression_1, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _prismCompileExpression(final Minus e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Expression _left = e.getLeft();
    CharSequence _prismCompileExpression = this.prismCompileExpression(_left);
    _builder.append(_prismCompileExpression, "");
    _builder.append(" - ");
    Expression _right = e.getRight();
    CharSequence _prismCompileExpression_1 = this.prismCompileExpression(_right);
    _builder.append(_prismCompileExpression_1, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _prismCompileExpression(final Multi e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Expression _left = e.getLeft();
    CharSequence _prismCompileExpression = this.prismCompileExpression(_left);
    _builder.append(_prismCompileExpression, "");
    _builder.append(" * ");
    Expression _right = e.getRight();
    CharSequence _prismCompileExpression_1 = this.prismCompileExpression(_right);
    _builder.append(_prismCompileExpression_1, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _prismCompileExpression(final Div e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Expression _left = e.getLeft();
    CharSequence _prismCompileExpression = this.prismCompileExpression(_left);
    _builder.append(_prismCompileExpression, "");
    _builder.append(" / ");
    Expression _right = e.getRight();
    CharSequence _prismCompileExpression_1 = this.prismCompileExpression(_right);
    _builder.append(_prismCompileExpression_1, "");
    _builder.append(")");
    return _builder;
  }
  
  protected CharSequence _prismCompileExpression(final Literal e) {
    String _value = e.getValue();
    return _value;
  }
  
  protected CharSequence _prismCompileExpression(final LocalReference e) {
    StringConcatenation _builder = new StringConcatenation();
    VariableDeclaration _variable = e.getVariable();
    CharSequence _localName = this.localName(_variable);
    _builder.append(_localName, "");
    return _builder;
  }
  
  protected CharSequence _prismCompileExpression(final ExternalReference e) {
    StringConcatenation _builder = new StringConcatenation();
    VariableDeclaration _variable = e.getVariable();
    String _name = _variable.getName();
    _builder.append(_name, "");
    _builder.append("_");
    Quantifier _module = e.getModule();
    String _name_1 = _module.getName();
    Integer _get = this.renaming.get(_name_1);
    _builder.append(_get, "");
    return _builder;
  }
  
  protected CharSequence _prismCompileExpression(final Quantifier e) {
    CharSequence _xblockexpression = null;
    {
      int i = 1;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("false");
      CharSequence tpl = _builder;
      EList<ModuleDefine> _modules = this.env.getModules();
      for (final ModuleDefine m : _modules) {
        {
          String _name = m.getName();
          ModuleDefine _module = e.getModule();
          String _name_1 = _module.getName();
          boolean _equals = _name.equals(_name_1);
          if (_equals) {
            String _name_2 = e.getName();
            this.renaming.put(_name_2, Integer.valueOf(i));
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("(");
            _builder_1.append(tpl, "");
            _builder_1.append(" | ");
            Expression _cond = e.getCond();
            CharSequence _prismCompileExpression = this.prismCompileExpression(_cond);
            _builder_1.append(_prismCompileExpression, "");
            _builder_1.append(")");
            tpl = _builder_1;
            String _name_3 = e.getName();
            this.renaming.remove(_name_3);
          }
          int _plus = (i + 1);
          i = _plus;
        }
      }
      _xblockexpression = (tpl);
    }
    return _xblockexpression;
  }
  
  public CharSequence localName(final VariableDeclaration v) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = v.getName();
    _builder.append(_name, "");
    _builder.append("_");
    _builder.append(this.moduleCounter, "");
    return _builder;
  }
  
  public CharSequence prismCompileUpdate(final Update a) {
    if (a instanceof Assign) {
      return _prismCompileUpdate((Assign)a);
    } else if (a instanceof NoAction) {
      return _prismCompileUpdate((NoAction)a);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(a).toString());
    }
  }
  
  public CharSequence prismCompileExpression(final Expression e) {
    if (e instanceof And) {
      return _prismCompileExpression((And)e);
    } else if (e instanceof Div) {
      return _prismCompileExpression((Div)e);
    } else if (e instanceof Eq) {
      return _prismCompileExpression((Eq)e);
    } else if (e instanceof ExternalReference) {
      return _prismCompileExpression((ExternalReference)e);
    } else if (e instanceof Geq) {
      return _prismCompileExpression((Geq)e);
    } else if (e instanceof Gtr) {
      return _prismCompileExpression((Gtr)e);
    } else if (e instanceof Leq) {
      return _prismCompileExpression((Leq)e);
    } else if (e instanceof Less) {
      return _prismCompileExpression((Less)e);
    } else if (e instanceof Literal) {
      return _prismCompileExpression((Literal)e);
    } else if (e instanceof LocalReference) {
      return _prismCompileExpression((LocalReference)e);
    } else if (e instanceof Minus) {
      return _prismCompileExpression((Minus)e);
    } else if (e instanceof Multi) {
      return _prismCompileExpression((Multi)e);
    } else if (e instanceof Neq) {
      return _prismCompileExpression((Neq)e);
    } else if (e instanceof Not) {
      return _prismCompileExpression((Not)e);
    } else if (e instanceof Or) {
      return _prismCompileExpression((Or)e);
    } else if (e instanceof Plus) {
      return _prismCompileExpression((Plus)e);
    } else if (e instanceof Quantifier) {
      return _prismCompileExpression((Quantifier)e);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(e).toString());
    }
  }
}
