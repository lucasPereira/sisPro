package br.dominioL.sisPro.infraestrutura.mapeadores.json.excecoes;

public final class ExcecaoDeMapeamentoComCampoInexistente extends RuntimeException {

	private static final long serialVersionUID = -867881985775075440L;

	public ExcecaoDeMapeamentoComCampoInexistente() {
		super("O campo não existe na origem para que possa ser mapeado.");
	}

}