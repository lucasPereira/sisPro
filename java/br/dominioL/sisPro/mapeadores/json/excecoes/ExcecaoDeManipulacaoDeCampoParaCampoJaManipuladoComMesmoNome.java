package br.dominioL.sisPro.mapeadores.json.excecoes;

public class ExcecaoDeManipulacaoDeCampoParaCampoJaManipuladoComMesmoNome extends RuntimeException {
	private static final long serialVersionUID = -2009462502867902256L;
	
	public ExcecaoDeManipulacaoDeCampoParaCampoJaManipuladoComMesmoNome() {
		super("O novo campo não pode já ter sido renomeado ou clonado.");
	}
}
