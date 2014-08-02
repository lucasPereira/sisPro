package br.dominioL.sisPro.dominio;

import br.dominioL.estruturados.json.Json;
import br.dominioL.estruturados.json.ObjetoJson;
import br.dominioL.sisPro.dominio.interfaces.MapeavelParaOCouch;
import br.dominioL.sisPro.dominio.interfaces.RepresentavelComoJson;
import br.dominioL.sisPro.dominio.interfaces.Validavel;

public abstract class Entidade<T extends Entidade<T>> implements MapeavelParaOCouch<T>, RepresentavelComoJson, Validavel {
	protected ObjetoJson dados;

	public Entidade() {
		this(Json.criarObjeto());
	}

	public Entidade(ObjetoJson dados) {
		this.dados = dados;
	}

	@Override
	public final ObjetoJson comoJson() {
		return dados;
	}

	@Override
	public final void fixarDados(ObjetoJson dados) {
		this.dados = dados;
	}
}