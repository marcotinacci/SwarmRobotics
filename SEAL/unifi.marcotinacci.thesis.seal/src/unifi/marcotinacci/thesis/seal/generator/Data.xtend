package unifi.marcotinacci.thesis.seal.generator

import unifi.marcotinacci.thesis.seal.seal.VariableDeclaration

class Data {
	private VariableDeclaration _v
	private int _from
	private int _to
	
	new(VariableDeclaration v, int from, int to) {
		_v = v
		_from = from
		_to = to
	}
	
	new(VariableDeclaration v, double from, double to, double delta) {
		_v = v
		_from = 0
		_to = Math::floor((to - from) / delta) as int
	}
	
}