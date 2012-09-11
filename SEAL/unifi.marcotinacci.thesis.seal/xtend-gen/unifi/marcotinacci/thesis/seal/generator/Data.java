package unifi.marcotinacci.thesis.seal.generator;

import unifi.marcotinacci.thesis.seal.seal.VariableDeclaration;

@SuppressWarnings("all")
public class Data {
  private VariableDeclaration _v;
  
  private int _from;
  
  private int _to;
  
  public Data(final VariableDeclaration v, final int from, final int to) {
    this._v = v;
    this._from = from;
    this._to = to;
  }
  
  public Data(final VariableDeclaration v, final double from, final double to, final double delta) {
    this._v = v;
    this._from = 0;
    double _minus = (to - from);
    double _divide = (_minus / delta);
    double _floor = Math.floor(_divide);
    this._to = ((int) _floor);
  }
}
